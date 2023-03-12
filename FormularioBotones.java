import javax.swing.*;
import java.awt.event.*;

public class FormularioBotones extends JFrame implements ActionListener{

  private JButton boton1, boton2, boton3;
  private JLabel label1 ;

 public  FormularioBotones(){
   setLayout(null);

   boton1=new JButton("1");
   boton2=new JButton("2");
   boton3=new JButton("3");
   label1= new JLabel("En espera..");

   boton1.setBounds(10,100,90,30);
   boton2.setBounds(110,100,90,30);
   boton3.setBounds(210,100,90,30);
   label1.setBounds(10,10,300,30);

   add(boton1);
   add(boton2);
   add(boton3);
   add(label1);

   boton1.addActionListener(this);
   boton2.addActionListener(this);
   boton3.addActionListener(this);
 
  
 }
 @Override
  public void actionPerformed(ActionEvent e){

	if(e.getSource()==boton1){
		
		label1.setText("Haz precionado el boton 1");
	}

	  if(e.getSource()==boton2){
	  label1.setText("Haz precionado el boton 2");
      }
 	  if(e.getSource()==boton3){
        label1.setText("Haz precionado el boton 3");
 }
}
 public static void main(String args[]){
  
   FormularioBotones formulario= new FormularioBotones();
   formulario.setBounds(0,0,450,350);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
 
}