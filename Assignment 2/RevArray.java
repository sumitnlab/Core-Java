/*
*   23.	Write a program to reverse the array elements.
 */
 
 
 

import java.util.Scanner;
class RevArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter  Element");
			ar[i] = sc.nextInt();
		}
		System.out.println("=============");
		System.out.println("Reverse Array are");


		for(int i=4;i<5;i--){
			System.out.println(ar[i]);
			//System.out.print(ar[i] + " ");
		}
	}
}