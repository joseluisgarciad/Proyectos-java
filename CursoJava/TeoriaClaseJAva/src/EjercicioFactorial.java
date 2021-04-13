
public class EjercicioFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bucle FOR
	     System.out.println("Bucle FOR");
	     long j=14;
	     for (long k=14-1; k>=1; k--) {   // haz el bucle mientras se cumpla la condición k<=10

	    	 System.out.println("El numero es "+ j + " " + k);	  
	    	 j=j*k;
	    	 }
    
	     
	     // Bucle WHILE
	     System.out.println("Bucle WHILE");
	     long m=14; 
	     long n=14-1;
	     while (m>1) {    // haz el bucle hasta que se cumpla la condición k<=10	    	 
	    	 System.out.println("El numero es " + m + " " + n);
	    	 m=m*n;
	    	 n--;


	    	

	     }

	}
}
