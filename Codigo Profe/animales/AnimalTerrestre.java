package animales;

public class AnimalTerrestre extends Animal {
	
	private int velocidad;
	private boolean respira;

	public AnimalTerrestre() {
		
	};
	
	
	

	public AnimalTerrestre(String tipo_alimentacion, boolean domestico, boolean extinguido, int peso, int anhos_vida,
			int velocidad, boolean respira) {
		super(tipo_alimentacion, domestico, extinguido, peso, anhos_vida);
		this.velocidad = velocidad;
		this.respira = respira;
	}




	@Override
	public void moverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nacer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub

	}

}
