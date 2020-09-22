	//09.Write a program to read the days (eg. 670 days) 
	//as integer value using Scanner class. 
	//Now convert the entered days into complete years, months and days and print them.
	
	import java.util.Scanner;
	
	class DayMnth{
		public static void main(String args[]){
			int day;
			int mnth;
			int yr;
			//int x;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  Day to Convert");
			int x = sc.nextInt();
			
			yr = x/365;
			int temp = x%365;
			
			mnth = temp/30;
			
			day=temp%30;
			
			System.out.println("Required Year " +yr);
			System.out.println("Required Month " +mnth);
			System.out.println("Required day " +day);
		}
	}