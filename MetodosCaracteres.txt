import java.util.Scanner;

public class MetodosCaracteres{
 public static void main(String ard[]){
  
  Scanner in = new Scanner(System.in);

  String cadenaOriginal="", cadenaSubstraccion="";
  int num_caracteres=0, desde=0, hasta=0;

  System.out.print("Por favor ingrese la cadena de caracteres : ");
  cadenaOriginal=in.nextLine();
  
	num_caracteres=cadenaOriginal.length();
   System.out.println("Su cadena de caracteres  " + cadenaOriginal + " posee " + num_caracteres + "caracteres : ");

   System.out.print("¿Desde que caracter deseas optener la nueva cadena? ");
   desde=in.nextInt();
   System.out.print("¿indique el caracter donde finalizara la nueva cadena? ");
   hasta=in.nextInt();
 
  cadenaSubstraccion=cadenaOriginal.substring(desde,hasta);
   System.out.println("La nueva cadena es " + cadenaSubstraccion);
 }
}