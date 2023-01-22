import java.util.Scanner;

public class EntradaDato{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in) ;
    String nombre="";
    int numUno=0 , numDos=0, resultado=0;

 System.out.println("¿cual es su nombre?");
	nombre=in.nextLine();

System.out.println("Dame el primer valor de la suma :");
numUno=in.nextInt();

System.out.println("Dame el segundo valor de la suma :");
numDos=in.nextInt();

resultado=numUno+numDos;

 System.out.println("Tu Nombre es : "+ nombre );
   System.out.println("El resultado de la sume es : " + resultado );
 }
}