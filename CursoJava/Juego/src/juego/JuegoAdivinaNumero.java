package juego;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class JuegoAdivinaNumero extends Juego {

//	private int numVidas = 0;
	private int adivinaNumero = 0;
	private double numeroUsuario = 0;
	
	@Override
	void Juega() {
		// TODO Auto-generated method stub
		
			 int adivinaNumero = (int)(Math.random()*(0-10+1)+10);
		 reiniciaPartida();
		 System.out.println(this.getNumVidas());
		 JOptionPane.showMessageDialog(null, "Intentelo de Nuevo!!!");

		 boolean isgameover=false;
		 do {
			     boolean correcto = false;
			     double numeroUsuario = 0;
			     while(correcto==false) {
					 numeroUsuario =  Double.parseDouble(JOptionPane.showInputDialog("Adivine un numero del 1 al 10"));
					 if (adivinaNumero == numeroUsuario) {	
						 JOptionPane.showMessageDialog(null, "CORRECTO!!!");
					 } else if (quitaVida() == true) {
						 JOptionPane.showMessageDialog(null, "Intentelo de Nuevo!!!");
					 } else if  (quitaVida() == false) {
						 JOptionPane.showMessageDialog(null, "No tienes mas vidas!!!");
					 }
			     }
		  } while (isgameover==false);
		 
		 
	}

	public JuegoAdivinaNumero() {
		
	}
	
	public JuegoAdivinaNumero(int numVidas, int adivinaNumero) {
		super(numVidas);
//		this.numVidas = numVidas;
		this.adivinaNumero = adivinaNumero;
	} 
	
	public void main(String[] args) {
		 

	}

	@Override
	public void reiniciaPartida() {
		// TODO Auto-generated method stub
		super.reiniciaPartida();
	}

	@Override
	public boolean quitaVida() {
		// TODO Auto-generated method stub
		return super.quitaVida();
	}

	
}
