class FinalClass
{
	public static void main(String arg[])
	{
		Base bobj=new Base();
		bobj.fun();
		Demo dobj=new Demo();
		dobj.gun();
	}
}

final class Demo
{
	public int i;
	public void fun()
	{
		System.out.println("Base fun");
	}
}

class Demo
{
	public Base bobj;
	public Demo()
	{
		bobj=new Base();
	}
	public void gun()
	{
		bobj.fun();
	}
} 