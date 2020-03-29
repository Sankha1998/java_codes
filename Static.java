package code_two;

class S{
	static int a = 42;
	static int b = 99;
	static void callme()
	{
		System.out.println("d = " +a);
	}
}

public class Static {

	public static void main(String args []) {
		
		
		S ob = new S();
		S.callme();
		System.out.println("b = " + S.b);
		
		
	}
}
