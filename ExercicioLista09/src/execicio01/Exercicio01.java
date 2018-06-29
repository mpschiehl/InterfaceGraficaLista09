/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio01;

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
public class Exercicio01 implements ExercicioBaseInterface{
    private JFrame jFrame;
    private JLabel jLabelNome , jLabelSobreNome,jLabelresultado;
    private JTextField jTextFieldNome,jTextFieldSobreNome;
    private JButton jButtonContatenar;
    public Exercicio01(){
        gerarTela();
        instaciarComponentes();
        adicionarComponenestes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoBotaocontatena();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(260,160);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        
        
    }

    @Override
    public void instaciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobreNome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobreNome = new JTextField();
        jButtonContatenar = new JButton("Concatenar");
        jLabelresultado = new JLabel();
    }

    @Override
    public void adicionarComponenestes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobreNome);
        jFrame.add(jLabelresultado);

        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobreNome);
        jFrame.add(jButtonContatenar);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(70,20);
        jLabelSobreNome.setSize(70,20);
        jLabelresultado.setSize(230,20);
        
        jTextFieldNome.setSize(110,20);
        jTextFieldSobreNome.setSize(110,20);
        jButtonContatenar.setSize(230,20);
    }

    @Override
    public void gerarLocalizacoes() {
       jLabelNome.setLocation(10,10);
       jLabelSobreNome.setLocation(130,10);
       jTextFieldNome.setLocation(10,35);
       jTextFieldSobreNome.setLocation(130,35);
       jButtonContatenar.setLocation(10,60);
       jLabelresultado.setLocation(10,90);
    }
    public void acaoBotaocontatena(){
       jButtonContatenar.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               String nomeCompleto = ""; 
               String nome =jTextFieldNome.getText(),sobreNome = jTextFieldSobreNome.getText();
               if(nome.trim().isEmpty()){
                   JOptionPane.showMessageDialog(null, 
                           "O Nome deve ser preenchido","Exercicio01",
                           JOptionPane.ERROR_MESSAGE);
                   jTextFieldNome.requestFocus();
                   return;
               }
               
                           
               
               if(sobreNome.trim().isEmpty()){
                 JOptionPane.showMessageDialog(null, 
                           "O Sobrenome deve ser preenchido","Exercicio01",
                           JOptionPane.ERROR_MESSAGE);
                   jTextFieldSobreNome.requestFocus();
                   return; 
               }
               if(!nome.isEmpty()){
                   nomeCompleto += nome + " "; 
               }
               if(!sobreNome.isEmpty()){
                   nomeCompleto += sobreNome + " "; 
               }
               jLabelresultado.setText(nomeCompleto);
               
           }
       });
    }
    
}
