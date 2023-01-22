import java.util.Scanner;

public class Calculadora{
  public static void main(String args[]){
   
    Scanner in = new Scanner(System.in);

    int numero1=0, numero2=0, operador=0,resultado=0; 
 
    System.out.println("Calculadora creada por Wilmara Ruiz");

    System.out.println("¿Que operacion desea realizar? 1.SUMA 2.Resta 3.Multiplicacion 4.divicion?");
    operador=in.nextInt();
  
    System.out.println("Indique el valor de numero 1:");
    numero1=in.nextInt();

    System.out.println("Indique el valor de numero 2:");
    numero2=in.nextInt();
    
	if(operador==1){
	  resultado=numero1+numero2;
        System.out.println("El resultado es :"+resultado);
   }else if(operador==2){
    resultado=numero1-numero2;
        System.out.println("El resultado es :"+resultado);
    }else if(operador==3){
        resultado=numero1 * numero2;
        System.out.println("El resultado es :"+resultado);
    }else if(operador==4){
	  resultado=numero1 / numero2;
        System.out.println("El resultado es :"+resultado);
    }else{
        System.out.println("El opcion seleccionada no es valida");
    }
  }
}