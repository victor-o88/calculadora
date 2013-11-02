/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.swing.JFrame;

/**
 *
 * @author Administrador
 */
//public class EjCal {
public class Calculadora extends JFrame {
   public Calculadora() {
       super("Calculadora");
       setSize(300, 300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Ventana asis = new Ventana();
       add(asis);
       setResizable(false);
       setVisible(true);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora ventana = new Calculadora();
    }
}
