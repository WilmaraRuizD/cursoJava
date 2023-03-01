package com.mycompany.operadores2;

import java.util.Scanner;

public class Operadores2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float num1,num2, suma,multip, divide,resta,resto;
        
        System.out.print("Digite dos numero");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        
       suma=num1+num2;
       resta=num1-num2;
       divide=num1/num2;
       multip=num1*num2;
       resto=num1%num2;
       
       System.out.println("La suma es: "+suma);
       System.out.println("la resta es: "+resta);
       System.out.println("la multiplicacion es: "+multip);
       System.out.println("la divicion es: "+divide);
       System.out.println("el modulo es: "+resto);
    }
}
