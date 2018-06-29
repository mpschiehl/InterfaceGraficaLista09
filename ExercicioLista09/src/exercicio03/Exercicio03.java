/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import execicio01.ExercicioBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Márcio Pedro Schiehl
 */
public class Exercicio03 implements ExercicioBaseInterface{
    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTexFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;
    
public Exercicio03(){
    gerarTela();
    instaciarComponentes();
    adicionarComponenestes();
    gerarDimensoes();
    gerarLocalizacoes();
    configurarJSCrollPane();
    //acaoBotao();
    jFrame.setVisible(true);
}

    @Override
    public void gerarTela() {
       jFrame = new JFrame("Exercicio 03");
       jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
       jFrame.setLayout(null);
       jFrame.setSize(360,360);
       jFrame.setResizable(false);
       jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void instaciarComponentes() {
      jLabelNumero = new JLabel("Numero");
       jLabelTabuada = new JLabel("Tabuada");
       jTexFieldNumero = new JTextField();
       jTextAreaTabuada = new JTextArea();
       jScrollPaneTabuada = new JScrollPane(jTextAreaTabuada);
       jButtonTabuada = new JButton("Tabuada");
    
    }

    @Override
    public void adicionarComponenestes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jLabelTabuada);
        jFrame.add(jTexFieldNumero);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonTabuada);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(70,20);
        jLabelTabuada.setSize(70,20);
        jScrollPaneTabuada.setSize(350,235);
        jTexFieldNumero.setSize(340,20);
        jButtonTabuada.setSize(340,20);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonTabuada.setLocation(7,51);
        jScrollPaneTabuada.setLocation(2,95);
        jLabelNumero.setLocation(7,7);
        jTexFieldNumero.setLocation(7,28);
        jLabelTabuada.setLocation(7,72);
    }

    private void configurarJSCrollPane() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy
        (jScrollPaneTabuada.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy
        (jScrollPaneTabuada.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }

    /*private void acaoBotao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
