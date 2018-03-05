//p 15.10
package CollectionsProject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EntryPoint
{
	public static void main(String[] args)
	{
		boolean hasFlights = true;
		Scanner sc = new Scanner(System.in);
		Queue<Integer> takeoffs = new LinkedList<Integer> ();
		Queue<Integer> landings = new LinkedList<Integer> ();
		
		while (hasFlights)
		{
			System.out.println("");
			System.out.println("ENTER FLIGHT SYMBOL, NEXT, OR QUIT");
			String code = sc.next();
			code=code.toLowerCase();
			double fate = Math.random();
			if (fate <= .15)
			{
				System.out.println("*You feel a deep sense of foreboding - Something is not right*");
			}
			
			if (code.equals("takeoff"))
			{
				System.out.println("FLIGHT NUMBER:");
				int num = sc.nextInt();
				takeoffs.add(num);
				
			}
			
			if (code.equals("land"))
			{
				System.out.println("FLIGHT NUMBER:");
				int num = sc.nextInt();
				landings.add(num);
				
			}
			
			if (code.equals("next"))
			{
				if (!landings.isEmpty())
				{
					System.out.println("LANDING FLIGHT NUMBER: " + landings.remove());
					if (fate <= .15)
					{
						System.out.println("The engine exploded when a piece of baggage was launched at the plane! " + fate*600 + " died in the crash!");
					}
					
					else
					{
						System.out.println("FLIGHT LANDED SUCCESSFULLY");
					}
					
				}
				
				else if (landings.isEmpty() && !takeoffs.isEmpty())
				{
					System.out.println("FLIGHT NUMBER " + takeoffs.peek() + " TAKING OFF");
					if (fate <= .15)
					{
						System.out.println("A child was playing hide and seek in the engine! " + fate*600 + " died in the crash!");
					}
					else
					{
						System.out.println("FLIGHT " + takeoffs.remove() + " EN ROUTE TO DESTINATION");
					}
				}
				
				else if (landings.isEmpty() && takeoffs.isEmpty())
				{
					System.out.println("NO FLIGHTS IN QUEUES");
					if (fate <= .15)
					{
						System.out.println("A plane that was not supposed to be on the runway exploded! " + fate*600 + " died in the crash!");
					}
				}
			}
			
			if (code.equals("quit"))
			{
				hasFlights = false;
			}
		}
		
		sc.close();
	}
}
