package habladores;

public interface Hablador {
	public String hablar();
	default public String gritar() {
		return "";
	};
}
