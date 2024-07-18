/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class TesteConexao {

    public static void main(String[] args) {
        try {
            new ConexaoBancoRelatorio().conecta();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados." + e);
        }
    }
}
