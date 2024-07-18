/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexaobanco;
import model.ItensVendas;
import model.Produtos;

/**
 *
 * @author Administrador
 */
public class ItensVendasDao {

    private final Connection conn;

    public ItensVendasDao() {
        this.conn = new Conexaobanco().pegarConexao();
    }

    public void salvar(ItensVendas obj) {

        try {
            String sql = "INSERT INTO tb_itensvendas (venda_id, produto_id, qtd, subtotal)"
                    + "VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getVendas().getId());
            stmt.setInt(2, obj.getProdutos().getId());
            stmt.setInt(3, obj.getQuantidade());
            stmt.setDouble(4, obj.getSubTotal());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar os itens da venda");
        }
    }
    
    public List<ItensVendas>listaItens(int venda_id){
        try {
            List<ItensVendas>lista = new ArrayList<>();
            String sql = "SELECT p.id,p.descricao, i.qtd, p.preco, i.subtotal FROM tb_itensvendas as i inner join tb_produtos "
                    + "as p on(i.produto_id=p.id) WHERE i.venda_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ItensVendas item = new ItensVendas();
                Produtos p = new Produtos();
                p.setId(rs.getInt("p.id"));
                item.setProdutos(p);
                p.setDescricao(rs.getString("p.descricao"));
                item.setProdutos(p);
                item.setQuantidade(rs.getInt("i.qtd"));
                p.setPreco(rs.getDouble("p.preco"));
                item.setProdutos(p);
                item.setSubTotal(rs.getInt("i.subtotal"));
                lista.add(item);
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException ("Erro ao criar a lista de itens "+e);
        }   
    }
}
