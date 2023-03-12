import javax.swing.*;

public class JLabelForm extends JFrame{

   private JLabel label1;
   private JLabel label2;

  public JLabelForm(){
   setLayout(null);
   label1=new JLabel("Interfaces grafica.");
   label1.setBounds(10,20,300,30); //metodo set para as

   add(label1);

  label2=new JLabel("Version 1.0 grafica.");
   label2.setBounds(10,100,100,30);

   add(label2);
	
	
}

  public static void main(String args[]){
  
   JLabelForm formulario1=new JLabelForm();

   formulario1.setBounds(0,0,300,200);
   formulario1.setResizable(false);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
 }

}