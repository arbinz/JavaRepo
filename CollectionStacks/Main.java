package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//1. Group members - Sets (Colin and Sam)
//2. The “Set” interface is a subclass of the Collection interface.
//3. A set is similar to a collection, but does not permit any duplicates. Sets encompass HashSet and TreeSet, used for search trees and hash codes.
//4. Creation is similar to that of an arraylist. Set<Datatype> name = new HashorTreeSet<Datatype>();
//5. add() and remove() are used when updating the array. contains() is used to find an element with identical value. Enhanced for loops are useful for iterating through all elements in the set. Sets are unordered.
//6. Any large set of data without duplicates and without order can be fit in a set. 
//7. If you implement the datatype yourself, you will need to define equals as well. The iterator can delete entries, but not add them. There is no reverse iteration, as there is no order in the first place.
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> war = new HashSet<String>();
		try
		{
			Scanner in = new Scanner(new File("warandpeace.txt"));
			in.useDelimiter("[a-zA-Z]");
			while (in.hasNext())
			{
				war.add(in.next().toLowerCase());
			}
			in.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String str : war)
		{
			System.out.println(str);
		}
	}

}