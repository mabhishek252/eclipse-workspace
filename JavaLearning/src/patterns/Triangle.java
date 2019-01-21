package patterns;

import ruffwork.A;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i =5; i>=0; i--){
			for(int j =1; j<=5; j++){
				System.out.print(" ");
			}
			for(int k =5; k>=i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



 class B{
	
}