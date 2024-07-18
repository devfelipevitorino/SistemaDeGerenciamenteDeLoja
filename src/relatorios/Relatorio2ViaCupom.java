/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relatorios;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdbc.Conexaobanco;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Administrador
 */
public class Relatorio2ViaCupom {
    private Connection conn;

    public Relatorio2ViaCupom(int id) {
        this.conn = new Conexaobanco().pegarConexao();
        try {
            String jasper = "C:\\Users\\Administrador.DESKTOP-8COHQ5A\\Documents\\NetBeansProjects\\SoftwareLoja\\src\\relatorios\\rel2ViaCupom.jasper";
            Map<String, Object> param = new HashMap<>();
            param.put("id", id);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, param, conn);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
            jasperViewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
