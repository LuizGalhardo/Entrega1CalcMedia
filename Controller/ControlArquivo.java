/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.File;
import javax.swing.JFileChooser;


public abstract class ControlArquivo {
    protected File arquivo = null;
    public abstract boolean ler();
    public abstract boolean escrever(boolean append);
    
    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(String TextoBotao) {
        arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }     
    }
}
