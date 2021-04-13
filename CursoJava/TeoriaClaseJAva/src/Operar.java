
public class Operar {
	public double operacion (String op1, int s1, int s2) throws RangoExcepcion {
		
		if(s1<0 || s2<0) {
			throw new RangoExcepcion("Los operandos no pueden ser negativos");
		} else if (s1>100000 || s2>10000){
			throw new RangoExcepcion("Los operandos no pueden ser mayores de 100.000");
		} else {
			
			double resul = -999;
			
			System.out.println(op1);
			if (op1.equals("S")) {  // hay que usar .equals() siempre que comparemos
				                    // objetos primitivos  ( para no igual (!op1.equals)
				resul = s1+s2;
			} else if (op1.equals("R")) {
				resul = s1-s2;
			} else if (op1.equals("M")) {
				resul = s1*s2;
			} else if (op1.equals("D")) {
				if (s2 == 0) {
					resul = -99999;
				}
				resul = s1/s2;
			} else {
				resul = -999;
			}
			 
			return resul;
	
	/*		
			switch (op1) {
			case "S":
				resul = s1+s2;
				break;
		    case "R":
			    resul = s1-s2;
			    break;
	        case "M":
		        resul = s1*s2;
		        break;
	        case "D":
	        	if(s2==0) {
	        		return -9999;
	        	}		
		        resul = s1/s2;
		        break;
	       }
	*/       
		}
	}
}   


