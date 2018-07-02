package src.exercicio05;

import execicio01.ExercicioBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Exercicio05 implements ExercicioBaseInterface{
    
    private JLabel jLabelNumero01,jLabelNumero02,jLabelResultado;
    private JTextField jTexFieldNumero01,jTextFieldNumero02;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar, jButtonMultiplicar,jButtonDividir,jButtonSubtrair;
    private JFrame jFrame;
    
public Exercicio05 (){
   gerarTela();
   instaciarComponentes();
   adicionarComponenestes();
   gerarDimensoes();
   gerarLocalizacoes();
   jFrame.setVisible(true);
}
@Override
    public void gerarTela() {
        jFrame = new JFrame("Exercicio 05");
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(445,310 );
        
    }
    @Override
    public void instaciarComponentes() {
        jLabelNumero01 = new JLabel("1° numero");
        jLabelNumero02 = new JLabel("2 ° numero");
        jLabelResultado = new JLabel("Resultado");
        jTexFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
        jTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane(jTextAreaResultado);
        jButtonDividir = new JButton("/");
        jButtonMultiplicar = new JButton("*");
        jButtonSomar= new JButton("+");
        jButtonSubtrair = new JButton("-");
    }

    @Override
    public void adicionarComponenestes() {
        jFrame.add(jButtonDividir);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jScrollPaneResultado);
        jFrame.add(jTexFieldNumero01);
        jFrame.add(jTextFieldNumero02);
        
    }

    @Override
    public void gerarDimensoes() {
        jButtonDividir.setSize(70,25);
        jButtonMultiplicar.setSize(70,25);
        jButtonSomar.setSize(70,25);
        jButtonSubtrair.setSize(70,25);
        jLabelNumero01.setSize(70,25);
        jLabelNumero02.setSize(70,25);
        jLabelResultado.setSize(70,25);
        jTexFieldNumero01.setSize(70,25);
        jTextFieldNumero02.setSize(70,25);
        jScrollPaneResultado.setSize(240, 240);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(10,10);
        jLabelNumero02.setLocation(90,10);
        jTexFieldNumero01.setLocation(10,30);
        jTextFieldNumero02.setLocation(90,30);
        jButtonDividir.setLocation(10,60);
        jButtonMultiplicar.setLocation(90,60);
        jButtonSomar.setLocation(10,90);
        jButtonSubtrair.setLocation(90,90);
        jLabelResultado.setLocation(180,0);
        jScrollPaneResultado.setLocation(180,30);
    }
    
}
