package hilos;

public class AnimalAcuatico implements Runnable{

	@Override
	public void run() {
		System.out.println("Soy un animal acuático en el Hilo: "+Thread.currentThread());
		
	}

}
