package r1;

import java.util.*;


/*
 * 57.	Store name of weekdays in an array (starting from “Sunday” at 0 index).
 *  Ask day position from user and print day name. Handle 
 * array index out of bound exception and give proper
 *  message if user enter day index outside range (0-6). 
 */
public class Day_57 {

	public static void main(String[] args) {
		try
		{
			//String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			
			System.out.println("Enter a Length");
			
			Scanner vj = new Scanner(System.in);
			int size = vj.nextInt();
			
			String arr[] = new String[size];
			
			for(int i=0; i<=arr.length;i++)
			{
				System.out.println("Enter Elements at"+i+"th Index"+ "=");
				arr[i] = vj.next();
			}
		}catch(ArrayIndexOutOfBoundsException a) 
			{
				System.out.println("Please Enter a valid length Number:" +a);
			}
		
		
	}
}

