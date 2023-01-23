/*La empresa Coca-Cola Company solicita un sistema que determine los díasde vacaciones a los que tiene derecho un trabajador tomando en cuenta las
siguientes características : 1.Departamento de atención al cliente (Clave 1) 2.Departamento de Logística.(Clave 2) 3.Gerencia.(Clave 3)

(Atención al cliente)
.Con 1 año de servicio, reciben 7 días de vacaciones. 
.con 2 a 6 años de servicio reciben 14 dias de vacaciones. 
.a partir de 7 años de servicio,reciben 20 días de vacaciones.
(Logística)
.Con 1 año de servicio,reciben 7 días de  vacaciones.
.Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
.A partir de 7 años reciben 22 días de vacaciones.
(Gerencia)
.1 año de servicio, 10 dias de vacaciones. 
.2 a 6 años de servicio, reciben 20 días de vacaciones.
.A partir de 7 anos de servicio, reciben 30 días de vacaciones.  
*/

import java.util.Scanner;
public class Ejercicio1{
  public static void main(String args[]){
  
    System.out.println("*********************************************************");
    System.out.println("Bienvenidos al sistema de Vacaciones de Coca-cola Company");
    System.out.println("*********************************************************");   
    System.out.println("");
    System.out.println("");

    //Declaracion de datos 
    Scanner in=new Scanner(System.in);
    String  nombre="";
    int anosServicios=0 ,claveDepartamento=0, vacaciones=0;
    
    //Entrada de datos 
    System.out.println("Por favor indique su nombre");
    nombre=in.nextLine();
 
   System.out.println(" Atencion al cliente=1 .Logística=2 .Gerencia= 3");
   claveDepartamento=in.nextInt();

    System.out.println("cuantos años tiene en la empresa");
    anosServicios=in.nextInt();
 
   if(claveDepartamento==1){
     if(anosServicios==1){
       vacaciones=7;
	 System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	 
     }else if((anosServicios>=2)&&(anosServicios<7)){
	vacaciones=14;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
     }else if(anosServicios>=7){
      vacaciones=20;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	}else{
	System.out.println("Error!,los años en la empresa no es valida");
	}

   }else if(claveDepartamento==2){
     if(anosServicios==1){
       vacaciones=7;
	 System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	 
     }else if((anosServicios>=2)&&(anosServicios<7)){
	vacaciones=15;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
     }else if(anosServicios>=7){
	vacaciones=22;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	}else{
	System.out.println("Error!,los años en la empresa no es valida");
	}

   }else if(claveDepartamento==3){
	if(anosServicios==1){
       vacaciones=10;
	 System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	 
     }else if((anosServicios>=2)&&(anosServicios<7)){
	vacaciones=20;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
     }else if(anosServicios>=7){
	vacaciones=30;
	System.out.println(nombre +" tiene "+vacaciones+" dias de vacaciones");
	}else{
	System.out.println("Error!,los años en la empresa no es valida");
	}

   }else{
   System.out.println("Error!,la clave del departamento no es valida");
   }

 }
}