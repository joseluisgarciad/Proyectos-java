package habladores;

public abstract class Piolin extends Canario implements hablador{

	public int numPeliculas = 0;

	public Piolin() {
		
	}
	public Piolin(String sexo, int edad, boolean canta, int numPeliculas) {
		super(sexo, edad, canta);
		this.numPeliculas = numPeliculas;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Hola, soy Piolin y s� hablar";
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}
	
	
	
}
