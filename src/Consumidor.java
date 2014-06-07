import java.util.concurrent.*;

public class Consumidor implements Runnable{

	private final BlockingQueue fila;
	private final String hiloNombre;
	
	public Consumidor(BlockingQueue q,String nom) {
		fila = q;
		hiloNombre = nom;
	}
	
	public void run(){
		try{
			boolean flag=true;
			int con=0;
			while(flag){
				consumir(fila.take());
				if(con>400){
					flag=false;
				}
				con++;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	void consumir(Object x) throws InterruptedException{
		System.out.println("Consumiendo "+hiloNombre+" Valor de la fila: "+x);
		Thread.sleep(1000);
	}
}
