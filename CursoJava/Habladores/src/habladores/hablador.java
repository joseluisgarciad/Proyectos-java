package habladores;

public interface hablador {

	public String hablar();
	
	
	default public void funcion() {
		// default quita la obligatoriedad de que este metodo deba ser implementado obligatoriamente
		// por las clases que hay por debajo 
	}
}
