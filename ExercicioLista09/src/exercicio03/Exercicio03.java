/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import execicio01.ExercicioBaseInterface;
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
    
public Exercicio03(){
    gerarTela();
    instaciarComponentes();
    adicionarComponenestes();
    gerarDimensoes();
    gerarLocalizacoes();
    jFrame.setVisible(true);
}

    @Override
    public void gerarTela() {
       jFrame = new JFrame("Exercicio 03");
       jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
       jFrame.setLayout(null);
       jFrame.setSize(320,320);
       jFrame.setResizable(false);
       jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void instaciarComponentes() {
      jLabelNumero = new JLabel("Numero");
        jLabelTabuada = new JLabel("Tabuada");
       /* jTexFieldNumero
        jTextAreaTabuada
        jScrollPaneTabuada
     //   */
    }

    @Override
    public void adicionarComponenestes() {
        
    }

    @Override
    public void gerarDimensoes() {
        
    }

    @Override
    public void gerarLocalizacoes() {
        
    }
    
}
