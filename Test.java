package lockdown;

interface FirstInterface{
	public void myMethod(); //interface method
}

interface SecondInterface{
	public void myOtherMethod();  //interface method
}

class DemoClass implements FirstInterface , SecondInterface
{
	public void myMethod()
	{
		System.out.println("My method printed....");
	}
	public void myOtherMethod()
	{
		System.out.println(" other methon printed....");
	}
}

public class Test {

	public static void main(String[] args) {
		
		
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();// TODO Auto-generated method stub

	}

}
