import java.util.Scanner;

public class InicioSeccion{
public static void main (String arg[]){

Scanner in = new Scanner(System.in);
String nombreUser ="", contrasena="", intentoNombre="", intentoContrasena="";
int i=0;

System.out.println("¿Por favor ingrese su nombre?");
nombreUser=in.nextLine();

System.out.println("¿Por favor ingrese su contrasena");
contrasena=in.nextLine();

System.out.println("");
System.out.println("Usuario y Contraseña guardada exitosamente");

do
{

  System.out.println("Por favor ingrese su usuario ");
  intentoNombre=in.nextLine();

	if(nombreUser.equalsIgnoreCase(intentoNombre)){
         System.out.println("Por favor ingrese su contrasena ");
         intentoContrasena=in.nextLine();
	  if(contrasena.equals(intentoContrasena)){
	  System.out.println("Felicidades usuario y contrasena exitosos");
	  i=4;  
	}else{
	 System.out.println("La contrasena de usuario es incorrecto");
	 System.out.println("");
	 }
     
	}else{
  	System.out.println("El nombre de usuario es incorrecto");
	System.out.println("");
   }
	
  i++;
  }while(i<3);
 

 }
}