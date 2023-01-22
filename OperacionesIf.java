public class OperacionesIf{
  public static void main(String args[]){
   
   int operaciones = 1 ;
   int numero1     = 8 ;
   int numero2     = 4 ;
   int resultado   = 0 ;

   if(operaciones==1){
     resultado=numero1+numero2;
     System.out.println("El resultado de la suma es : "+resultado);
   }
  else if(operaciones==2){
    resultado=numero1-numero2;
    System.out.println("El resultado de la resta: " +resultado);
   } else if(operaciones==3){
     resultado=numero1*numero2;
     System.out.println("El resultado de la multiplicacion es "+ resultado);
     
   }else if(operaciones==4){
    resultado=numero1+numero2;
     System.out.println("El resultado de la divicion es " + resultado);
   }else{
	System.out.println("El valor seleccionado no es valido");}

 }
}