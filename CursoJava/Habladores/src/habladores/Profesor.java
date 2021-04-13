package habladores;

public class Profesor extends Persona implements hablador{

	public String despacho = "";
	public String email = "";

	public Profesor() {
		
	}
	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return"Hola, soy un Profesor y s� hablar";
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nNombre "  +this.nombre + " tengo " + this.edad + " a�os " + " Mi despacho es " + this.despacho + " y mi correo electronico es " + this.email ;

	}
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
