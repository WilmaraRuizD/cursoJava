import java.util.Scanner;

import java.util.Scanner;

public class Caracteres{
  public static void main(String args[]){

 	
    Scanner in = new Scanner(System.in);
    String nombre_uno="", nombre_dos="";
    
   System.out.println("¿Cual es el primer nombre?");
    nombre_uno=in.nextLine();
	
	System.out.println("¿Cual es el segundo nombre?");
	nombre_dos=in.nextLine();

	if(nombre_uno.equalsIgnoreCase(nombre_dos)){
    System.out.println("Los nombres son iguales");
   }else{
	System.out.println("Los nombres no son iguales");
     }
 }
}