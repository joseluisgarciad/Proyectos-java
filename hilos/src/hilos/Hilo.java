package hilos;

public class Hilo extends Thread {
	
	public Hilo() {
		super();
	}
	
	public Hilo(String nombre, int prioridad) {
		super(nombre);
		setPriority(prioridad);
	}
	
	public Hilo(String nombre) {
		super(nombre);
	}
	
	public void run() {
		
		System.out.println("Soy el Hilo: "+Thread.currentThread());
	}

}
