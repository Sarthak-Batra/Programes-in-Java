import java.util.*;
import java.util.Scanner;
class Student{
 private  String Name;
 private  String Age;
 private  String Contact;

   // public String getName() {
   //  return Name;
   //       }
   // public String getAge() {
   //  return Age;
   //       }
   // public String getContact() {
   //  return Contact;
   //       }
       public Student(String newName ,String newAge,String newContact) {
    this.Name = newName;      
    this.Age = newAge;
    this.Contact = newContact;
    // this.display();
       }

     public void display()
       {
       	System.out.println(this.Name);
       	System.out.println(this.Age);
        System.out.println(this.Contact);
       }
}

    
class Main
{
   public static void main(String args[])
   {
      Student obj =new Student("sdfs","12", "4567890");
      Student obj2 =new Student("aass","32", "4567890");

      //  obj.display();
      //  obj1.display();

       ArrayList<Student> list=new ArrayList<Student>();
       list.add(obj);
       list.add(obj2);

     for(Student student:list){
         student.display();
     }
   }
}