/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import execicio01.ExercicioBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Exercicio02 implements ExercicioBaseInterface{
    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelresultado;
    private JButton jButtonTabuada;
    private JTextField jTextFieldNumero;
    
    public Exercicio02(){
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
        jFrame = new JFrame("Exercicio 02");
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(260,160);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void instaciarComponentes() {
       jButtonTabuada = new JButton("Tabuada");
       jLabelNumero = new JLabel("Numero");
       jTextFieldNumero = new JTextField();
       jLabelresultado = new JLabel();
    }

    @Override
    public void adicionarComponenestes() {
        jFrame.add(jButtonTabuada);
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jLabelresultado);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100,20);
        jTextFieldNumero.setSize(230,20);
        jButtonTabuada.setSize(230,20);
        jLabelresultado.setSize(100,20);
    }
                
                
    public void acaoBotao(){
        jButtonTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNumero.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Dever ser Informado Um Numero","Exercicio 02",
                        JOptionPane.ERROR_MESSAGE);
                jTextFieldNumero.requestFocus();
                return;
                }
                
                try{
              double numero = Double.parseDouble(jTextFieldNumero.getText())*50;
               jLabelresultado.setText(jTextFieldNumero.getText() + " x 50 = " + numero);
            
                }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,
                        "Dever ser Informado Um Numero teste","Exercicio 02",
                        JOptionPane.ERROR_MESSAGE);
                return;
                
                }
            }
        });
                    
                    
    }

    @Override
    public void gerarLocalizacoes() {
       jLabelNumero.setLocation(100,10);
      
       jTextFieldNumero.setLocation(10,35);
       
       jButtonTabuada.setLocation(10,60);
       
       jLabelresultado.setLocation(100,90);
       
    }
    
}
