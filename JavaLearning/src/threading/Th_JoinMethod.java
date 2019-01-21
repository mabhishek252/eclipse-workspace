package threading;

	/*	
    The join() method waits for a thread to die. 
	In other words, it causes the currently running threads to 
	stop executing until the thread who executing with joins method with completes its task.
	*/

public class Th_JoinMethod extends Thread{

	public void run() {
		for(int i=1; i<=5; i++)
			
			try {
				Thread.sleep(500);
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
	}
	
	public static void main(String[] args) {

		Th_JoinMethod t1 = new Th_JoinMethod();
		Th_JoinMethod t2 = new Th_JoinMethod();
		Th_JoinMethod t3 = new Th_JoinMethod();
		
		t1.start();
		
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		t3.start();
	}

}
