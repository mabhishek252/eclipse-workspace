package threading;
/*		
		The Thread class provides methods to change and get the name of a thread. 
		By default, each thread has a name i.e. thread-0, thread-1 and so on. 
		By we can change the name of the thread by using setName() method.
		
*/

public class Th_Naming extends Thread{

	public void run() {
		System.out.println("running...");
	}
	
	public static void main(String[] args) {
		
		Th_Naming t1 = new Th_Naming();
		Th_Naming t2 = new Th_Naming();

		System.out.println("Name of thread default by JVM" + "\n");
		System.out.println("Name of t1 Thread = " + t1.getName()); 
		System.out.println("Name of t1 Thread = " + t2.getName() + "\n");
		
		t1.setName("My first Thread");
		t2.setName("My Second Thread");
		
		System.out.println("Name of thread After naming"+ "\n");
		System.out.println("Name of t1 Thread = " + t1.getName()); 
		System.out.println("Name of t1 Thread = " + t2.getName());

	}

}
