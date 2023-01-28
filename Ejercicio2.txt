public class Ejercicio2{
  public static void main(String args[]){

 //con for 
  System.out.println("Esto es con estructura for");
  System.out.println("");

  int i=0;
  int j=99;
  int a=0, b=1 ,c=0;

  for (i=1;i<=10;i++){

   if(i<10){
   System.out.print(i+",");
   }else{System.out.print(i);
   }
  }
  System.out.println("");
  System.out.println("incremento y decremento");
  System.out.println("");

	for (i=1;i<=5;i++){
		
		 if(i<5){
   	 System.out.print(i+",");
	  System.out.print(j+",");
	  }else{
	  System.out.print(i+",");
	  System.out.print(j);
		}

	   j--;
	}
  
  System.out.println("");
  System.out.println("serie fibonacci");
  System.out.println("");

  for( i=0;i<10;i++){
    if(i<9){
  	System.out.print(a+",");
	c=a+b;
  	a=b;
  	b=c;
	}
	else{System.out.print(a);
	}
}


  //Esto es while;
  i=1;
 System.out.println("");
 System.out.println("");

   System.out.println("Esto es con estructura while");
   while(i<=10){
   if(i<10){
   System.out.print(i+",");
   }else{System.out.print(i);
    }
   i++;
   }
  i=1;
  j=99;
 System.out.println("");
  System.out.println("");
  
  while(i<=5){
	if(i<5){
	System.out.print(i+",");
	System.out.print(j+",");
	}else{System.out.print(i+",");
	      System.out.print(j);
	}
	j--;
	i++;
   }

	i=1;
	j=99;
	
  System.out.println("");
  System.out.println("serie fibonacci");
  System.out.println("");

  i=0;
  a=0;
  b=1;
  c=0;

 while(i<10){
   if(i<9){
  	System.out.print(a+",");
	c=a+b;
  	a=b;
  	b=c;
	}
	else{System.out.print(a);
	}
	i++;
   }
  i=0;

  System.out.println("");
  System.out.println("");
  System.out.println("Esto es con estructura do while");
  
  do{
   if(i<10){
   System.out.print(i+",");
   }else{System.out.print(i);
    }
   i++;
	}while(i<=10);



  System.out.println("");
  System.out.println("");
  i=1;
  j=99;
	
	 do{
   if(i<5){
   System.out.print(i+",");
    System.out.print(j+",");
   }else{System.out.print(i+",");
	  System.out.print(j);
    }
   i++;
   j--;
	}while(i<=5);
 
  System.out.println("");
  System.out.println("serie fibonacci");
  System.out.println("");


    i=0;
    a=0;
    b=1;
    c=0;
 do{
    if(i<9){
	System.out.print(a+",");
	c=a+b;
	a=b;
	b=c;
	}else{System.out.print(a);}
	i++;
  }while(i<10); 

 }
}

