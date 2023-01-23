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
  
    System.out.println("Bienvenidos al sistema de Vacaciones");
    
    //Declaracion de datos 
    Scanner in=new Scanner(System.in);
    String  nombre="", claveDepartamento="";
    int anosServicios=0 , vacaciones=0;
    
    //Entrada de datos 
    System.out.println("Por favor indique su nombre");
    nombre=in.nextLine();
 
   System.out.println("Si su departamento es Atención al cliente (Clave_1) 2.Logística.(Clave_2) 3.Gerencia.(Clave 3)";
   claveDepartamento=nextLine();

   System.out.println("cuantos años tiene en la empresa");
   anosServicios=in.nextInt();


 }
}