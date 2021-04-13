package habladores;

public class Buitre extends Ave implements hablador{

	public int velocidadVuelo = 0;
	public int peso = 0;

	public Buitre() {
		
	}
	public Buitre(String sexo, int edad, int velocidadVuelo, int peso) {
		super(sexo, edad);
		this.velocidadVuelo = velocidadVuelo;
		this.peso = peso;
	}
	
	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Hola, soy un Buitre y sé volar";
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nSexo " + this.sexo + " mi edad es de " + this.edad + " vuelo a " + this.velocidadVuelo + " Km/h" + " y peso " + this.peso + " Kg";
	}
	
	public int getVelocidadVuelo() {
		return velocidadVuelo;
	}

	public void setVelocidadVuelo(int velocidadVuelo) {
		this.velocidadVuelo = velocidadVuelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}



	
}
