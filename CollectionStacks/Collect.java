package Collections;

import java.util.Stack;
import java.util.Scanner;

public class Collect
{
	/* 1. Zach Post and Marko McDowell
	 * 
	 * 2. Stack implements the List interface, which inherits from
	 * the Collection superclass
	 * 
	 * 3. Stacks allow for memory of the order of data entries,
	 * but do not allow insertion or deletion at any point aside
	 * from the top. Think a stack of books. You can only remove
	 * data at one end of the stack. Items are removed in the 
	 * opposite order they are inserted in (last-in, first-out 
	 * order). The undo function uses a stack. A Run-Time stack
	 * stores methods and their parameters and local variables
	 * and closes out of them in order to maintain data that is
	 * still needed and clears data that isn't.
	 * 
	 * 4. Stack<DataType> name = new Stack<DataType>(data);
	 * ^this is how to instantiate a Stack
	 * 
	 * 5.  Stacks have only four methods that can be used:
	 * 
	 * name.push(item1);
	 * ^The push method. This adds the itemToBeAdded to the top
	 * of the stack. If you were to run the following:
	 * name.push(item1);
	 * name.push(item2);
	 * name.push(Item3);
	 * You will end with a stack name with items [item1,
	 * item2, item3].
	 * 
	 * DataType item = name.pop();
	 * ^The Pop method. This removes the top value of the stack.
	 * name would now have values [item1, 
	 * item2] and the object item would set to
	 * item3.
	 * 
	 * peekedItem = name.peek();
	 * ^The Peek Method. This sets peekedItem to the top item in
	 * the stack, but leaves the stack unchanged.
	 * peekedItem would have the value nextItemToBeAdded, and the
	 * stack would still have the values [item1, 
	 * item2].
	 * 
	 * name.empty();
	 * ^The Empty Method. All this does is return a boolean if
	 * and only if the stack is completely empty. This would 
	 * return false.
	 * 
	 * 6. Stacks can be used with the undo method, making a 
	 * counter for verifying balances for equations, making a
	 * Run-Time stack, and stacks can be used for applications
	 * of Path-Finding, Artificial intelligence, menu navigation,
	 * card games, etc.
	 * 
	 * 7. Caution should be taken to avoid stack overflow errors.
	 * These can be caused easily with careless recursion calls.
	 * Make sure you always have a termination condition when 
	 * using loops to avoid this.
	*/
	 
	//This is a simple console application that uses two stacks
	//made of strings.
	
	public static void main(String[] args)
	{
		//Instantiate the Stacks
		Stack<String> likes = new Stack<String>();
		Stack<String> dislikes = new Stack<String>();
		//create counters for like and dislike
		int lcount = 0;
		int disCount = 0;
		//instantiate the scanner
		Scanner sc = new Scanner(System.in);
		
		//ask how many people in the class to set a limit preventing stack overflow
		System.out.println("How many people are in your class?");
		int num = sc.nextInt();
		
		//loop to find out the names of class members, and if you like them
		for (int i = 0; i < num; i++)
		{
			System.out.println("What is the first name of one of your classmates?");
			String str = sc.next();
			System.out.println("Do you like " + str + "? y/n");
			String ans = sc.next();
			
			//add to the likes Stack
			if (ans.equals("y"))
			{
				likes.push(str);
				lcount++;
				
			}
			//or add to the dislikes Stack
			if(ans.equals("n"))
			{
				dislikes.push(str);
				disCount++;
				
			}
			
		}
		
		//list the stacks of like and dislike with peek and then pop
		System.out.println("You Like:");
		for (int i = 0; i < lcount; i++)
		{
			System.out.println(likes.peek());
			likes.pop();
			
			if (likes.empty() == true)
			{
				System.out.println("nobody else...");
			}
			
		}
		
		System.out.println("You dislike:");
		for (int i = 0; i < disCount; i++)
		{
			System.out.println(dislikes.peek());
			dislikes.pop();
			
			if (likes.empty() == true)
			{
				System.out.println("nobody else...");
			}
			
		}
	}