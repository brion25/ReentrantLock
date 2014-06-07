import java.util.concurrent.*;

public class Productor implements Runnable{
	private final BlockingQueue fila;
	
	public Productor(BlockingQueue q) {
		fila = q;
	}
	
	@Override
	public void run() {
		try{
			long val=0;
			boolean flag=true;
			while(flag){
				Thread.sleep(1333);
				if(val>1000){
					flag=false;
				}
				fila.put(val);
				val++;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
