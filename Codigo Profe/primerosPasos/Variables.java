package primerosPasos;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**************
		 * VARIABLES
		 **************/
		
		//Tipos principales primitivos
		int a;//declaramos la variable
		a=0;  //la inicializamos
		
		double b=1;//declarar e inicializar en la misma línea
		float c = 2.2f;
		
		char caracter='@';  //ojo:  comillas simples
		
		//String no es un tipo primitivo
		String cadenaDeCaracteres= "esto es una cadena";//aquí, comillas dobles
		
		String cadenaNumerica = "4856";
		
		//CASTING: conversión de un tipo de variable a otro
		int d = 9;
		double e = (double)a;
		e= 7.7;
		int f = (int)e;
		System.out.println(f);
		
		//clases Wrappers
		int g = 8;
		Integer h = g; //el casting entre un tipo primitivo y su correspondiente
		               //clase wrapper es automático
		
		//Conversiones de String a numérico y viceversa
		
		//de String a numérico
		String str = "4";
		String str2 = " 4";
		
		int valorEntero = Integer.valueOf(str);
		//int valorEntero2 = Integer.valueOf(str2); //esto da un error de ejecución
		
		int valorEntero3 = Integer.parseInt(str);
		float valorFloat = Float.parseFloat(str);
		float valorFloat2 = Float.valueOf(str);
		double valorDouble = Double.parseDouble(str);
		double valorDouble2 = Double.valueOf(str);
		
		//para evitar errores con los espacios usamos "trim"
		int valorEntero4 = Integer.parseInt(str2.trim());
		
		//de numérico a string
		String deInt, deFloat, deDouble, deOtroEntero, deOtroFloat, deOtroDouble;
		deInt = Integer.toString(valorEntero);
		deFloat = Float.toString(valorFloat);
		deDouble = Double.toString(valorDouble2);
		deOtroEntero = String.valueOf(valorEntero3);
		deOtroFloat = String.valueOf(valorFloat);
		deOtroDouble = String.valueOf(valorDouble);
		
		//truco a evitar
		String cadena = valorEntero+"";
		
		//el char que es una variable simbólica, que representa un carácter UNICODE
		//si la convertimos a un entero nos da su valor UNICODE
		
		char i = '~';
		System.out.println("Carácter: "+ i +" Equivalente UNICODE: "+(int)i);
		
		
		/**********************************
		 * SECUENCIAS DE CONTROL
		 *********************************/
		
		//Condicionales:    IF...ELSE
		int j=100;
		
		if (j<0) {
			System.out.println("El número j es negativo");
		}else if (j<10) {
			System.out.println("El número j es positivo y menor que 10 (excluido)");
		}else if (j<=100) {
			System.out.println("El número j es mayor que 10 y menor o igual a 100");
		}else {
			System.out.println("El número j es mayor que 100");
		}
		
		//SWITCH
		String animal = "correveidile";
		String comportamiento ="";
		switch  (animal) {
		case "liebre":
			comportamiento = "corro mucho";
			break;
	
		case "elefante":
			comportamiento = "peso mucho";
			break;
	
		default:
			animal = "algo indefinido";
			comportamiento = "no sé qué hago";
			break;
		}
		System.out.println("Soy "+animal+" y "+comportamiento);
		
		
		//BUCLES
		//3 tipos básicos de bucles
		
		//BUCLE   FOR
		for (int k=0; k<10;k=k+1) {
			System.out.println(k+1);
		}
		
		//Bucle  WHILE
		int l=1;
		while(l<100) {
			System.out.println("bucle while: "+l);
			l=l*2;
		}
		
		//Bucle  DO...WHILE
		int m=-9;
		do {
			System.out.println("bucle do...while: "+m);
			m++;
		}while(m<0);
		
		int n=-9;
		while (n<0) {
			System.out.println(n);
			n++;
		}
		
		//Ejemplo: cálculo del factorial de un número
		int numero=14;
		long resultado=numero;
		for (int o=numero-1;o>1;o--) {
			resultado=resultado*o;
		}
		System.out.println(resultado);
		
	}

}
