//package name
package objectclass;

public class objtclass 
{
	static int last_roll=100;
	int roll_no;
	objtclass()     //CONSTRUCTOR METHOD
	{
		 roll_no=last_roll;
		 last_roll++;
	}
	public int hashcode()     // METHOD FOR RETURNING HASHCODE VALUE OF OBJECT
	{
	         return roll_no;
	}
	public static void main(String args[])
	{
		objtclass s=new objtclass();	
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FACE");	
		Class c=obj.getClass();
		System.out.println("Class of object obj is:"+c.getName());
		s=null;
		System.gc();      //GARBAGE COLLECTION
	}
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
}
