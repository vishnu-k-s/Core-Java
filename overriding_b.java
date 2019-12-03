package corejava;

public class overrb {
		
		public void show() 
		{
		System.out.println("Inside A");
		}
}

class child extends overrb {
		public void show() 
		{
			System.out.println("Inside B");
		}
		
}
class ch1 extends child{
		public void show()
		{
			System.out.println("Inside C");
		}
		
}
