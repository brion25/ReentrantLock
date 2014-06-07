import java.util.concurrent.*;


public class Setup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue fila = new ArrayBlockingQueue(1000);
		Productor p=new Productor(fila);
		Consumidor c1=new Consumidor(fila, "Hilo 1");
		Consumidor c2=new Consumidor(fila, "Hilo 2");
		
		new Thread(p).start();
		new Thread(c1).start();
		new Thread(c2).start();

	}

}
