package r1;

/*
 * 58.	Create a class Voter(voterId, name, age) with parameterized constructor.  
 * The parameterized constructor should throw a checked exception
 *  if age is less than 18. The message of exception is “invalid age for voter ” 
 */
import java.io.IOException;
import java.util.Scanner;
class Voter{
	int voterId;
	String name;
	int age;
	public Voter(int voterId, String name, int age){
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	 void age1()throws IOException
	  {
		  if(age<=18)
		  {
			  throw new ArithmeticException("invalid age for voter");  
		  }
		  
		  else
		  {
			  System.out.println("Welcome to voter list");
		  }
	  }
}
public class Exception_58 {

	public static void main(String[] args) throws Exception{
		Scanner vj = new Scanner(System.in);
		System.out.println("Enter the Voter ID : ");
		int v = vj.nextInt();
		
		System.out.println("Enter the Voter Name : ");
		String n = vj.next();
		
		System.out.println("Enter the Age");
		int a = vj.nextInt();
		
		Voter v1 = new Voter(v,n,a);
		v1.age1();
		
	}

}
