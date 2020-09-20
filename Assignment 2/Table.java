	
	
	//Write a program to print table of any entered number using loop

import java.util.Scanner;	
class Table{
	public static void main(String args[]){
		int num;
		int temp=1;
		Scanner vj = new Scanner(System.in);
		System.out.println("Enter a no to create its table");
		num = vj.nextInt();
		for (int i=1; i<=10; i++){
			 temp = i*num;
			 System.out.println(temp);				
		}	
	}
}	