import java.util.Scanner;

public class CicloFor{
  public static void main(String args[]){
 
   Scanner in= new Scanner(System.in);

  int opcion=0, rangoMin=0, rangoMax=0;

  System.out.println("Indique si la operacion es incremento=1 decremento=2,");
  opcion=in.nextInt();

  switch(opcion){

	case 1:
	for(int i=1;i<=20;i++){
      System.out.print(i+",");
	}
      break;
	case 2:
	for(int i=20;i>=0;i--){
	System.out.print(i+",");
      
	}
	break ;
	default:System.out.println("La opcion no es valido");

   }

 }
}