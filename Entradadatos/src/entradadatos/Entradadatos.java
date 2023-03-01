
package entradadatos;
import java.util.Scanner;

public class Entradadatos {

    
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        float valor;
        int numero ;
        double numeroD;
        String cadena;
        String cadenaCompleta;
        char letra ;
         
         //Entrada valor de cadena usando nextLine()
         System.out.print("digite un valor de la cadena completa");
         cadenaCompleta=entrada.nextLine();
         
         //Entrada valor numero 
        System.out.print("digite un numero");
        numero=entrada.nextInt();
        //Entrada valor float 
        System.out.print("digite un valor flotante");
        valor=entrada.nextFloat();
        
        //Entrada valor double
        System.out.print("digite un valor double");
        numeroD=entrada.nextDouble();
       
         //Entrada valor chart
        System.out.print("digite una letra");
        letra=entrada.next().charAt(0);
        
        //Entrada valor de cadena
        System.out.print("digite un valor de la cadena");
        //next solo guarda la cadena hasta el primer espacio
         cadena=entrada.next();
         
        System.out.println("el numero es "+ numero);
        System.out.println("el float es "+ valor);
        System.out.println("el double es "+ numeroD);
        System.out.println("cadena es "+cadena);
        System.out.println("cadena completa"+  cadenaCompleta);
        System.out.print("valor letra"+ letra);
    }
    
}
