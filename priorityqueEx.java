//collection  
//Collection
//Collections


import java.util.*;  
class TestCollection12{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("d");  
queue.add("c");  
queue.add("b");  
queue.add("a");  
// System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
String value= queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
  }  
 
 }  
}  



