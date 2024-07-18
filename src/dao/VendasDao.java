/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexaobanco;
import model.Clientes;
import model.Vendas;

/**
 *
 * @author Administrador
 */
public class VendasDao {

    private final Connection conn;

    public VendasDao() {
        this.conn = new Conexaobanco().pegarConexao();
    }

    public void salvar(Vendas obj){
        try {
            String sql = "INSERT INTO tb_vendas (cliente_id, data_venda, total_venda,observacoes)"
                    + " VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getDataVenda());
            stmt.setDouble(3, obj.getTotalVenda());
            stmt.setString(4, obj.getObservacoes());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar a venda" + e);
        }
    }
    
    public int retornaUltimoIdVenda(){
        try {
            int ultimoId = 0;
            String sql = "SELECT MAX(id) id FROM tb_vendas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                ultimoId = v.getId();
            }
            return ultimoId;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao retornar o último id da venda");
        }
    }
    
    public List<Vendas>historicoVendas(LocalDate data_inicio, LocalDate data_fim){
        try {
            List<Vendas> lista = new ArrayList<>();
            String sql = "SELECT v.id, c.nome, date_format(v.data_venda, '%d/%m/%Y') as data_formatada, v.total_venda, v.observacoes "
                    + "FROM tb_vendas as v inner join tb_clientes as c on (v.cliente_id=c.id)"
                    + "WHERE v.data_venda BETWEEN ? and?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vendas v = new Vendas();
                Clientes c = new Clientes();
                v.setId(rs.getInt("v.id"));
                c.setNome(rs.getString("c.nome"));
                v.setCliente(c);
                v.setDataVenda(rs.getString("data_formatada"));
                v.setTotalVenda(rs.getDouble("v.total_venda"));
                v.setObservacoes(rs.getString("v.observacoes"));
                lista.add(v);
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException ("Erro ao buscar historico de vendas"+e);
        }
    }
    
    public double posicaoDia (LocalDate dataVenda){
        try {
            double totalDoDia = 0;
            String sql = "SELECT SUM(total_venda) AS total FROM tb_vendas WHERE data_venda=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, dataVenda.toString());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                totalDoDia = rs.getDouble("total");
            }
            return totalDoDia;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao retornar a posição do dia" + e);
        }
    }
}
    