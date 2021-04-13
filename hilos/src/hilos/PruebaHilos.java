

public class PruebaHilos {

	public static void main(String[] args) {
		System.out.println("Esto es el main");
		Hilo hilo1 = new Hilo ("hilo1");
		hilo1.setPriority(Thread.MIN_PRIORITY);
		hilo1.start();
		
		Thread hilo2 = new Thread(new AnimalAcuatico());
		hilo2.start();
		
		Hilo hilo3 = new Hilo();
		hilo3.setPriority(Thread.MAX_PRIORITY);
		hilo3.start();
	}

}
