package code_one;



class Test{
	
	void math(int a,int b) {
		a = a*2;
		b = b/2;
		
		System.out.println("after call "+ a +" "+ b);
		
	}
}

public class callbyvalue {
	
	
	
	
	public static void main(String args[]) {
		
		Test ob = new Test();
		int a = 15;
		int b = 20;
		System.out.println("before call "+ a + " "+ b);
		ob.math(a,b);
		
	}

}
