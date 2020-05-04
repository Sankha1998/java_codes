package lockdown;

interface figure
{
	public final static double pi=3.14;
	public void getArea();
} 

class square implements figure 
{
	float x;
	public void setdimension(float y)
	{
		x=y;
	}
	public void getArea()
	{
		float t =x*x;
		System.out.println(t);
	}
}

class rectangle implements figure 
{
	float l ,b ;
	public void setdimension (float a,float c)
	{
		l=a;
		b=c;
	}
	public void getArea()
	{
		float t =l*b;
		System.out.println(t);
	}
}
class circle implements figure 
{
	float r;
	public void setdimension (float a)
	{
		r=a;
	}
	public void getArea()
	{
		double t =pi*r*r;
		System.out.println(t);
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		square S = new square();
		S.setdimension(13);
		S.getArea();
		
		
		rectangle R = new rectangle();
		R.setdimension(8,10);
		R.getArea();
		
		circle C = new circle();
		C.setdimension(3);
		C.getArea();
		// TODO Auto-generated method stub

	}

}
