import java.util.*;
class Arraylist{
	public static void main(String args[]){

	  // ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      // list.add("Mango");  
      // list.add("Apple");    
      // list.add("Banana");    
      // list.add("Grapes");    
       
      // // System.out.println(list); 
      // Iterator itr=list.iterator();
      // while(itr.hasNext()){
      // System.out.println(itr.next()); 
      // }   


	  // ArrayList randomlist=new ArrayList();
   //    randomlist.add("sarthak");  
   //    randomlist.add("21");    
   //    randomlist.add("45678.567");    
   //    randomlist.add('s');  

   //     Iterator itr1=randomlist.iterator();
   //    while(itr1.hasNext()){
   //    System.out.println(itr1.next()); 

       ArrayList<Integer> randomlist=new ArrayList<Integer>();
       randomlist.add(5);  
       randomlist.add(21);    
       randomlist.add(40);    
       randomlist.add(15);

       System.out.print("Orignal list "); 
        Iterator itr1=randomlist.iterator();
        while(itr1.hasNext()){
        System.out.print(itr1.next()+" "); 
            }
            System.out.printf("\n"); 
            
            
        // System.out.print("Modified list ");
        //  randomlist.add(2,1);                   // add element at any index
        //  Iterator itr2=randomlist.iterator();
        //  while(itr2.hasNext()){
        //  System.out.print(itr2.next()+" "); 
        //   }

        // System.out.print("Modified list ");
        //  randomlist.add(7);                   // add element in last 
        //  Iterator itr2=randomlist.iterator();
        //  while(itr2.hasNext()){
        //  System.out.print(itr2.next()+" ");
        // }
    
        // System.out.print(randomlist.size());   // find size of list
       
        // System.out.print(randomlist.get(2));   // find element at particular index

        // System.out.print(randomlist.add(78));  // boolean check element in last

        // System.out.print("Modified list ");
        //  randomlist.remove(3);                 // remove element from particular element
        //  Iterator itr2=randomlist.iterator();
        //  while(itr2.hasNext()){
        //  System.out.print(itr2.next()+" ");
        // }
            
      }     
   }
