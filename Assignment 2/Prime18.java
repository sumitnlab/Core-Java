	
	//18.Program to check whether number is prime or not.
	
import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner  vj = new Scanner(System.in);
		System.out.println("Enter Number");
		int x = vj.nextInt();
		int temp=0; 
		
		for ( int i= 1; i<=x; i++)
		{
			if(x%i==0)
			{
//System.out.println("Not Prime");
				temp++;
			}
			
		}
		if (temp==2)
		{
			System.out.println(" Prime");
			
		}
		else
		{
			System.out.println("Not Prime");
			
		}
		
	}
}
