import java.util.Scanner;

public class VectoresUnilaterales{
  public static void main (String args[]){
  
    Scanner in= new Scanner(System.in);

    int numeros[]= new int[5];
    int tamanoVector=0, i=0;
 
    System.out.print("Indique el numero del vector");
    tamanoVector=in.nextInt();

    int numeroUser[]= new int[tamanoVector];
   
   for(i=0;i<tamanoVector;i++){
    System.out.println("Ingrese la posicion " + i + "del vector");
    numeroUser[i]=in.nextInt();
    }
    
    numeros[0]=9;
    numeros[1]=3;
    numeros[2]=0;
    numeros[3]=458;
    numeros[4]=22;
   
   System.out.print("[" + numeros[0] + "]");
   System.out.print("[" + numeros[1] + "]");
   System.out.print("[" + numeros[2] + "]");
   System.out.print("[" + numeros[3] + "]");
   System.out.print("[" + numeros[4] + "]");

   System.out.println("");
   System.out.println("");

   System.out.print("[" + numeroUser[0] + "]");
   System.out.print("[" + numeroUser[1] + "]");
   System.out.print("[" + numeroUser[2] + "]");
   System.out.print("[" + numeroUser[3] + "]");
   System.out.print("[" + numeroUser[4] + "]");

 }

}