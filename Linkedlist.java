import java.util.*;
// import java.util.LinkedList;
class Linkedlist{
	public static void main(String args[]){

	  LinkedList<String> list=new LinkedList<String>();  
      list.add("hello ");  
      list.add("world ");  
      list.add("bye ");  
      list.add("worldddd ");  
      
      System.out.print("Orignal list- ");
      Iterator<String> itr= list.iterator();  
      while(itr.hasNext()){  
      System.out.print(itr.next());  
        }  
      System.out.printf("\n");

            
        System.out.print("Modified list- ");
         list.add(1,"sarthak ");                   // add element at any index
         Iterator itr2= list.iterator();
         while(itr2.hasNext()){
         System.out.print(itr2.next()); 
          }



        System.out.print("Modified list- ");
         list.addFirst("sarthak ");                   // add element at first
         Iterator itr2= list.iterator();
         while(itr2.hasNext()){
         System.out.print(itr2.next()); 
          }


         System.out.print("Modified list- ");
         list.addLast("sarthak ");                   // add element at last
         Iterator itr2= list.iterator();
         while(itr2.hasNext()){
         System.out.print(itr2.next()); 
          } 


    
        System.out.print(list.contains("sarthak "));   // check element present or not


       
        System.out.print(list.get(2));   // find element at particular index



        System.out.print(list.add("78"));  // boolean check element in last


        System.out.print("Modified list- ");
         list.remove(3);                 // remove element from particular element
         Iterator itr2=list.iterator();
         while(itr2.hasNext()){
         System.out.print(itr2.next()+" ");
        }
            

        System.out.print(list.size());   //to get size of list



         System.out.print("Modified list- ");
         Iterator itr2=list.descendingIterator();   //reverse string
         while(itr2.hasNext()){
         System.out.print(itr2.next()+" ");
        }




        LinkedList list2 = new LinkedList();
        list2 = (LinkedList) list.clone();      // clone 1 list to another 
        Iterator itr2=list2.iterator();   
         while(itr2.hasNext()){
         System.out.print(itr2.next()+" ");
        }

      }     
   }
