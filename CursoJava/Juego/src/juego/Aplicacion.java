package juego;

public class Aplicacion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
        Juego juego1 = (Juego) new JuegoAdivinaNumero();
        juego1.setNumVidas(5);
        juego1.muestraVidasRestantes();
/*        juego1.setNumVidas(juego1.getNumVidas() - 1);
        juego1.muestraVidasRestantes();
//        
        juego1.quitaVida();
        juego1.muestraVidasRestantes();
        juego1.reiniciaPartida();
        juego1.muestraVidasRestantes();        
        juego1.ActualizaRecord();
      
        
        

        
        Juego juego2 = (Juego) new JuegoAdivinaNumero();
        juego2.setNumVidas(5);
        juego2.muestraVidasRestantes();
        
        */
		
 	    JuegoAdivinaNumero adivina1 = new JuegoAdivinaNumero();       
 	    adivina1.Juega();
	}




}

