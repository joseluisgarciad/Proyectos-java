package juego;

public abstract class Juego {

	private int numVidas;
	private int numVidasInciales;
	private int record = 0;
	
	public void muestraVidasRestantes() {
		System.out.println(this.getNumVidas());
	}
	
	public boolean quitaVida() {
		this.setNumVidas(this.getNumVidas() - 1);
		if (this.numVidasInciales == 0) {
			System.out.println("juego Terminado");
			return false;
		} else {
			return true;
		}
	}
	
	public void reiniciaPartida() {
		this.setNumVidas(this.numVidasInciales);
	}
	
	public void ActualizaRecord() {
		
		if (this.getNumVidas() == this.record) {
			System.out.print("se ha alcanzado el r?cord!!!");
		} else if (this.getNumVidas() > this.record) {
			System.out.println("se ha batido el R?cord, el nuevo record es " + this.record);
		} else if (this.getNumVidas() < this.record) {
			//no se hace nada
		}
		
	}
	
	
	public Juego() {
		
	}
	
	public Juego(int numVidas) {
		super();
		this.setNumVidas(numVidas);
		this.numVidasInciales = numVidas;
	}

	public int getNumVidas() {
		return numVidas;
	}

	public void setNumVidas(int numVidas) {
		this.numVidas = numVidas;
		this.numVidasInciales = numVidas;
	}

	abstract void Juega();
}
