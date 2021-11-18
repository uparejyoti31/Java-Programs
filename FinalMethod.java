class FinalMethod
{
	public static void main(String arg[])
	{
		Base bobj=new Derived();   //upcasting
		bobj.fun();
	}
	
	public static void gun()
	{
		final int no=11;
		System.out.println("Static fun");
		//no++;    //Not allowed  assign value final variable
	}
}

class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}
	/*public final void gun()
	{
		System.out.println("Base gun");
	}...we can not override final method*/
}

class Derived extends Base
{
	public void fun()   //Override
	{
		System.out.println("Derived fun");
	}
	public void gun()
	{
		System.out.println("Derived gun");
	}
}	