/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author paolaramos
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int num1;
      int num2;
      int suma;
        
        int respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea hacer una suma? \n1. si  \n2 no"));
        if (respuesta==1) {
           num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
           num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero "));
           suma = num1+num2;
           JOptionPane.showMessageDialog(null,"el resultado de la suma es: "+suma);
        }
    }
    
}
