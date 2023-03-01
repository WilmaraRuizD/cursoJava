

package com.mycompany.ventanalaborales;

import javax.swing.JOptionPane;


public class Ventanalaborales {

    public static void main(String[] args) {
       String dia ;
       
       
      dia=JOptionPane.showInputDialog("Digite el dia de la semana");
      switch (dia){
          case "lunes" -> JOptionPane.showMessageDialog(null, "dia laboral");
          case "martes"-> JOptionPane.showMessageDialog(null, "dia laboral");
          case "miercoles" -> JOptionPane.showMessageDialog(null, "dia laboral");
          case "jueves"-> JOptionPane.showMessageDialog(null, "dia laboral");
          case "ciernes"-> JOptionPane.showMessageDialog(null, "dia laboral");
          default ->JOptionPane.showMessageDialog(null,"dia no laborable.Descansa");
      }     
    }
}
