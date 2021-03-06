package habladores;

import java.util.ArrayList;

public class Alumno extends Persona implements hablador{

	public String carrera = "";
	public String curso = "";
	
	public Alumno() {
		
	}

	public Alumno(String nombre, int edad, String carrera, String curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub

		return "Hola, soy un Alumno y s? hablar";
	}

    public boolean guardar(ArrayList objetos) {
    	return objetos.add(this);
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nNombre "  +this.nombre + " tengo " + this.edad + " a?os " + " Estoy estudiando la carrera de " + this.carrera + " y estoy en el " + this.curso + " curso";
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
