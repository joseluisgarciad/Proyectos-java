package animales;

public abstract class Animal {

	private String tipo_alimentacion;
	private boolean domestico;
	private boolean extinguido;
	private int peso;
	private int anhos_vida;
	
    public Animal () {
    	this.extinguido = false;
    }
    
    private Animal (boolean extinguido, int anhos) {
        this.extinguido = extinguido;
        this.anhos_vida = anhos;
    }

	public Animal(String tipo_alimentacion, boolean domestico, boolean extinguido, int peso, int anhos_vida) {
		this(extinguido, anhos_vida);
		this.tipo_alimentacion = tipo_alimentacion;
		this.domestico = domestico;
		this.peso = peso;
	}

	public String getTipo_alimentacion() {
		return tipo_alimentacion;
	}

	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipo_alimentacion = tipo_alimentacion;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	public boolean isExtinguido() {
		return extinguido;
	}

	public void setExtinguido(boolean extinguido) {
		this.extinguido = extinguido;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAnhos_vida() {
		return anhos_vida;
	}

	public void setAnhos_vida(int anhos_vida) {
		this.anhos_vida = anhos_vida;
		Animal.Huesped.saludar();
	}
    
    public abstract void moverse();
    
    public abstract void nacer();
    
    public abstract void alimentarse();
    
    static class Huesped { // Clase anidada/interna dentro de otra
    	public static void saludar() {
    		System.out.println("Hola");
    	}
    }
}
