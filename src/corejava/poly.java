package corejava;

public class poly {

	
	public void area(int x)
	{
		System.out.println("area of squre :"+(x*x));
	}
	public void area(int x,int y)
	{
		System.out.println("area is rectangle :"+(x*y));
	}
	public void area(double x)
	{
		System.out.println("area is circle :"+(3.14*x*x));
	}
	public void area(double x,double y)
	{
		System.out.println("area is Triangle :"+(x*y)/2);
	}
	
	
	public static void main(String[] args) {
		poly obj=new poly ();
		obj.area(5);
		obj.area(5,10);
		obj.area(5.5);
		obj.area(5.5,10.5);
	}
}
