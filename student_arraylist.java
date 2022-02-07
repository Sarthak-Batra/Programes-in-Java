import java.util.*;
class Student_Arraylist{
	public static void main(String args[]){

      Student obj =new Student("sdfs","12", "4567890");
      Student obj2 =new Student("aass","32", "4567890");
       ArrayList<Student> list=new ArrayList<Student>();
       list.add(obj);
       list.add(obj2);

     for(Student student:list){
         student.display();
     }
   }
}
