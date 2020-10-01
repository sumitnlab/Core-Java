package r1;
/*
 * 54.	Write a program to reverse the given String.
 */
import java.util.Scanner;
public class revStr_54s{

	public static void main(String[] args) {

		     Scanner scanner = new Scanner(System.in);
		     
		      System.out.println("Enter the String ");
		      
		      String name = scanner.nextLine();
		      		      
		      int len = name.length();
		      
		      System.out.println("The length of Given String : " +len);
		      
		      for(int i = len-1 ; i>=0 ; i--)
		      {
		    	  System.out.print(name.charAt(i));
		      }
		      
		   
			}

		}
	


