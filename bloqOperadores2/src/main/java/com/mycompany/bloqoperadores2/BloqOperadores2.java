//UNA COMPA;IA DE VENTA DE CARROS USADOS,PAGA A SU PERSONAL DE VENTA UN 
//SALARIO DE 1000 MENSUALES,MAS UNA COMISION DE 150% POR CADA CARRO VENDIDO, 
//MAS EL 5%
//de la venta del carro, cada mes el caturista de la empresa ingresa en la 
//computadora los datos pertinentes. hacer un programa que calcule e imprima el 
//salario mensual de un vendedor dado. 

package com.mycompany.bloqoperadores2;
import java.util.Scanner;

public class BloqOperadores2 {

    public static void main(String[] args) {
        //variables glovales
        int salarioNeto=1000, numeroCarro;
        float precioCarro, salarioTotal;
        
        //entrada de datos por usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de carros vendidos");
        numeroCarro=entrada.nextInt();
        
        System.out.println("Ingrese el valor de carros por unidad");
        precioCarro=entrada.nextInt();
        
        salarioTotal= (float) (((precioCarro*numeroCarro)*5)/100);
        
       salarioTotal+= salarioNeto;
       
      System.out.println("El salario devengado es "+salarioTotal);
              
       
        
    }
}
