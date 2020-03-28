package code_two;

class A{
	
	void work(int a){
		 a*=5;
		 
		
	}
}


public class callbyvalue{
	
	public static void main(String args[]) {
		
		A obj = new A();
		
		int x = 20;
		System.out.println("Before passing the value is"+ x);
		obj.work(x);
		System.out.println("After passing the value is"+ x);
		
		
		
		
	}

}
