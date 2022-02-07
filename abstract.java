import java.util.Scanner;
abstract class Animal
{
	String name;
	int legs;
	String color;
	Scanner input=new Scanner(System.in);

	void details()
	{
	legs=input.nextInt();
	color=input.next();
	System.out.println("Legs = " +legs);
	System.out.println("color = " +color);
	}
   abstract void sound();
}
class Cow extends Animal
{ 
    
	void sound()
	{
	  System.out.println("Cow");
      System.out.println("Sound = mow" );
	}
}

class Dog extends Animal
{ 
	void sound()
	{
	  System.out.println("Dog");
      System.out.println("Sound = bark");
	}
}
class Cat extends Animal
{ 
    
	void sound()
	{
	  System.out.println("Cat");
      System.out.println("Sound = meow" );
	}
}
class Main
{
	public static void main(String arg[])
	{
    Cow obj =new Cow();
    obj.details();
    obj.sound();
	


	Dog obj1 =new Dog();
	



	Cat obj2 =new Cat();

   }
}