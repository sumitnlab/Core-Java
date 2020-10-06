
	/*	Accept person’s gender 
		(character m for male and f for female), age (integer), 
			as input and then 
		check whether person is eligible for marriage or not.*/
		
import java.util.Scanner;
class Gender
{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		//int F = sc.next().charAt(0);
		
		
		
		if(sex == 'M') {
			if((age >= 20) && (age < 30)) {
				System.out.println("You are Eligible for Marriage");
			}
			
			else {
				System.out.println("You are not Eligible");
			}
		}
		if(sex == 'F') {
			if((age >= 20) && (age < 26)) {
				System.out.println("You are Eligible for Marriage");
			}
			
			else {
				System.out.println("You are not Eligible");
			}
		}
		
	}
}