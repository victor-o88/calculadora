/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class Ventana extends JPanel implements ActionListener{
    //Variables para operaciones
   double num1,num2,mem,resul;
   char oper;

       JLabel lb1=new JLabel("Calculadora: ");
       JLabel lb2=new JLabel("");
       JTextField tex=new JTextField("",15);
       JButton sum=new JButton("+");
       JButton res=new JButton("-");
       JButton mul=new JButton("*");
       JButton div=new JButton("/");
       JButton igual=new JButton("=");

   //los botones con los numeros
       JButton punto=new JButton(".");
       JButton n0=new JButton("0");
       JButton n1=new JButton("1");
       JButton n2=new JButton("2");
       JButton n3=new JButton("3");
       JButton n4=new JButton("4");
       JButton n5=new JButton("5");
       JButton n6=new JButton("6");
       JButton n7=new JButton("7");
       JButton n8=new JButton("8");
       JButton n9=new JButton("9");

   public Ventana() { //constructor de la clase Calculadora

       //creamos un panel para mostrar la etiqueta con el campo de
       //introducción de texto
      JPanel p1=new JPanel();
       p1.setLayout(new GridLayout(5,5));
       p1.add(lb1);
       p1.add(tex);
       p1.add(lb2);
       
       //creamos otro panel para mostrar los botones
       
       JPanel p2 = new JPanel();
       p2.setLayout(new GridLayout(4,4));
       //agregamos el evento ActionListener a cada uno de los botones
       //en este caso el evento es el de presionar un botón
       p2.add(n7);
       p2.add(n8);
       p2.add(n9);
       p2.add(sum);
       p2.add(n4);
       p2.add(n5);
       p2.add(n6);
       p2.add(res);
       p2.add(n1);
       p2.add(n2);
       p2.add(n3);
       p2.add(mul);
       p2.add(punto);
       p2.add(n0);
       p2.add(igual);  
       p2.add(div);
       
       //agregamos el evento ActionListener a cada uno de los botones
       n7.addActionListener(this);
       n8.addActionListener(this);
       n9.addActionListener(this);
       sum.addActionListener(this);
       n4.addActionListener(this);
       n5.addActionListener(this);
       n6.addActionListener(this);
       res.addActionListener(this);
       n1.addActionListener(this);
       n2.addActionListener(this);
       n3.addActionListener(this);
       mul.addActionListener(this);
       punto.addActionListener(this);
       n0.addActionListener(this);
       igual.addActionListener(this);
       div.addActionListener(this);
       
       //para organizar los paneles
       GridLayout gd = new GridLayout(5,5);
       this.setLayout(gd);
       add(p1);
 
       FlowLayout fl = new FlowLayout();
       this.setLayout(fl);
       add(p2);

   }
   //metodo de la Interface ActionListener que nos permite
   //manejar el evento de presionar un botón
   public void actionPerformed(ActionEvent e) {

       try{
       //creamos un objeto que nos permite manejar este evento
       //le agregamos a la variable el metodo getSource
       //que significa que esta va a manejar dicho evento
       Object fuente = e.getSource();
       String dt=tex.getText();
       //esta variable recupera lo del JTextField
       //validamos el botón que el usuario presiono
       if (fuente == n0) {
           tex.setText("");
           tex.setText(""+dt+n0.getText());
           
       } else if (fuente == n1) {
           tex.setText("");
           tex.setText(""+dt+n1.getText());
           
       }else if (fuente == n2) {
           tex.setText("");
           tex.setText(""+dt+n2.getText());
           
       }else if (fuente == n3) {
           tex.setText("");
           tex.setText(""+dt+n3.getText());
           
       }else if (fuente == n4) {
           tex.setText("");
           tex.setText(""+dt+n4.getText());
           
       }else if (fuente == n5) {
           tex.setText("");
           tex.setText(""+dt+n5.getText());
           
       }else if (fuente == n6) {
           tex.setText("");
           tex.setText(""+dt+n6.getText());
           
       }else if (fuente == n7) {
           tex.setText("");
           tex.setText(""+dt+n7.getText());
           
       }else if (fuente == n8) {
           tex.setText("");
           tex.setText(""+dt+n8.getText());
           
       }else if (fuente == n9) {
           tex.setText("");
           tex.setText(""+dt+n9.getText());
           
       }else if (fuente == punto) {
           tex.setText("");
           tex.setText(""+dt+punto.getText());
       }
       
       
       //validamos según la operación seleccionada
       if(fuente==sum){
           //convertir el primer número ingresado a un double
           num1=Double.parseDouble(tex.getText());
           mem=num1;
           oper='+';
           tex.setText("");
           tex.requestFocus();
           
       }else if(fuente==res){
           num1=Double.parseDouble(tex.getText());
           mem=num1;
           oper='-';
           tex.setText("");
           tex.requestFocus();
           
       }else if(fuente==mul){
           num1=Double.parseDouble(tex.getText());
           mem=num1;
           oper='*';
           tex.setText("");
           tex.requestFocus();
           
       }else if(fuente==div){
           num1=Double.parseDouble(tex.getText());
           mem=num1;
           oper='/';
           tex.setText("");
           tex.requestFocus();
       }
       //mostramos en el JTextField según la operación realizada
       if (fuente==igual){
           //convertir el segundo número ingresado un double
           num2=Double.parseDouble(tex.getText());
           //según la operación mostrar el resultado
          if (oper=='+'){
           resul=num1+num2;
           tex.setText(""+resul);
           
          }else if(oper=='-'){
           resul=num1-num2;
           tex.setText(""+resul);
           
          }else if(oper=='*'){
           resul=num1*num2;
           tex.setText(""+resul);
           
          }else if(oper=='/'){
           resul=num1/num2;
           tex.setText(""+resul);
           
          }else if(oper=='%')
           resul=num1 % num2;
           tex.setText(""+resul);
       }

       repaint();
       } catch (NumberFormatException nfe) {
           //Añadimos una excepción por si introducimos letras
           //o si se realiza división por cero
           tex.setText("0");
       }
   }
}
