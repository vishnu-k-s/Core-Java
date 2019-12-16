package corejava;
interface interfaceexample {
	void m1();
	void m2();
	void m3();
}
class main implements interfaceexample{
	public void m1()
	{
		System.out.println("Inside m1 ");		
	}
	public void m2()
	{
		System.out.println("Inside m2 ");		
	}
	public void m3()
	{
		System.out.println("Inside m3 ");		
	}

	public static void main(String[] args) {
		interfaceexample obj=new main();
		obj.m1();
		obj.m2();
		obj.m3();	
	}
}
