class AbstractDemo
{
	public static void main(String arg[ ])
	{
		System.out.println("Inside Main");
		//Demo obj=new Demo();  //error
		Demo obj;   //Allowed
		obj=new Hello();  //upcasting
		obj.fun();    //fun of hello
		obj.gun();  //gun of demo
		obj.sun();  //sun of hello
		System.out.println(obj.i);  //10
		System.out.println(obj.j);  //20
	}
}
abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside Demo constructor");
		i=10;
		j=20;
	}
	public void fun()
	{
		System.out.println("Inside Demo fun");
	}
	public void gun()
	{
		System.out.println("Inside Demo gun");
	}
	public abstract void sun();  //virtual void sun()=0;
	
}
class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside constructor of Hello");
		x=10;
		y=20;
		
	}
	public void fun()  //Overriding
	{
		System.out.println("Inside fun of Hello");   //override
	}
   public void sun()
   {
	   System.out.println("Inside sun Hello"); 
   }   
}

