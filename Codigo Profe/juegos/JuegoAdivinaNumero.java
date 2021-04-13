package juegos;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
	private int numero;

	public JuegoAdivinaNumero(int vidasRestantes, int numero) {
		super(vidasRestantes);
		this.numero=numero;
	}

	@Override
	public void juega() {
		super.reiniciaPartida();
		int numeroUsuario=0;
		boolean isgameover=false;
		System.out.println("Juego Adivina un n�mero del 1 al 10");
		do {
			boolean numCorrecto=false;
			while(numCorrecto==false) {
				System.out.println("Escribe tu n�mero");
				try {
					Scanner scan = new Scanner(System.in);
					numeroUsuario = scan.nextInt();
					if(numeroUsuario>0 && numeroUsuario<11) {
						numCorrecto=true;
					}
				} catch (Exception e) {
					System.out.println("Tienes que introducir un entero de 1 a 10");
				}
			}
			if(numeroUsuario==this.numero) {
				System.out.println("Acertaste!!");
				super.actualizaRecord();
				isgameover=true;
			}else {
				boolean hayVida = super.quitaVida();
				if (hayVida) {
					if(numeroUsuario<this.numero) {
						System.out.println("El n�mero es mayor");
					}else {
						System.out.println("El n�mero es menor");
					}
				}else {
					isgameover=true;
					System.out.println("No te quedan vidas. Bye!!");
				}
			}
		}while(!isgameover);
	}

}
