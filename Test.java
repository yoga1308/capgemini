class Animal
{
	int a=10;
	public void eat()
	{
		System.out.println("animal eat");
	}
}
class Dog extends Animal
{
	int a=20;
	public void eat()
	{
		System.out.println("Dog eat");
	}
	public void bark()
	{
		System.out.println("Dog barks!!!");
	}
}

class Test{
	public static void main(String[] args)
	{
		Animal d =new Dog();
		//(d).bark();
		System.out.println(((Dog)d).a);
	}
}