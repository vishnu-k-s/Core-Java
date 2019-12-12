//package name
package wraper;

public class unboxing 
{
	public static void main(String[] args) 
	{
		Integer a= new Integer(10);
		int i=a.intValue();//UN BOXING
	        int j=i;           //UN BOXING
	        System.out.println(a+" "+i+" " +j);
	}
}
