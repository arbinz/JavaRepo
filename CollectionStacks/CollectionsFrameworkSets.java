import java.util.*;

//1. Sam, Colin
//2. The Set Interface is in the second tier of the Data Collection Hierarchy, only below the Collection
//	 Interface. HashSet and TreeSet branch off from the Set Interface
//3. Sets cannot contain duplicate elements. A set organizes its values in an efficient order.
// inserting and removing elements is easier with a set than a list. 
//4. Created an array with integers to add to a set. Created ordered set from unordered set.
// Used various methods in the Sets Interface
//5. Interactions with sets are often handled with methods that are in the Set Interface
//6.
//7.
public class CollectionsFrameworkSets {
	public static void main(String args[]) { 
	      int nums[] = {34, 22, 10, 60, 30, 22, 643, 37, 12, 100, 563, 178};
	      
	      Set<Integer> set = new HashSet<Integer>();
	      
	      for(int i = 0; i < nums.length; i++) {
	         set.add(nums[i]);
	      }
	      
	      System.out.println("Original set: ");
	      System.out.println(set);

	      TreeSet<Integer> orderedSet = new TreeSet<Integer>(set);
	      System.out.println("The sorted set is: ");
	      System.out.println(orderedSet);
	         
        System.out.println();

	      System.out.println("The first number in the set is: "+ (Integer)orderedSet.first());
	      System.out.println("The last number in the set is: "+ (Integer)orderedSet.last());
	      System.out.println("The size of the set is: " + (Integer)orderedSet.size());
	      
	      System.out.println();
	      
	      orderedSet.add(444);
	      
	      System.out.println(orderedSet);
	   }
}
