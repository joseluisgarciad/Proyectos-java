package primerosPasos;

public class Util {
	
	public static int cuentaPalabras(String frase) {
		String[] fraseArray = frase.split(" ");
		return fraseArray.length;
	}
	
	public static int cuentaVocales(String frase) {
		char[] fraseArray =frase.toCharArray();
		int contador=0;
		for (int i=0;i<fraseArray.length;i++) {
			if(   fraseArray[i]=='a' || fraseArray[i]=='A'
			   || fraseArray[i]=='á' || fraseArray[i]=='Á') {
				contador++;
			}
		}
		return contador;
	}
	
	public int suma (int s1, int s2) {
		int resultado;
		resultado=s1+s2;
		return resultado;
	}
	
	public double operar(int ope1, int ope2, String operador) {
		double resultado=-9999;
		
		//con un switch
		/*
		switch (operador) {
		case "+":
			resultado=ope1+ope2;
			break;
		case "-":
			resultado=ope1-ope2;
			break;
		case "*":
			resultado=ope1*ope2;
			break;
		case "/":
			if(ope2==0) {
				return -99999;
			}
			resultado = ope1/ope2;
		}
		*/
		
		boolean divPorCero=false;
		if (ope2==0) {
			divPorCero=true;
		}
		
		//Con if-else  anidados
		//para comparar el contenido de "operador", que es un String
		//debemos usar el método "equals(Object obj)"
		if (operador.equals("+")) {
			resultado=ope1+ope2;
		}else if (operador.equals("-")) {
			resultado=ope1-ope2;
		}else if (operador.equals("*")) {
			resultado=ope1*ope2;
		}else if (operador.equals("/")) {
			if (!divPorCero) {
				resultado=(double)ope1/(double)ope2;
			}else resultado=-99999;
		}		
		return resultado;
	}
}











