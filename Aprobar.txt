public class Aprobar{
  public static void main(String args[]){
   
   int matematica = 3;
   int biologia   = 4;
   int quimica    = 7;
   int promedio   = 0;

   promedio=(matematica+biologia+quimica)/3;
     if (promedio>=6){
	System.out.println("El alumno Aprobo con : " + promedio);
	}else{
     
	System.out.println("El alumno no aprobo su promedio fue de :" + promedio);
  }
 }	
}
