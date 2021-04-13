package habladores;

public class Radio extends Aparatos implements hablador{

	public boolean casette = true;
	public int potencia = 0;
	public String cinta = "";
	
	public Radio() {
		
	}
	
	public Radio(int consumo, double precio, boolean casette, int potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		if (this.casette){
		   cinta = " tengo casette";	
		} else {
		   cinta = " no tengo casette";		
		}		
		return "Hola, soy una Radio y s� hablar";
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return hablar() + "\nConsumo "  +this.consumo + " W, mi precio es " + this.precio + cinta + " mi potencia es " + this.potencia + " W ";

	}

	public boolean isCasette() {
		return casette;
	}

	public void setCasette(boolean casette) {
		this.casette = casette;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	


}
