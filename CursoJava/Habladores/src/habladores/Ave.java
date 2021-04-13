package habladores;

public abstract class Ave {

	public String sexo = "";
	public int edad = 0;
	
	public Ave() {
		
	}
	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}
	
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
