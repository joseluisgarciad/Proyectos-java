import java.util.Scanner;

public class Parametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int numero1;
	     int numero2;
        int suma;
	     
	     
	     // Pruebas
	        Scanner teclado = new Scanner( System.in );

	        System.out.print( "Introduzca primer número: " );
	        numero1 = teclado.nextInt();
           
	        System.out.print( "Introduzca segundo número: " );
	        numero2 = teclado.nextInt();

	        suma = numero1 + numero2;

	        System.out.println( "La suma de " + numero1 + " más " + numero2 + " es " + suma + "." );
	    
	
	        System.out.println("Suma de parametros "+(args[0])+" y "+ (args[1])+ " es:" + (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
	   
           int numero3 = Integer.valueOf(args[0])+Integer.valueOf(args[1]);
           System.out.println(numero3);
	}

}
