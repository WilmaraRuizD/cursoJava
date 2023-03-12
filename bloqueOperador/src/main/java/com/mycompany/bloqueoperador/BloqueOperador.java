package com.mycompany.bloqueoperador;

import java.util.Scanner;

public class BloqueOperador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float dolarGui , dolaresluis, dolarJuan, total ;
        
        System.out.print("Escriba el valor de dolares de guillermo");
        dolarGui=entrada.nextInt();
        
            dolaresluis=dolarGui/2;
            dolarJuan=(dolarGui+dolaresluis)/2;
            total=dolarGui+dolaresluis+dolarJuan;
            
            System.out.println("guillermo tiene en dolares "+dolarGui);
            System.out.println("Luis tiene en dolares "+dolaresluis);
            System.out.println("Juan tiene en dolares "+dolarJuan);
            System.out.println("El total de dolares es: "+total);
        
    }
}
