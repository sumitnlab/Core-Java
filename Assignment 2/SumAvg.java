 
 /*
21.	Program to show sum and average of 10 element array. 
Accept array elements from user. 
 */

 import java.util.Scanner;

 class SumAvg{
     public static void main(String args[]){
         int sum = 0;
		 int avg;
		 int i;
		
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[10];
         
         for( i=0; i < 10; i++){
             System.out.println("Enter the elements in array");
             arr[i] = sc.nextInt();
         }

         for(int a : arr){
             sum = sum + a; 
         }
          avg = sum / 10;

         System.out.println("Sum is :"+sum);
         System.out.println("Average is :"+avg);
     }
 }
