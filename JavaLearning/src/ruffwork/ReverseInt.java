package ruffwork;

public class ReverseInt {
	
	/*	Java reverse an integer value
	Modding (%) the input by 10 will extract off the rightmost digit , example: (12345 % 10 = 5);
	Multiplying an integer b 10 will "push it left" exposing a zero to the right of that number, example: (5*10= 50);
	Dividing an integer  10 will remove the rightmost digit, example: (12345 / 10 = 1234);
	*/
	
	public static void main(String[] args) {
		String s = "12345";
		int input = Integer.parseInt(s);
		int reverseNum = 0;

		while (input != 0) {
			reverseNum = reverseNum * 10 + input % 10;
			input = input / 10;
			// System.out.println(input);
			// break;
		}
		
		System.out.println(reverseNum);

	}
}
