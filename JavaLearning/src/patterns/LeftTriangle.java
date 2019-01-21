package patterns;

public class LeftTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			//int row = 5;
		for(int i=5; i>=1;i--){
			for(int x =1; x<=i; x++){
				System.out.print(" ");
			}
			for(int y =5; y>=i; y--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
