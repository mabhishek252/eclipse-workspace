package threading;

/*
		*Daemon Thread in Java
		Daemon thread in java is a service provider thread that provides services to the user thread. 
		Its life depend on the mercy of user threads i.e. when all the user threads dies, 
		JVM terminates this thread automatically.
		There are many java daemon threads running automatically e.g. gc, finalizer etc.
		
		*Points to remember for Daemon Thread in Java
		It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
		Its life depends on user threads.
		It is a low priority thread.
		
		There are two methods for daemon Tread
			public void setDaemon(boolean status) [It is used to mark the current thread as daemon thread or user thread]
			public boolean isDaemon() [It is used to check that current is daemon.]

Note: You can see all the detail by typing the jconsole in the command prompt. 
	  The jconsole tool provides information about the loaded classes, memory usage, running threads etc.

*/

public class Th_DeamonThread extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Current thread is Daemon Thread and name is " + Thread.currentThread().getName());
		}else {
			System.out.println("Current thread is User Thread and name is " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {

		Th_DeamonThread t1 = new Th_DeamonThread();
		Th_DeamonThread t2 = new Th_DeamonThread();
		Th_DeamonThread t3 = new Th_DeamonThread();
		
		t1.setDaemon(true);//now t1 is daemon thread  
		
		t1.start();//starting threads  
		t2.start();//starting threads  
		t3.start();//starting threads 
		
	}

}

//Note: If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.

class TestDaemonThread2 extends Thread{  
	 public void run(){  
	  System.out.println("Name: "+Thread.currentThread().getName());  
	  System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	 }  
	  
	 public static void main(String[] args){  
	  TestDaemonThread2 t1=new TestDaemonThread2();  
	  TestDaemonThread2 t2=new TestDaemonThread2();  
	  t1.start();  
	  t1.setDaemon(true);//will throw exception here  
	  t2.start();  
	 }  
	}  
