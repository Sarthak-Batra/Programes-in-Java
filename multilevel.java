
 class A
	{
       public void method1()
       {
       	System.out.println("class A");
       }
	}
 class B extends A
	{
       public void method2()
       {
       	System.out.println("class b");
       }
	} 
 class C extends B
	{
       public void method3()
       {
       	System.out.println("class c");
       }
	} 
	class Multi{
    public static void main(String arg[])
    {
    	C obj =new C();
    	obj.method1();
    	obj.method2();
    }

}