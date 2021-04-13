package primerosPasos;

public class CuentaPalabras {

	public static void main(String[] args) {
		String frase = "Esto me va a servir para probar y nada más";
		String[] fraseArray = frase.split(" ");
		System.out.println("Esa frase tiene "+fraseArray.length+" palabras.");
	    System.out.println("Esa frase tiene "+Util.cuentaVocales(frase)+" aes");
	
	}

}
