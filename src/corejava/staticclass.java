package corejava;

public class staticclass {
	static int  c=0;
	staticclass()
	{
		c++;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticclass obj=new staticclass();
		staticclass obj1=new staticclass();
		staticclass obj2=new staticclass();


	}

}
