package corejava;

public class outer {
    protected int a=100;
    public void  disp1()
	  {
		  System.out.println("value is :"+(a+a));
	  }
	class inner{
	  public void  disp()
	  {
		  System.out.println("value is :"+a);
	  }
	
	}
	public static void main(String [] arg)
	{
		outer obj=new outer();
	    System.out.println(obj.a);
		outer.inner obj1=new outer().new inner();
		obj1.disp();
		obj.disp1();
		
	}
	
}
