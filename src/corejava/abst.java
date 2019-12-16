package corejava;

class abst{
	
	public static void main(String[] args) {
		abst obj1=new abst();
		boo obj=new boo();
		obj.sound();
	}
}
 abstract class ab {
	public abstract  void sound();	
}

class a extends ab{
	public void sound()
	{
		System.out.println("wooooooof");
	}
	
}
class boo extends ab{
	public void sound()
	{
		System.out.println("roarrrrr");
	}
 
}
