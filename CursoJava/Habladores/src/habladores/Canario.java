package habladores;

import java.util.ArrayList;

public class Canario extends Ave implements hablador {

	public boolean canta = true;
    public String cantar = "";
 
    public Canario() {
    	
    }
    
	public Canario(String sexo, int edad, boolean canta) {
		super(sexo, edad);
		this.canta = canta;
	}
	
	
    @Override
	public String hablar() {
		// TODO Auto-generated method stub
    	if (this.canta) {
    		cantar = " y s? cantar";
    		return "Hola, soy un Canario y s? cantar";
    	} else {
    		cantar = " y no s? cantar";
        	return "Hola, soy un Canario y no s? cantar";
    	}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
    	return hablar() + "\nSoy " +this.sexo + " tengo " + this.edad + " a?os" + cantar;
	}
	

	public boolean guardar(ArrayList canarios) {
    	return canarios.add(this);
    }
	
	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}


	
	
}
