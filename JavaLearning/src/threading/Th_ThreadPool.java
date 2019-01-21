package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Th_ThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<4; i++) {
			Runnable worker = new Th_ThreadPool_WorkerThread("" + i);
			executor.execute(worker);//calling execute method of ExecutorService  
		}
		executor.shutdown();
		/*while (!executor.isTerminated()) {
			System.out.println("Finished all threads");
		}*/
		
	}

}

