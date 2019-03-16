interface Soundable
{
	void play();
	void stop();
	default void display()
	{
		System.out.println("from Soundable..");
	}
}
interface Sizeable 
{
	void play();
	void display();
}
class Hello
{
	public void display(){}
}
class MusicSystem extends Hello implements Soundable,Sizeable
{
	public void play()
	{
		System.out.println("MusicSystem plays..");
	}
	public void stop()
	{
		System.out.println("MusicSystem Stops..");
	}
}

class Interfac{
	public static void main(String[] args)
	{
		MusicSystem m =new MusicSystem();
		m.play();
		m.stop();
		m.display();
	}
}