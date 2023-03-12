///importaciones propias de java 

import javax.swing.* ; //para la interfaces
import java.awt.event.* ; //controla eventos de componente

public class FormularioInterfa extends JFrame implements ActionListener{
  
 JButton boton1;
 public FormularioInterfa(){
 
   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this);

 }
//getSource trae el evento y lo asigna a boton
 @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==boton1){   
	System.exit(0);
  }
 }
  
  public static void main(String args []){
    
  FormularioInterfa panelDialogo = new FormularioInterfa();
  panelDialogo.setBounds(0,0,450,350);
  panelDialogo.setVisible(true);
  panelDialogo.setResizable(false);
  panelDialogo.setLocationRelativeTo(null);
 
 
 }
}