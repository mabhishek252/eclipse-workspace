package keywordStatic;

/*
 * Static Members of class are accessed by class Name, Since static members are class Members.
 * Non Static members of class are accessed by object. Non Static members are object members
*/

public class StaticCheck {

	public void StaticCheck1() {
		System.out.println("Non Static Method -1");
	}

	public void StaticCheck2() {
		StaticCheck1();//Non Static Method can call directly on Non Static Method
		
		System.out.println("Non Static Method -2");
	}
	
	public static void StaticCheck3() {
		StaticCheck obj = new StaticCheck();
		obj.StaticCheck1(); //Non Static Method should be call via object of class on Static Method
		
		System.out.println("Static Method -1");
	}
	
	public static void StaticCheck4() {
		StaticCheck3();		//Static method can be called directly on static method with in class
		
		System.out.println("Static Method -2");
	}
	
}
