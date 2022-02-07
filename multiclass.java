
	 class Human
	{
       public void method1()
       {
       	String Name="sarthak";
        int Age=20;  
        System.out.println(Name);
        System.out.println(Age);
        // return Arrays.asList(Name,Age);
       }
	}
	class Student extends Human
	{
       public void method2()
       {
       	int Rollno=123;
        char Section='B';
        System.out.println(Rollno);
        System.out.println(Section);
        // return Arrays.asList(Rollno,Section);
       }
	} 
	class Faculty extends Human
	{
       public void method3()
       {
       	int Salary=40000;
        String Subject="maths";
        System.out.println(Salary);
        System.out.println(Subject);
        // return Arrays.asList(Salary,Subject);
       }
	} 
  class display_student
  {
    Student obj =new Student();
      obj.method1();
      obj.method2();
    }
  // void display_Faculty()
  // {
  //   Faculty obj =new Faculty();
  //   obj.method1();
  //   obj.method3();
  // }
  class Multi{
    public static void main(String arg[])
    {
      System.out.println("student details ");
    	display_student();
     //  System.out.println("Faculty details ");
     //  display_Faculty();
      // Student obj =new Student();
      // obj.method1();
      // obj.method2();
      
    }
}