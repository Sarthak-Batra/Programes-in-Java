class ExceptionDemo
{
	public static void main(String args[])
	{
	  try
	  {
       String str="hello world";
       System.out.println(str.length());
       char c = str.charAt(0);
       c = str.charAt(15);
       System.out.println(c);
 	  }
 	  catch(Exception e)
 	  {
 	  System.out.println(e.getMessage());
 	  e.printStackTrace();
 	  // System.out.println("StringIndexOutOfBoundException");
	  }
	 }
}