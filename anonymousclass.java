//package name
package corejava;

interface  abt
{
	abstract void m1();
}
public class anonymousclass 
{
	public static void main(String [] arg)
	{	//anonymous class	
		abt obj =new abt()
	        {
			public void m1()
			{
				System.out.println("hai");
			}
	        };
	 obj.m1();	 
	}
}
