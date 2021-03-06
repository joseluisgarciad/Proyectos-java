



import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Conversor_Divisas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado = 0;
		String divisaOrigen = "";
		String divisaDestino = "";
		double cantidad = 0;
		
        Scanner teclado = new Scanner( System.in );

        JOptionPane.showMessageDialog(null, "Bienvenido al Conversor");
        
        
	     while (!divisaOrigen.equals("EUR") && !divisaOrigen.equals("USD")) {    // haz el bucle hasta que se cumpla la condición k<=10
		     divisaOrigen = JOptionPane.showInputDialog("Convertir DE (EUR o USD)");
	     }
	     while (!divisaDestino.equals("EUR") && !divisaDestino.equals("USD")) {    // haz el bucle hasta que se cumpla la condición k<=10
	    	 divisaDestino = JOptionPane.showInputDialog("Convertir A (EUR o USD): " );
	     }
	     
	     
	     
	     try {
			while ((cantidad<=0)) {    // haz el bucle hasta que se cumpla la condición
				 cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca importe: " ));
			 }
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }


        // instanciando la clase como nuevo objeto
//		Conversor conv = new Conversor();
//		resultado = conv.convertir(divisaOrigen, divisaDestino, cantidad);
	    
	    // Convirtiendo el metodo en static
	     resultado = Utilidades.Conversor(divisaOrigen, divisaDestino, cantidad);
		
	     JOptionPane.showMessageDialog(null, "El resultado de la conversión de "+ divisaOrigen +  " a " + divisaDestino + " es: "+ resultado);
	     
	     System.out.println("El resultado de la conversión de "+ divisaOrigen +  " a " + divisaDestino + " es: "+ resultado);
	     
	     System.out.println(Utilidades.mDolar + " y " + Utilidades.mEUR); 
 	     
	}

}
