package threading;

public class ExtendsThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread();
		
		t1.start();
		t1.isAlive();
		
	}

}
