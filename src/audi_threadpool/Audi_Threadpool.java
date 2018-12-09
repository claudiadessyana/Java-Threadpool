package audi_threadpool;
/**
 *
 * @author Claudia.DK
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Audi_Threadpool {
	public static void main(String[] args) {
 
		ExecutorService service = Executors.newFixedThreadPool(3);
                
                for (int i=1; i<=100; i++){
                    if (i%2==1)
                        service.submit(new Threadpool(i));
                }
                service.shutdown();
                
                try{
                    service.awaitTermination(1, TimeUnit.DAYS);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.err.println("Counting Odds 1 until 100, success !!");
        }
        
}
  
    
    


