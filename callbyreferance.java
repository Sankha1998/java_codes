package code_two;


class T{
	int a,b;
	void getdata(int i, int j)
	{
		a=i;
		b=j;
	}
	
	
	void m (T o){
		o.a = o.a*2;
		o.b = o.b/2;
	}
	
}

public class callbyreferance {

	
		public static void main(String args[]){
	        T ob = new T();
			ob.getdata(15,20);
			System.out.println("ob.a and ob.b before call"+ " " +ob.a +" "+ob.b);
			ob.m(ob);
			System.out.println(" ob.a and ob.b  after call"+" " +ob.a +" "+ob.b);
		}

	
	
	
}
