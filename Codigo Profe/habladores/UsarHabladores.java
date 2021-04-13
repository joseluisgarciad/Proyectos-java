package habladores;


import java.util.ArrayList;

public class UsarHabladores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno1 = new Alumno("Pepe",25,"Matemáticas",3);
		Alumno alumno2 = new Alumno("Luis",56,"Matemáticas",2);
		Alumno alumno3 = new Alumno("Manolo",23,"Filosofía",4);
		Alumno alumno4 = new Alumno("Federico",49,"Derecho",1);
		
		
		
		//Primera forma de meter objetos Alumno en el array
		Alumno[] alumnos = new Alumno[4];
		alumnos[0]=alumno1;
		alumnos[1]=alumno2;
		alumnos[2]=alumno3;
		alumnos[3]=alumno4;
		
		for(int i=0;i<alumnos.length;i++ ) {
			Alumno a = alumnos[i];
			System.out.println(a.toString());
		}
		
		//Segunda forma: crear directamente el array con sus elementos
		Alumno[] alumnos2 = {alumno1, alumno2, alumno3, alumno4};
		
		//Tercera forma de meter alumnos en un Array (en este caso un ArrayList)
		ArrayList<Alumno> alumnos3 = new ArrayList<>();
		
		alumno1.guardar(alumnos3);
		alumno2.guardar(alumnos3);
		alumno3.guardar(alumnos3);
		alumno4.guardar(alumnos3);
						
		for(Alumno a: alumnos3) {
			System.out.println(a.hablar());
		}
						
	}

}
