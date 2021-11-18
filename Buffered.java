import java.io.*;

class Buffered
{
	public static void main (String arg[]) throws Exception
	{
		//InputStreamReader iobj=new InputStreamReader(System.in);`	
		//BufferedReader bobj=new BufferedReader(iobj);
		
    BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter your Name");
		String str=bobj.readLine();
		
		System.out.println("Enter your age");
		int age =Integer.parseInt(bobj.readLine());
		System.out.println("Your Name:"+str);
		System.out.println("Your age:"+age);
			
	}
	
}