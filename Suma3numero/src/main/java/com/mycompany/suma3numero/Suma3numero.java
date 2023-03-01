
package com.mycompany.suma3numero;

import java.util.Scanner;

public class Suma3numero {

    public static void main(String[] args) {
       float num1,num2,num3,result;
       Scanner entrada= new Scanner(System.in);
       
       System.out.println("Escribe las 3 calificaciones ");
       num1=entrada.nextFloat();
       num2=entrada.nextFloat();
       num3=entrada.nextFloat();
       
       result=num1+num2+num3;
       
       System.out.println("\nla la suma es :"+result);
    }
}
