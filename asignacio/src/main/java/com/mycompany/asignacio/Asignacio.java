package com.mycompany.asignacio;

import java.util.Scanner;
public class Asignacio {

    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int num;
       int x=10,y ;
       
       System.out.print("Ingrese el numero");
       num=entrada.nextInt();
        
        y=++x;
       num+=5;//numero=numero+5
       
       System.out.print("es valor es "+num);
       System.out.print("el valor de y es "+ y);
    }
}
