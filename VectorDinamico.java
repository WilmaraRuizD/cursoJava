import java.util.Scanner;

public class VectorDinamico{
  public static void main (String args[]){
  
    Scanner in = new Scanner(System.in);
    
    int num=0, i=0;

    System.out.print("¿Cual es la dimencion del vector? "); 
    num=in.nextInt();

    int vector[]=new int[num];
    
    for(i=0;i<num;i++){
    System.out.print("Ingrese la posicion " + i + " del vector : ");
    vector[i]=in.nextInt();
    
   }
 
   System.out.println("");
   System.out.println("");

   for(int j=0;j<vector.length;j++){
   System.out.print("[" + vector[j] + "]");
  }
 }
}