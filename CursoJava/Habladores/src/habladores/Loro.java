package habladores;

public class Loro extends Ave implements hablador {

	public String region = "";
	public String color = "";
	

	public Loro() {
		
	}
	
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Hola, soy un loro y s� hablar";
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hablar() + "\nSoy  "  +this.sexo + " tengo " + this.edad + " a�os " + ", procedo de " + this.region + " y mi color es " + this.color;

	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
