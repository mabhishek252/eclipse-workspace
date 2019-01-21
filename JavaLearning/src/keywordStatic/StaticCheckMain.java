package keywordStatic;

public class StaticCheckMain extends StaticCheck {

	public static void main(String s) {
		System.out.println("Check");
	}
	
	synchronized public  static  void  main(String[] s) {

		StaticCheck obj = new StaticCheck();
		StaticBlock objblock = new StaticBlock();
		/*	
		obj.StaticCheck1();//Non Static Method should be call via object of class on Static Method
		obj.StaticCheck2();//Non Static Method should be call via object of class on Static Method
		obj.StaticCheck3();//Static method can also called via object of class but we will get suppressed warning
		
		StaticCheck.StaticCheck3(); //Static method should be called via class name reference
		StaticCheck.StaticCheck4();*/
		
		
		//Simple block
	
		
		//objblock.toString();
		System.out.println(objblock);
		
	}

}
