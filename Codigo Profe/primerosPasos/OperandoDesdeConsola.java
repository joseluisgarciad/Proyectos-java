package primerosPasos;
=
//

public class OperandoDesdeConsola {

	public static void main(String[] args) {
		int  operando1=0,operando2=0;
		double resultado;
		String operador="";
		
		boolean operadorIncorrecto=true;
		boolean op1=false;
		boolean op2=false;
		
		
		//Scanner scan = new Scanner(System.in);
		
		while(op1==false) {
			System.out.println("Escribe el primer operando (entero)");
			try {
				Scanner scan = new Scanner(System.in);
				operando1 = scan.nextInt();
				op1=true;
			} catch (Exception e) {
				System.out.println("Tienes que introducir un entero");
			}
		}
		
		while(op2==false) {
			System.out.println("Escribe el segundo operando (entero)");
			try {
				Scanner scan = new Scanner(System.in);
				operando2 = scan.nextInt();
				op2=true;
			} catch (Exception e) {
				System.out.println("Tienes que introducir un entero");
			}
		}
		while(operadorIncorrecto) {
			System.out.println("Escribe el tipo de operación (+,-,*,/)");
			Scanner scan = new Scanner(System.in);
			operador = scan.next();
			if(    operador.equals("+") 
				|| operador.equals("-")
				|| operador.equals("*")
				|| operador.equals("/") 
			   ) {
				operadorIncorrecto=false;
			}
		}
		
		Util util = new Util();
		resultado = util.operar(operando1,operando2,operador);
	    if (resultado==-9999) {
	    	System.out.println("operación inválida");
	    }else if (resultado == -99999){
	    	System.out.println("No se puede dividir por cero");
	    }else {
	    	System.out.println(resultado);
	    }
	}

}
