import java.awt.TextField;
import javax.swing.*;
import java.awt.event.*;

public class FormularioInp extends JFrame implements ActionListener{

 private  TextField textfield1;
 private JButton boton;
 private JLabel label1;

  public FormularioInp(){
   setLayout(null);

  boton=new JButton("Botton 1");
  label1=new JLabel("Usuario:");
  textfield1= new  TextField() ;

  boton.setBounds(10,80,100,30);
  label1.setBounds(10,10,100,30);
  textfield1.setBounds(120,17,150,20);

  add(boton);
  add(label1);
  add(textfield1);

  boton.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e){
 if(e.getSource()==boton){
  String texto=textfield1.getText();
  setTitle(texto);
  
  }
}

public static void main (String args[]){
  
   FormularioInp formulario = new FormularioInp();
   formulario.setBounds(0,0,450,350);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}