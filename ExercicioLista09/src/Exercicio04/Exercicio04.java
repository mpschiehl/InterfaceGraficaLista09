/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio04;

import execicio01.ExercicioBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Márcio Pedro Schiehl
 */
public class Exercicio04 implements ExercicioBaseInterface{
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JButton jButtonVerificar;
    private JTextField jTextFieldNumero;
    
    public Exercicio04(){
        gerarTela();
        instaciarComponentes();
        adicionarComponenestes();
        gerarDimensoes();
        gerarLocalizacoes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exercicio 04");
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(160,140);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
    
    }

    @Override
    public void instaciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jButtonVerificar = new JButton("Verificador");
        jTextFieldNumero = new JTextField();
    }

    @Override
    public void adicionarComponenestes() {
        jFrame.add(jButtonVerificar);
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
    }

    @Override
    public void gerarDimensoes() {
        jButtonVerificar.setSize(135,20);
        jLabelNumero.setSize(70, 20);
        jTextFieldNumero.setSize(135,20);
        
    }

    @Override
    public void gerarLocalizacoes() {
           jLabelNumero.setLocation(10,10);
      
       jTextFieldNumero.setLocation(10,40);
       
       jButtonVerificar.setLocation(10,70);
       
    
    }
    
}
