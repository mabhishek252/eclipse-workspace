package flowControlStatement;

public class ConditionStateIfElse {

	public static void main(String[] args) {

		int i =10;
		
		/*
		 * If condition having only boolean argument means 'true' or 'false'
		 * 'if' condition without curly bracket, we can declare but only first statement will consider under if block
		 * and rest of will consider under class statement 
		   if(i == 20) 
			System.out.println(i); //Consider as class if condition statement
			System.out.println("I value is correct"); //Consider as class statement
			System.out.println("I value is not correct"); //Consider as class statement
		*/
		
		/*Here, we can check condition with true and false when if will have false it will execute else part
		 * and when if will have true then it will execute if statement.
		if(false) {
			System.out.println("Condition is true");
		}else 
			System.out.println("Condition is False");
		*/
		
		if (i<20) {
			System.out.println(i);
		}else {
			System.out.println("i is less then 20");
		}
		
		
	}

}
