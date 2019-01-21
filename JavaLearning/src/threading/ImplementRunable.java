package threading;

public class ImplementRunable implements Runnable{

	@Override
	public void run() {
		int i;
		for (i = 0; i <5; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();
	}
}
