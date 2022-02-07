class Trial{
	static int a=10;
	int b = 2;
	int square(int a){
      return a*a;
	}
    static int add(int a , int b){
        int sum;
        sum = a+b;
     return sum;
    }
	public static void main(String arg[]){
     System.out.println(a);
     System.out.println(add(2,3));
     Trial ayush=new Trial();
     System.out.println("square of number = "+ayush.square(2));
	}
}