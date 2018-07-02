/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.exercicio04;

import execicio01.ExercicioBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        acaoBotao();
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
    public void acaoBotao(){
        jButtonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String texto = " ";
                texto = jTextFieldNumero.getText();
                int numero = Integer.parseInt(jTextFieldNumero.getText());
                if(numero%2 == 0){
                    texto +=" é par ";
                    
                }
                if(numero%2 !=0){
                    texto +=" é impar ";
                }
                if(numero ==0){
                    texto +=" tambem é um numero neutro ";
                    
                }
                if(numero<0){
                    texto +=" tambem é um numero negativo ";
                    
                }
                if(numero>0){
                    texto +=" também é um numero positivo ";
                }
                    JOptionPane.showMessageDialog(null,texto,"Exercicio 04",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    @Override
    public void gerarLocalizacoes() {
           jLabelNumero.setLocation(10,10);
      
       jTextFieldNumero.setLocation(10,40);
       
       jButtonVerificar.setLocation(10,70);
       
    
    }
    
}
