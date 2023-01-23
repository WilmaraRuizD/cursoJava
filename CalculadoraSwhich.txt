import java.util.Scanner;

public class CalculadoraSwhich{
  public static void main(String args[]){
 
    Scanner in= new Scanner(System.in);

    int opcion=0 , num1=0 , num2=0, resultado=0;

    System.out.println("******************************************************");
    System.out.println("************BIENVENIDOS A CALCULADORA*****************");
    System.out.println("******************************************************");


    System.out.println("Por favor ingrese el numero1");
    num1=in.nextInt();
    System.out.println("Por favor ingrese el numero2");
    num2=in.nextInt();
    System.out.println("Para Sumar = 1 ,para restar=2, para multiplicas=3, para dividir=4");
    opcion=in.nextInt();
    
    //Switch case:
    switch(opcion){
	case 1:
	resultado=num1+num2;
	System.out.println("El resultado de la suma es: "+resultado);
    	break;
	case 2:
	resultado=num1-num2;
	System.out.println("El resultado de la resta es: "+resultado);
    	break;
	case 3:
	resultado=num1*num2;
	System.out.println("El resultado de la multiplicacion es: "+resultado);
    	break;
	case 4:
	resultado=num1/num2;
	System.out.println("El resultado de la divicion es: "+resultado);
    	break;
	
	default:System.out.println("La opcion seleccionada no es valida");
	}
 }
}