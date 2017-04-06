import java.util.*;
public class LinkedListExample {
     public static void main(String args[]) {

         // declaring
         LinkedList<String> linkedlist = new LinkedList<String>();

         
         linkedlist.add("Item1");
         linkedlist.add("Item2");
         linkedlist.add("Item3");
         linkedlist.add("Item4");
         linkedlist.add("Item5");

         System.out.println("Initial list: " +linkedlist);
         
         //adding new items
         linkedlist.addFirst("First Item");
         linkedlist.addLast("Last Item");
         System.out.println("LinkedList after adding item to first and last " +linkedlist);

         //setting new values
         String firstvar = linkedlist.get(0);
         System.out.println("First element: " +firstvar);
         linkedlist.set(0, "Changed first item");
         String firstvar2 = linkedlist.get(0);
         System.out.println("First element after update by set method: " +firstvar2);

         // remove first and last items
         linkedlist.removeFirst();
         linkedlist.removeLast();
         System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

         // add to any position and remove
         linkedlist.add(4, "Newly added item");
         linkedlist.remove(2);
         System.out.println("Final Content: " +linkedlist); 
         
     }
}
