class Trial{
	public class Details{
        String name ="sarthak";
        int id= 123;
       
    }
    static int add(int a , int b){
        int sum;
        sum = a+b;
     return sum;
    }
	public static void main(String arg[]){
     System.out.println(add(2,3));

     Trial ayush=new Trial();

// To create an object for internal class we write outer_object.new then internal class! as below
     Trial.Details sarthak=ayush.new Details();

     System.out.println(sarthak.name);

	}
}