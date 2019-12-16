package corejava;

class p {
 void add(int a,int b)
 {
	 int s=a+b+10;
	 System.out.println(s);
 }
}
	
class c extends p{
	
	void add(int a,int b)
	{
		
		int s=a+b;
		System.out.println(s);
	}
	 
	 
}

public class inheritence {
public static void main(String[] args) {
     p obj=new c();
     obj.add(10,20);
}
}