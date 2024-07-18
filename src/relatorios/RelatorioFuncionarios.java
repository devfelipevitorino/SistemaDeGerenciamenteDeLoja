/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relatorios;

import java.util.HashMap;
import javax.swing.JOptionPane;
import jdbc.ConexaoBancoRelatorio;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class RelatorioFuncionarios {
    
    ConexaoBancoRelatorio conexao = new ConexaoBancoRelatorio();
    
    public RelatorioFuncionarios() {
        try {
            conexao.conecta();
            conexao.executeSQL("select id, nome, concat(endereco, \",\",numero, \",\",bairro, \",\",cidade, \"-\",estado) as endereco from tb_funcionarios");
            JRResultSetDataSource jrRs = new JRResultSetDataSource(conexao.resultset);
            JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Administrador.DESKTOP-8COHQ5A\\Documents\\NetBeansProjects\\SoftwareLoja\\src\\relatorios\\relFuncionarios.jasper", new HashMap<>(), jrRs);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao iReport" + e);
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
