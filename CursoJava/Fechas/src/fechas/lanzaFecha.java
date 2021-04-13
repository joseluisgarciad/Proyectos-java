package fechas;

import java.io.IOException;

public class lanzaFecha extends Fecha {
    
	public static final int MAX_FECHAS = 100;
	
	public static int random(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Introduzca una Fecha");
		
        try
        {
    		java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
    		java.io.BufferedReader br = new java.io.BufferedReader(isr);
    		String fechausuario = br.readLine();
    		Fecha f = new Fecha();
    		System.out.println(fechausuario.substring(4, 4) + " " + fechausuario.substring(7, 7));
    		if (fechausuario.substring(4, 5) == "/" || fechausuario.substring(7, 8) == "/") {
    			System.out.println("Has Tecleado" + fechausuario);
    		} else { 
    			throw new IOException("El mes debe estar comprendido entre 1 y 12");
            }
    		f.setAnho(random(1900, 2019));
            System.out.println("Has Tecleado" + fechausuario);
        }
        catch(FechaException e){
        }
		

		

		
	/*	
		
		for (int i = 0; i < MAX_FECHAS; i++)
		{
			try
			{
				//Fecha f = new Fecha(random(1900, 2019), random(1, Fecha.meses_Anho), random(1, 31));
				Fecha f = new Fecha();
				f.setAnho(random(1900, 2019));
				System.out.println("Fecha correcta: " + f.toString());
			}
			catch(FechaException e) {
				System.out.println("FechaException: " + e.getMessage());
			}
		}
	
	*/

 	
	}
}
