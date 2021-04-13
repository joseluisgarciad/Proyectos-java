package habladores;

public class Bedel extends Persona implements hablador {

	public String turno = "";
	public int antiguedad = 0;

	public Bedel() {
		
	}
	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Hola, soy un Bedel y sé hablar";
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nNombre " +this.nombre + " tengo " + this.edad + " Mi turno es de " + this.turno + " y tengo una antiguedad de " + this.antiguedad + " años";
	}
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
}
