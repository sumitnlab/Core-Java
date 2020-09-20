/**
   27.	Write a program to fine the smallest and greatest number present in the array of integer type.
 */

 class ArraySmGr{
     public static void main(String[] args) {
         int arr[] = new int[]{11,22,33,44,55,66,77,88,99};
        
         for( int i=0; i<arr.length; i++){
             if(arr[0] > arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Min No in array :"+arr[0]);

         for(int i=0; i<arr.length;i++){
             if(arr[0] < arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Max no in array :"+arr[0]);
     }
 }