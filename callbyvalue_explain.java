package code_one;


class Test{
	
	int math(int i) {
		
		return(i*i);
		
	}
	
}



public class callbyvalue {
	
	
	
	
	public static void main(String args[]) {
		Test obj = new Test();
		int x = 15;
		System.out.println(x);
		int y = obj.math(x);
		System.out.println(y);
		
		
	}

}
