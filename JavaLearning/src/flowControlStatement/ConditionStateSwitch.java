package flowControlStatement;

public class ConditionStateSwitch {

	/*
	 * Switch Condition Statement will not allow data type 'long', 'float' and 'double' because 
	 * its having big range and it will allow rest of all data type including 'ENUM' (from 1.5 version)
	 * and 'String' (from 1.7 version) and corresponding warper classes also. 
	 * Switch can have multiple statement and only one default statement.
	 * All case should be unique and duplicate are not allowed if we tried to duplicate then we will get run time error.
	 * Cases or Default case will be optional and without it we can't write any statement if we try we will get runtime error.
	 * 
	*/
	
	public static void main(String[] args) {
		int a=10;
			switch(a) {
			case 10: System.out.println("Ratan");
			case 20: System.out.println("Anu");
			case 30: System.out.println("Durga");
			default: System.out.println("Abhi");
			}
		}

}
