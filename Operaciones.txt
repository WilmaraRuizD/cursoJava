public class Operaciones{
  public static void main(String args[]){
    
   int numero1   = 4 ;
   int numero2   = 4 ;
   int resultado = 0 ;

   resultado = numero1 + numero2 /2 ; 
   System.out.println("El resultado sin prioridad de signos es :" + resultado);
   
   resultado = (numero1 + numero2) /2 ; 
   System.out.println("El resultado con prioridad es :" + resultado);
 }
}