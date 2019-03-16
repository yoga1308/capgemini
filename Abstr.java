abstract class Engine
{
	int i=10;
	public abstract void bhp();
	public abstract void colour();
}
class car extends Engine
{
	car()
	{
	System.out.println(i);
	}
	public void bhp()
	{
		System.out.println("1800bhp");
	}
	public void colour()
	{
		System.out.println("silver");
	}
}
class Train extends Engine
{
	int i=20;
	Train()
	{
		System.out.println(i);
	}
	public void bhp()
	{
		System.out.println("18000bhp");
	}
	public void colour()
	{
		System.out.println("red");
	}
}

class Abstr{
	public static void main(String[] args)
	{
		Engine e  =new car();
		e.bhp();
		e.colour();
		e=new Train();
		e.bhp();
		e.colour();
	}
}