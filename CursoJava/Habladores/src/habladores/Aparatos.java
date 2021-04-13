package habladores;

public abstract class Aparatos {

	public int consumo = 0;
	public double precio = 0;
	
	public Aparatos() {
		
	}
	
	public Aparatos(int consumo, double precio) {
		super();
		this.consumo = consumo;
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
