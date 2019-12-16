package corejava;
interface  abt
{
	  abstract void m1();
}
public class anony {

	public static void main(String [] arg)
	{		
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
