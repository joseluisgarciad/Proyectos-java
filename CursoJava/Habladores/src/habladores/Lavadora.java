package habladores;

public class Lavadora extends Aparatos implements hablador {

	public int alto = 0;
	public int ancho = 0;
	
	public Lavadora() {
		
	}
	
	public Lavadora(int consumo, double precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Soy una lavadora y no sé hablar";
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nConsumo "  + this.consumo + " W, mi precio es " + this.precio + " mi altura es " + this.alto + " cm, mi anchura es " + this.ancho ;

	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
}
