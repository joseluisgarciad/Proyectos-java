package habladores;

public class Tv extends Aparatos implements hablador {

    public boolean teletexto = true;
    public int antiguedad = 0;
    
    public Tv() {
    	
    }
    
	public Tv(int consumo, double precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}

	
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Hola, soy una TV y sé hablar";
	}


	public boolean isTeletexto() {
		return teletexto;
	}


	public void setTeletexto(boolean teletexto) {
		this.teletexto = teletexto;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	
}
