import java.util.*;

class Command1
{
	public static void main(String arg[])
	{
		System.out.println("Total number of argument are:"+arg.length);
		
		System.out.println("Command line arguments are:");
		
		for(int i=0;i<arg.length;i++)
		{
			System.out.println(arg[i]);
		}
	}
}
