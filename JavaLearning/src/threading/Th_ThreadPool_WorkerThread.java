package threading;

public class Th_ThreadPool_WorkerThread implements Runnable{

	private String message;
	public Th_ThreadPool_WorkerThread(String s) {
		this.message = s;
	}
	
		public void run() {
			System.out.println(Thread.currentThread().getName() + "(Start) Message => " + message);
			processmessage();//call processmessage method that sleeps the thread for 2 seconds
			System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
		}
	
		public void processmessage() {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	
}
