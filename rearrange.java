import java.util.Scanner;

	class Scan
	{    
        public void scan(){
		System.out.println("enter number of inputs to find greatest");
		Scanner input = new Scanner(System.in);
	    int A ;
	    A = input.nextInt();
		int B[]= new int[A];
		for(int i=0;i<A;i++)
		{
			System.out.println("no. "+i +" = " );
			B[i] =input.nextInt();
        }
	}
   }
	class Method
	{
        public void method(int A,int B[])
        {
		int greater;
        greater=B[0];
        for(int i=0;i<A;i++)
        {
        	if(B[i]>greater)
        		{
        			greater=B[i];
        		}	
        }
        System.out.print("greatest = " +greater);
	}
 }
class Rearrange{
	public static void main(String arg[])
	{
	    Scan obj =new Scan();
	    Method obj1 =new Method();
         obj.scan();
         // int C[]= B[] ;
         // int B[] = {4,5,6,7,8};
        obj1.method(A,B[]);
       
}
}