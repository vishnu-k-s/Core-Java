package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class stringexample5 
{
	public static void main(String[] args) 
	{
		BufferedReader br=null;
		try 
		{			
			String line;
			br=new BufferedReader(new FileReader("C:\\Users\\user_2\\eclipse-workspace\\corejava\\src\\strings\\cr71.txt"));
			
			while((line=br.readLine()) != null)
			{
				System.out.println();
				StringTokenizer stringTokenizer  = new StringTokenizer (line,"|");  
				
				while( stringTokenizer.hasMoreElements())
				{
				
					Integer id= Integer.parseInt(stringTokenizer.nextElement().toString());
					Double price=Double.parseDouble(stringTokenizer.nextElement().toString());
					String Username=stringTokenizer.nextElement().toString();
					StringBuilder sb=new StringBuilder();
					sb.append("\n id is"+id);
					sb.append("\n price is"+price);
					System.out.println();
					sb.append("\n user name is "+Username);						
					sb.append("\n*****************\n");
					System.out.println(sb);			
				}
			}
			System.out.println("done");		
		}
		catch(IOException e)
		{
			e.printStackTrace();		
		}
		finally
		{			
			try
			{				
				if(br != null)
					br.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}		
	}
}