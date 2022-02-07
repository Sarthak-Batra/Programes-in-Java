class ThreadA extends Thread
{
	public void run()
	{
	  for(int i=0;i<5;i++)
	   {
         System.out.println("hello"+i);
         try{
				Thread.sleep(1000);
				}catch(InterruptedException e){}
	   }
    }
}
class ThreadB implements Runnable
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("world"+j);
			try{
				Thread.sleep(1000);
			}
				catch(InterruptedException e){}
		}	
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		ThreadA obj1 = new ThreadA();
		obj1.start();

		ThreadB obj2 = new ThreadB();
		Thread obj3 = new Thread(obj2);
        obj3.start();
	}
}