
import java.awt.EventQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Márcio Pedro Schiehl
 */
public class ChamaListaPrincipal {
     public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new ChamaLista09();
            }
        });
    }
}
