import java.util.Scanner ;

public class MatrixDinamica{
  public static void main (String args[]){
    
    Scanner in = new Scanner(System.in);
    int columnas=0, filas=0;
   
    System.out.print("Indique el numero de columnas ");
    columnas=in.nextInt();

    System.out.print("Indique el numero de columnas ");
    filas=in.nextInt();

    int matrix[][]= new int[columnas][filas];

    for(int i=0; i<columnas;i++){
    for(int j=0; j<filas;j++){
    System.out.print("¿Ingrese el valor de la posicion " + "[" + i +"]" +"[" + j + "] ");
    matrix[i][j]=in.nextInt();

 	

   }
  }
     System.out.println("");
    for(int i=0; i<columnas;i++){
    for(int j=0; j<filas;j++){ 
  	System.out.print("[" + matrix[i][j] + "]");
   } 
    System.out.println("");
    }
 }

}