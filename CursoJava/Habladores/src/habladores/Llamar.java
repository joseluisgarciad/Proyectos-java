package habladores;

import java.util.ArrayList;

public class Llamar {
	
	public static void main(String[] args){
		
		Alumno alumno1 = new Alumno("Jose Luis",48,"Informatica","3");
		Bedel bedel1 = new Bedel("Ramiro",45,"Tarde",10);
		Buitre buitre1 = new Buitre("Macho",12,25,125);
		Canario canario1 = new Canario("hembra",5,true);
		Lavadora lavadora1 = new Lavadora(1500,900,2000,90);
		Loro loro1 = new Loro("Hembra",5,"Brasil","Verde");
//		Piolin piolin1 = new Piolin("hembra",2,true,2);
		Profesor profe1 = new Profesor("Don Emilio",56,"4-b","profe@semucho.org");
		Radio radio1 = new Radio(60,90,false,90);
		Tv tv1 = new Tv(900,2500,true,6);
		

		
		java.lang.Object[] objetos = new java.lang.Object[7];
	     objetos[0] = alumno1;
	     objetos[1] = bedel1;
	     objetos[2] = buitre1;
	     objetos[3] = lavadora1;
	     objetos[4] = loro1;
	     objetos[5] = profe1;
	     objetos[6] = radio1;
	//     objetos[7] = profe1;
	//     objetos[8] = radio1;
	//     objetos[9] = tv1;
	     
	     for (int z=0;z<objetos.length;z++) {
		     System.out.println(objetos[z].toString());
	     }
	     
	     
	    /*
	     ArrayList objetos2 = new ArrayList<>();
	     alumno1.guardar(objetos2);
	          
	     for(java.lang.Object a: objetos2) {
	    	 System.out.println(a.toString());
	     }
	     */
	     
	     Canario canario2 = new Canario("Hembra", 6, false);
	     Canario canario3 = new Canario("Macho", 5, true);
	     Canario canario4 = new Canario("Macho", 6, false);
	     
	     Canario[] canarios = new Canario[4];
	     canarios[0] = canario2;
	     canarios[1] = canario3;
	     canarios[2] = canario4;
	     
	     ArrayList<Canario> canariosl = new ArrayList<>();
	     canario2.guardar(canariosl);
	     canario3.guardar(canariosl);
	     canario4.guardar(canariosl);
	     
	     for(Canario b: canariosl) {
	    	 System.out.println(b.toString());
	     }
	     
	     
	    		 
	     
	     
	    	 
	}
}
