package keywordTHIS;

public class CheckThisKeyword {
	int a ;
	int b ;
	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void showData() {
		
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
	}
	public static void main(String[] args) {

		CheckThisKeyword obj = new CheckThisKeyword();
		obj.setData(3, 4);
		obj.showData();
		
	}

}
