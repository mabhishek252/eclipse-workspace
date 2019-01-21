package threading;

public class Th_ThreadGroup extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Th_ThreadGroup runable = new Th_ThreadGroup();
		
		ThreadGroup tg1 = new ThreadGroup("Parent TG");
		ThreadGroup tg2 = new ThreadGroup(tg1, "Child TG");
		
		Thread t1 = new Thread(tg1, runable, "Thread-1");
		Thread t2 = new Thread(tg2, runable, "Thread-2");
		Thread t3 = new Thread(tg1, runable, "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Thread Group Name - " + tg1.getName() + ", Thread Group Parent Name - " + tg1.getParent());
		System.out.println("Thread Group Name - " + tg2.getName() + ", Thread Group Parent Name - " + tg2.getParent());
		
		tg1.list();
		tg2.list();
	}
	
}
