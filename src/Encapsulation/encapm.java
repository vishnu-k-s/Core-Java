package Encapsulation;

import java.util.Scanner;

public class encapm 
{
	public static void main(String[] args) 
	{
		encap obj=new encap();		
		Scanner s=new Scanner(System.in);
		
		//TO SET VALUEES
		System.out.println("Enter your name");
		obj.setname(s.next());
		System.out.println("Enter your address");
		obj.setaddress(s.next());
		System.out.println("Enter your Contact Number");
		obj.setcontactno(s.nextLong());
		System.out.println("Enter your E-Mail ID");
		obj.setemailid(s.next());
		
		//TO GET VALUES
		System.out.println("\t\t\tDetails\t\t\t");
		System.out.println("name: "+obj.getname());
		System.out.println("address: "+obj.getaddress());
		System.out.println("contactNumber: "+obj.getcontactno());
		System.out.println("Email: "+obj.getemailid());
	}

}