package code_one;

public class recurtion {
	
	public static int ab(int n) {
		if (n<=1)
			return 1;
		else return(n*ab(n-1));
		
			
	}
	
	public static void main(String args[]) {
		
		
		System.out.println(ab(5));
		
		
		
	}
	

}
