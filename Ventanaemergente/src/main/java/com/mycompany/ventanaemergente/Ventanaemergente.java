
package com.mycompany.ventanaemergente;

import javax.swing.JOptionPane;

public class Ventanaemergente {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
       //metodos que devuelve valores en ventana emergente 
        cadena=JOptionPane.showInputDialog("digite una cadena");
        entero=Integer.parseInt(JOptionPane.showInputDialog("digite una entero"));
        letra=JOptionPane.showInputDialog("digite un caracter").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("ingrese el decimal"));
        
        
        JOptionPane.showMessageDialog(null,"la cadena "+cadena);
        JOptionPane.showMessageDialog(null, "el entero es "+entero);
        JOptionPane.showMessageDialog(null, "la letra es "+letra);
        JOptionPane.showMessageDialog(null, "el numero decimal es" + decimal);
        
        
        
    }
}
