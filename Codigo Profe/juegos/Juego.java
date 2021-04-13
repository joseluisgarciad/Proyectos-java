package juegos;

public abstract class Juego {
	private int vidasRestantes=0;
	private int vidasIniciales=0;
	private static int record=0;
	
	
	
	public Juego(int vidasRestantes) {
		super();
		this.vidasRestantes = vidasRestantes;
		this.vidasIniciales = vidasRestantes;
	}

	public int getVidasRestantes() {
		return vidasRestantes;
	}

	public void setVidasRestantes(int vidasRestantes) {
		this.vidasRestantes = vidasRestantes;
	}

	public int getVidasIniciales() {
		return vidasIniciales;
	}

	public void setVidasIniciales(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
	}

	public static int getRecord() {
		return record;
	}

	public static void setRecord(int record) {
		Juego.record = record;
	}

	public void muestraVidasRestantes() {
		System.out.println(this.vidasRestantes);
	}
	
	public boolean quitaVida() {
		this.vidasRestantes--;
		//De esta forma nos ahorramos el else
		/*if (vidasRestantes>0) {
			return true;
		}
		System.out.println("Juego Terminado");
		return false;*/
		
		boolean resultado=false;
		if (vidasRestantes>0) {
			resultado=true;
		} else {
			System.out.println("Juego Terminado");
			resultado=false;
		}
		return resultado;
	}
	
	public void reiniciaPartida() {
		this.vidasRestantes=this.vidasIniciales;
	}
	
	public void actualizaRecord() {
		if(this.vidasRestantes>this.record) {
			this.record=this.vidasRestantes;
			System.out.println("Has batido el record. Nuevo record: "+this.record);
		}else if (this.vidasRestantes==this.record) {
			System.out.println("Has alcanzado el record");
		}
	}

	public abstract void juega();
}
