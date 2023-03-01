
package com.mycompany.libreriamath;

public class Libreriamath {

    public static void main(String[] args) {
        //sacar la raiz cuadrada 
        double raiz=Math.sqrt(9);//siempre es un resultado double
        int raizenter=(int)Math.sqrt(9);//asi se convierte en entero
        
        //potenciacion 
        double base = 5,exponente=2;
        double resultad=Math.pow(base, exponente);
        
        //redondear un numero 
        double numero=4.56;
        long resultado=Math.round(numero);
        
        float numero1=4.16f ;//tipo float se debe colocar f al final
        int resultado1=Math.round(numero1);
        //randon o numero aleatorio 
        
        double randor1=Math.random();
        
        System.out.println("result raiz "+raiz);
        System.out.println("convertir a entero raiz "+raizenter);
        System.out.println("potencia double "+ resultad);
        System.out.println("redonder double "+resultado);
        System.out.println("redonder float "+resultado1);
        System.out.println("numero rando "+randor1);
    }
}
