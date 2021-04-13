package habladores;

import java.util.ArrayList;

public class Alumno extends Persona implements Hablador{
	
	@Override
	public String hablar() {
		return this.toString();
		
	}

	


	private String carrera;
	private int curso;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}
		
	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public boolean guardar(ArrayList alumnos) {
		return alumnos.add(this);
		
	}
	
	
	@Override
	public String toString() {
		
		return "Me llamo "+this.getNombre()+", tengo "+this.getEdad()+
				"años, estudio "+this.getCarrera()+ " y estoy en el curso"+this.getCurso();
	}

	

	}
