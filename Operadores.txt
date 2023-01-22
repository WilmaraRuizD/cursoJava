import java.util.Scanner;

public class Operadores{
  public static void main (String args[]){
   Scanner in = new Scanner(System.in);
   String nombre="";
     int clave=0,anos=0, resultado=0;

     System.out.println("¿cual es tu nombre?");
     nombre=in.nextLine();
	
	System.out.println("¿Codigo del departamento?");
	clave=in.nextInt();
	
	System.out.println("¿Cuantos años de servicio tiene?");
	anos=in.nextInt();
 
   if((clave==1)&&(anos==1)){
	System.out.println(nombre + " Sus dia de vacaciones son igual a 7 dias");
  }


 }
}