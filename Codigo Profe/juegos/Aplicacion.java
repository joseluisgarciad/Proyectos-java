package juegos;

public class Aplicacion {

	public static void main(String[] args) {
		//Ejercicio 1
		/*
		Juego juego1 = new Juego(5);
		Juego juego2 = new Juego(5);
		System.out.println(juego1.getVidasRestantes());
		juego1.quitaVida();
		System.out.println(juego1.getVidasRestantes());
		juego1.reiniciaPartida();
		System.out.println(juego1.getVidasRestantes());
		juego1.actualizaRecord();
		juego2.actualizaRecord();
		*/
		
		
		//Ejercicio 2
		JuegoAdivinaNumero jan1 = new JuegoAdivinaNumero(5,7);
		jan1.juega();
	}

}
