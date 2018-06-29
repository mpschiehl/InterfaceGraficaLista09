

import execicio01.ExercicioBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class ChamaLista09 implements ExercicioBaseInterface{
    private JFrame jFrame;
   
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    public ChamaLista09(){
        gerarTela();
        instaciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponenestes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        jFrame.setVisible(true);
    }
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void instaciarComponentes() {
        jButton01 = new JButton("Exercio 01");
        jButton02 = new JButton("Exercio 02");
        jButton03 = new JButton("Exercio 03");
        jButton04 = new JButton("Exercio 04");
        jButton05 = new JButton("Exercio 05");
        jButton06 = new JButton("Exercio 06");
        jButton07 = new JButton("Exercio 07");
        jButton08 = new JButton("Exercio 08");
        jButton09 = new JButton("Exercio 09");
   
    }

    @Override
    public void adicionarComponenestes() {
        
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
        jButton09.setSize(100, 100); 
    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10, 10);
        jButton02.setLocation(120, 10);
        jButton03.setLocation(230, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(10, 230);
        jButton08.setLocation(120, 230);
        jButton09.setLocation(230, 230);
    }

  

    private void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new execicio01.Exercicio01();
            }
        }); 
    }

    private void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new exercicio02.Exercicio02();
            }
        });
    }

    private void acaoJButton03() {
        
    }

    private void acaoJButton04() {
        
    }

    private void acaoJButton05() {
        
    }

    private void acaoJButton06() {
        
    }

    private void acaoJButton07() {
        
    }

    private void acaoJButton08() {
        
    }

    private void acaoJButton09() {
        
    }
    
}
