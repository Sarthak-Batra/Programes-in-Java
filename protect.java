class A
{
	protected int ayush;
	private int sarthak;
	public int java;
}

class B extends A
{
    void b()
    {
      this.ayush=20;
      System.out.println("class B"+ayush);   //protected
      // this.sarthak=25;
   	  // System.out.println("class B"+sarthak); //private
	  this.java=30;
	  System.out.println("class B"+java);  //public
    }
}
class Main
{
	public static void main(String arg[])
	{
	B obj = new B();
	obj.b();
    }
}