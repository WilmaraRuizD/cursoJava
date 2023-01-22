import java.util.Scanner;

public class Promedio{
  public static void main(String ards[]){
   
   Scanner in = new Scanner(System.in);

   int matematica = 0 , biologia=0, quimica=0, promedio=0;

   System.out.println("¿Cual es la nota de matematica?");
   matematica=in.nextInt();

   System.out.println("¿Cual es la nota de matematica?");
   biologia=in.nextInt();
 
   System.out.println("¿Cual es la nota de matematica?");
   quimica=in.nextInt();

   promedio=(matematica+biologia+quimica)/3;
	// mayo o igual a 6
     if(promedio>=6){
     System.out.println("Si aprobaste ");
  }else{
     System.out.println("No aprovaste");
  }  	
 }  
}