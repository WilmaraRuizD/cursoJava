package com.mycompany.promediosalarial;

import java.util.Scanner;

public class Promediosalarial {

    public static void main(String[] args) {
     int salarioHora=4833,result;
     int    horasLaboradas;
     
     Scanner entrada=new Scanner(System.in);
     
     System.out.print("Ingrese las horas laborables");
     horasLaboradas=entrada.nextInt();
     
     result=salarioHora*horasLaboradas;
     
        System.out.println("su sueldo semanal es "+result);
    }
}
