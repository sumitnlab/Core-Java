
//17.Write a program to reverse a given number.
import java.util.Scanner;
class reverse{
	public static void main(String args[]){
		Scanner  vj = new Scanner(System.in);
		System.out.println("Enter Number to reverse");
		int num = vj.nextInt();
		//num=1234;
		int rev=0;
		while(num>0){
			int rem = num%10; 
			rev = rev * 10 +  rem;//4			
			num = num/10;
			
		}
		System.out.println("Reverse number is : " +rev);
	}
}


