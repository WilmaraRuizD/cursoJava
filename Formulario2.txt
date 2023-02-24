import javax.swing.*;

public class Formulario2 extends JFframe{
  
  private JLabel label1;
  private JLabel label2;

  public class Formulario2(){
  setLayout(null);
  label1=new JLabel("Interfaz grafica.");
  label1.setBounds(10,20,300,30);
  add(label1);
  label2=new JLabel("Versión 1.0");
  label2.setBounds(10,100,100,30);
  add(label2);
 }

public static void main(String args[]){
  Formulario2 formulario2=new Formulario2();
  formulario2.setBounds(0,0,300,200);
  formulario2.setResizable(false);
  formulario2.setVisible(true);
  formulario2.setLocationRelativeTo(null);

 }
}