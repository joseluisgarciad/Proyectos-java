/**
 * @author Jose Luis Garcia
 *
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TeoriaClaseJava {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws RangoExcepcion {
		// TODO Auto-generated method stub
	  
		 String palabra = " Mundo";
	  
	     System.out.println("Hola"+palabra);
	     System.out.println("Estoy en Eclipse");
	     
	     int numero1 = 0;
	     int numero2 = 0;
	     int suma;
	     int a;
	     a=0;
	     double b=1;
	     float c=2.2f;
	     char caracter='@';
	     
	     // String no es un tipo primitivo
	     String cadenaDeCaracteres="esto es una cadena"; //aqui, comillas dobles.
	     String cadenaNumerica = "4865";
	     
	     //CASTING: conversión de un tip de variable a otro
	     int d=9;
	     double e = (double)a;
	     e= 7.7;
	     int f = (int)e;
	     System.out.println(f);
	     
	     //clase Wrappers
	     int g = 8;
	     Integer h = g; // o Integer h = (Integer) g;
	                    // El casting entre un tipo primitivo y su correspondiente clase Wrapper es
	                    // automático
	     
	     //Conversiones de String a Numerico y viceversa
	     // de Sting a Numerico
	     
	     String str = "4";
	     String str2 = " 4";
	     
	     int valorEntero = Integer.valueOf(str);
	     // int valorEntero2 = Integer.valueOf(str2);		//da error de ejecucion por tener valor " 4"     
	     //System.out.println(valorEntero2);
	     
	     int valorEntero3 = Integer.parseInt(str);
	     float valorFloat = Float.parseFloat(str);
	     float valorFloat2 = Float.valueOf(str);
	     double valorDouble = Double.parseDouble(str);
	     double valorDouble2 = Double.valueOf(str);
	     
	     // para evitar errores con los valores con espacios usamos Trim
	     
	     int valorEntero4 = Integer.parseInt(str2.trim());
	     System.out.println(valorEntero4);
	     
	     //de numerico a string
	     String deInt, deFloat, deDouble, deOtroEntero, deOtroFloat, deOtroDouble;
	     deInt = Integer.toString(valorEntero);
	     
	     deFloat = Float.toString(valorFloat);
	     deDouble = Double.toString(valorDouble2);
	     deOtroEntero = String.valueOf(valorEntero3);
	     deOtroFloat = String.valueOf(valorFloat);
	     deOtroDouble = String.valueOf(valorDouble);
	     
	     // el char es una variable simbolica, que representa un caracter UNICODE
	     // si lo convertimos a un caracter entero perdera su valor UNICODE
	     
	     char i = '~'; // alt+126
	     System.out.println("Carácter; "+ 1 +" Equivalente UNICODE:" +(int)i);
	     
	     // Secuencias de control
	    
	     // Condicionales: IF..ELSE
	     System.out.println(" IF..ELSE");
	     int j=2;
	     
	     if (j<0) {
	        System.out.println("El numero j es negativo");	 
	     } else if (j<10) {
	        System.out.println("El numero j es positivo y menor que 10");	  
	     } else if (j<=100) {
	    	System.out.println("El numero j es mayor que 10 y menor o igual a 100");	 
	     } else {
	     	System.out.println("El numero j es mayor que 100");	  
	     }
	     
	     
	     //SWITCH
	     System.out.println("SWITCH");
	     String animal = "Liebre";
	     String comportamiento = "";
	     
	     switch (animal) {
	     case "Liebre" : { 
	    	 comportamiento = "y corro mucho";
	    	 break;
	     }
	     case "Elefante" : {
	    	 comportamiento = "soy grande";
	    	 break;
	     }
	     case "León" : {
	    	 comportamiento = "y no cazo, soy muy vago, caza mi chica";
	    	 break;
	     }		     
	     default:{
	    	 animal ="algo indefinido";
			 comportamiento = "no se lo que hago"; 
	     }
	     }
	     System.out.println("Soy "+animal+" y " + comportamiento);
	     
	     
	     // BUCLES
	     
	     // 3 Tipos básicos de bucles.
	     
	     // Bucle FOR
	     System.out.println("Bucle FOR");
	     for (int k=1; k<=10; k++) {   // haz el bucle mientras se cumpla la condición k<=10
	    	 System.out.println("El numero es "+ k);
	     }
	     
	     
	     // Bucle WHILE
	     System.out.println("Bucle WHILE");
	     int m=1;
	     while (m<100) {    // haz el bucle hasta que se cumpla la condición k<=10
	    	 System.out.println("El numero es "+ m);
	    	 m=m*2;
	     }
	     
	     
	     // Bucle DO..WHILE
	     System.out.println("Bucle DO..WHILE");
	     int n=-9;
	     do {                // haz el bucle hasta que no se cumpla la condición k<0
	    	 System.out.println("El numero es "+n);
	    	 n++;
	     }while(n<0);
	     
	     
	     
	     
	     // llamada a clase Utilidades
	     
	     double resultado = 0;
	     String opera;
	                                                                                                                                                           
	     System.out.println("El numero de la suma static es "+ Utilidades.suma(23,45));
	     
	     System.out.println("El numero de la suma static es "+ Utilidades.pi);
	     
	     Utilidades operaciones = new Utilidades();
	     resultado = operaciones.suma(25, 51);
	     System.out.println("El numero de la suma es "+resultado);
	     resultado = operaciones.resta(25, 51);
	     System.out.println("El numero de la resta es "+resultado);
	     resultado = operaciones.multiplicacion(25, 51);
	     System.out.println("El numero de la multiplicacion es "+resultado);
	     resultado = operaciones.division(51, 25);
	     System.out.println("El numero de la division es "+resultado);
	     


/*	     
	     System.out.print( "Introduzca primer número: " );
	     numero1 = teclado.nextInt();
        
	     System.out.print( "Introduzca segundo número: " );
	     numero2 = teclado.nextInt();
	     
	     resultado = operaciones.suma(numero1, numero2);
	     System.out.println("El numero de la suma es "+resultado);
	
*/	     
	     
	     // metodo para validar un dato introducido por pantalla 
	     // mediante Try/catch
	     // repitiendo el bucle hasta que la situación de error no se produzca.
	     // para que en la llamada a numero1 y numero2 no de error, hay que inicializar
	     // ambas variables.
	     
		   //  Scanner teclado = new Scanner( System.in );
	     
	     boolean num1= false;
	     boolean num2= false;
	     
	     System.out.print( "Introduzca primer número: " );
	     while(num1 == false) {
	    	 try {

	    		 Scanner teclado = new Scanner( System.in );
	    		 numero1 = teclado.nextInt();
	    		 num1 = true;
	    	 } catch (java.util.InputMismatchException e1) {
	    		 // TODO Auto-generated catch block
	    	     System.out.print( "Introduzca un número: " );
	    	 }
	     }
	     
	     System.out.print( "Introduzca segundo número: " );
	     while(num2 == false) {
	    	 try {
	    		 Scanner teclado = new Scanner( System.in );
	    		 numero2 = teclado.nextInt();
	    		 num2 = true;
	    	 } catch (Exception e1) {
	    		 // TODO Auto-generated catch block
	    	     System.out.print( "Introduzca un número: " );	    	 
	    	 }
	}
	     
	     // Bucle WHILE Para permitir solo las operaciones autorizadas
	     System.out.println("Bucle WHILE");
	     
		 Scanner teclado2 = new Scanner( System.in );
         
		 // Haciendo la verificación con las condiciones en While
	     opera = ""; 
	     while (!opera.equals("S") && !opera.equals("R") && !opera.equals("M") && !opera.equals("D") ) {    // haz el bucle hasta que se cumpla la condición k<=10
		     System.out.print( "Introduzca operación a realizar (S,R,M o D: " );
		     opera = teclado2.next();
	     }
	     
	     

	     Operar calculo = new Operar();
	     try {
			resultado = calculo.operacion(opera, numero1, numero2);
		} catch (RangoExcepcion e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     
	     System.out.println("El resultado de la "+ opera + " es "+ resultado);
	     
         // Haciendo la verificación con un booleano y evaluando las operaciones 
	     // dentro de las condiciones en While
 	     boolean operadorIncorrecto=true;        
 	     while(operadorIncorrecto) {
		     System.out.print( "Introduzca operación a realizar (S,R,M o D: " );
		     opera = teclado2.next();
		     if (opera.equals("S")
		    	 || opera.equals("R")
		    	 || opera.equals("M")
		    	 || opera.equals("D")
		    	 ) {
		    	 operadorIncorrecto = false;
		     }
         }
	     
	     
	     Operar calculo2 = new Operar();
	     resultado = calculo2.operacion(opera, numero1, numero2);
	     System.out.println("El resultado de la "+ opera + " es "+ resultado);
	     
	     
	     
	     
	     String texto = "aadada";
	     
	     System.out.println(texto.length());
	     
	     System.out.println(texto.substring(3));
	     System.out.println(texto.substring(3,6));
	     
	     //ARRAYS
	     
	     String Diasdelasemana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	     String Mesesdelanho[];
	     Mesesdelanho = new String [12];
	     Mesesdelanho[0]="Enero";
	     Mesesdelanho[1]="Febrero";
	     Mesesdelanho[2]="Marzo";
	     Mesesdelanho[3]="Abril";
	     //...
	     for (int z=0;z<Mesesdelanho.length;z++) {
	    	 System.out.println(Mesesdelanho[z]);
	     }
	    	 
	     for (int y=0;y<Diasdelasemana.length;y++) {
	    	 System.out.println(Diasdelasemana[y]);
	     }
	     
	     String Palabra = "";
	     String Frase = "";
	     
	     System.out.println("Entramos");
	     
	     Palabra = JOptionPane.showInputDialog("Introduce palabra " );
	     

	     
	     resultado = Utilidades.Contarvocales(Palabra);
	     JOptionPane.showMessageDialog(null,resultado);
	
	     Frase = JOptionPane.showInputDialog("Introduce frase " );
	     
	     resultado = Utilidades.Contarpalabras(Frase);
	     JOptionPane.showMessageDialog(null,resultado);		 
	    		 
	}

}
