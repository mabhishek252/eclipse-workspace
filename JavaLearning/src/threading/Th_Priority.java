package threading;

/*
		Each thread have a priority. Priorities are represented by a number between 1 and 10.
		In most cases, thread scheduler schedules the threads according to their priority 
		(known as preemptive scheduling). But it is not guaranteed because it depends on 
		JVM specification that which scheduling it chooses.
		
		Three constants defined in Thread class:
			public static int MIN_PRIORITY
			public static int NORM_PRIORITY
			public static int MAX_PRIORITY
		
	Note: Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
*/

public class Th_Priority extends Thread{

	public void run() {
		System.out.println("Running thread Name is - " + Thread.currentThread().getName());
		System.out.println("Running thread Priority is - " + Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {

		Th_Priority t1 = new Th_Priority();
		Th_Priority t2 = new Th_Priority();
		Th_Priority t3 = new Th_Priority();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		
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
