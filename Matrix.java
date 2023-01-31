public class Matrix{

  public static void main (String args[]){
    
   int matrix[][]=new int[2][2];

   matrix[0][0]=5;
   matrix[0][1]=2;
   matrix[1][0]=2;
   matrix[1][1]=5;

  for(int i=0;i<matrix.length;i++){
    for(int j=0;i<matrix.length;i++){
    System.out.print("[" + matrix[i][j] +"]");
   }
  }
 
   System.out.println("");
   System.out.println("");
  
   System.out.print("[" + matrix[0][0] +"]");
   System.out.print("[" + matrix[0][1] +"]");
   System.out.print("[" + matrix[1][0] +"]");
   System.out.print("[" + matrix[1][1] +"]");
 }
}