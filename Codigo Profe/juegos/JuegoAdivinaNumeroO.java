package juegos;

import java.util.Scanner;

public class JuegoAdivinaNumeroO extends Juego {

	private int numero;
	
	public JuegoAdivinaNumeroO(int vidasRestantes,int numero) {
		super(vidasRestantes);
		this.numero=numero;
	}

	@Override
	public void juega() {
		super.reiniciaPartida();
		int numeroUsuario=0;
		boolean numCorrect=false;
		boolean gameover=false;
		System.out.println("Adivina un número entero del 1 al 10");
		do {
			while(numCorrect==false) {
				System.out.println("Introduce tu número");
				try {
					Scanner scan = new Scanner(System.in);
					numeroUsuario = scan.nextInt();
					numCorrect=true;
				} catch (Exception e) {
					System.out.println("Tienes que introducir un entero");
				}
			}
			if (numeroUsuario==numero) {
				System.out.println("Acertaste");
				super.actualizaRecord();
				gameover=true;
			}else {
				boolean hayVida = super.quitaVida();
				if (hayVida) {
					numCorrect=false;
					if(numeroUsuario<numero) {
						System.out.println("El número es mayor. Inténtalo de nuevo");
					}else {
						System.out.println("El número es menor. Inténtalo de nuevo");
					}
				}else {
					System.out.println("No te quedan vidas. Bye!");
					gameover=true;
				}
			}
		} while (gameover==false);
	}

}
