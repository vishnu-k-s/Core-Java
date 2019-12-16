package corejava;


import java.io.IOException;
import java.util.Scanner;

public class cs1c {
String name;
String address;
Long contactno;
String emailid;
void setname(String name)
{
this.name=name;
}
void setaddress(String address)
{
this.address=address;
}
void setcontactno(Long contactno)
{
this.contactno=contactno;
}
void setemailid(String emailid)
{
this.emailid=emailid;
}
String getname()
{
return name;
}
String getaddress()
{
return address;
}
Long getcontactno()
{
return contactno;
}
String getemailid()
{
return emailid;
}
public static void main(String args[]) throws IOException {
String name;
String address;
Long contactno;
String emailid;
String a=null;
int reg=0;
cs1c obj=new cs1c();
//do
//{
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
    obj.setname(s.next());
System.out.println("Enter your address");
obj.setaddress(s.next());
System.out.println("Enter your Contact Number");
    obj.setcontactno(s.nextLong());
System.out.println("Enter your E-Mail ID");
obj.setemailid(s.next());
System.out.println("\t\t\tDetails\t\t\t");
System.out.println("name: "+obj.getname());
System.out.println("address: "+obj.getaddress());
System.out.println("contactNumber: "+obj.getcontactno());
System.out.println("Email: "+obj.getemailid());


}
}
