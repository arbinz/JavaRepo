package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MapsMain {
	/*
	 * 1. Kanishka Ragula and Gabe Krivian
	 * 
	 * 2. Map is the interface that is implemented by the HashMap and TreeMap Classes.
	 * It is at the top of the tree for Maps.
	 * 
	 * 3. The Map collection maps data values to certain keys and no key can have a duplicate.
	 * The Map collection is particularly useful when using enums in that the map stores the keys
	 * of the enum, a collection of classes, and can then store the classes along with their names.
	 * The Map is also powerful because it can quickly return the value at a specified map location
	 * or the value with a specific name, no method is needed to convert the name to a data value.
	 * This has built in methods to set, delete, and replace data associated with a key and can be cleared
	 * with a single method.
	 * 
	 * 4. Map<String, Integer> m = new HashMap<String, Integer>();
	 * How to instantiate a map with a key (String) and then the value at that key (Integer)
	 * Classes can be used in place of the Integer in the call above.
	 * 
	 * 5. Maps have 12 methods for basic operations.
	 * 
	 * m.put(a, freq+1);
	 * ^
	 * This puts a value (freq+1) into the map at the location of the key a.
	 * No two values can be put for the key a.  If you want to change the value at key a, use the
	 * put method on the key, but take note that this cannot have two different values at it, the most
	 * recent will be the value used.
	 * m.put(a,1);
	 * m.put(a,2);
	 * The value at key a is 2 in this case.
	 * 
	 * Integer g = m.get(a);
	 * ^
	 * The get method returns the value at the specified key.  This allows for data to be searched
	 * for in the map by the program and the specified value will be returnede.
	 * 
	 * boolean hasKey = m.containsKey(a);
	 * ^
	 * The containsKey method searches the map to see whether or not the map contains the specified key.
	 * If the key is not present in the map, false is returned.  Else, true is returned.
	 * 
	 * boolean hasVal = m.containsVal(objVal);
	 * ^
	 * The containsVal method basically sees if the map has an Object with the specified value.
	 * If the value is there, true is returned.  Else, false.
	 * 
	 * int mapSize = m.size();
	 * ^
	 * The size method returns the size of the map based on the number of keys.  Self-explanatory.  
	 * 
	 * boolean isEmpty = m.empty();
	 * ^
	 * The empty method returns whether or not the map has no keys.
	 * 
	 * newmap2.putAll(newmap1);
	 * ^
	 * this function puts all mappings into newmap2
	 * 
	 * newmap.clear();
	 * ^
	 * Removes all of the mappings from this map
	 * 
	 * 6. This data type can be used when making an array of values that needs to be sorted through
	 * later.  This can be used for storing locations along with their populations, the periodic table,
	 * inventories of items and their quantity, etc.  Overall, the Map class can be used for anything 
	 * that has a name/identifier and a class or number associated with that identifier/name.
	 * Also, key bindings can be used for this when developing a game.
	 * 
	 * 7. When using this, it is best practice to have a method that will first check the 
	 * key before conducting any operations, throw an error message, or return a default 
	 * to prevent a NullPointerException.  Also, have an organized way to keep track of the
	 * keys and give a default value to every key expected to be used.  
	 * 
	 * https://www.youtube.com/watch?v=RWw7jbKYJ-w
	 */
	
	public static Map<String, Locker> m = new HashMap<String, Locker>();
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		
		System.out.println("How many lockers are there?");
		int size = sc.nextInt();
		sc.nextLine();
		MapsMain mpM = new MapsMain(size);
		
		while(keepGoing){
			
			System.out.println("Do you want to test a combo or get a combe (t/g)");
			String resp = sc.nextLine();
			
			if(resp.equals("t") || resp.equals("T")){
				System.out.println("Please enter the locker number");
				String lockerNum = sc.nextLine();
				
				System.out.println("Enter the first turn right");
				int turn1 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the second turn left");
				int turn2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the third turn right");
				int turn3 = sc.nextInt();
				sc.nextLine();
				
				if(m.containsKey(lockerNum)){
					if(m.get(lockerNum).testCombo(turn1, turn2, turn3)){
						System.out.println("It is open");
					} else {
						System.out.println("Wrong combo");
					}
				} else {
					System.out.println("That locker does not exist");
				}
			} else if(resp.equals("g") || resp.equals("G")){
				System.out.println("Please enter the locker number");
				String key = sc.nextLine();
				
				if(m.containsKey(key)){
					System.out.println(m.get(key).toString());
				} else {
					System.out.println("That locker does not exist");
				}
			} else {
				System.out.println("Please enter a g or t");
			}
			System.out.println("Do you want to interact with lockers again? (y/n)");
			resp = sc.nextLine();
			
			if(resp.equals("y") || resp.equals("Y")){
				keepGoing = true;
			} else {
				System.out.println("Goodbye");
				keepGoing = false;
			}
		}
		sc.close();
	}
	
	final class Locker {
		private int one, two, three;
		public Locker(){
			this.randomize();
		}
		
		public void setCombo(int one, int two, int three){
			this.one = one;
			this.two = two;
			this.three = three;
		}
		
		public void randomize(){
			Random rand = new Random();
			this.one = rand.nextInt(50);
			this.two = rand.nextInt(50);
			this.three = rand.nextInt(50);
		}
		
		public boolean testCombo(int one, int two, int three){
			if(this.one == one && this.two == two && this.three == three){
				return true;
			} else {
				return false;
			}
		}
		
		public String toString(){
			return one + "-" + two + "-" + three;
		}
		
	}
	
	public MapsMain(int size){
		Random rand = new Random();

		for(int i=1; i<= size; i++){
			m.put(String.valueOf(i), new Locker());
		}
		
	}

}