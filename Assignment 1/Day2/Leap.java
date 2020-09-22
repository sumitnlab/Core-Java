import java.util.Scanner;
class Leap{
	public static void main(String args[]){
		int yr;
		Scanner vj = new Scanner(System.in);
		System.out.println("Enter the Year");
		
		yr = vj.nextInt();
		if (yr%4==0 && yr%100!=0 || yr%400==0)
		{
			System.out.println("Given Year is Leap Year");
		}
		else
		{
			System.out.println("Given Year is not Leap Year");
		}
		
	}
}