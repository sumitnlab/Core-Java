/*
36.	Create a class MathOperation containing overloaded methods ‘multiply’
 to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/

 class MathOperation{
     void multiply(int a, int b){
         System.out.println("Multiplication of two int : "+(a*b));
     }

     void multiply(float x,float y,float z){
         System.out.println("Multiplication of three floats : "+(x*y*z));
     }

     void multiply(int arr[]){
         int x = 1;
        for(int a : arr){
            x = x * a;
        }
        System.out.println("Multiplication of array elements : "+x);
     }

     void multiply(double p,int  q){
         System.out.println("Multiplication of double and int : "+(q*p));
     }
 }

 class MathOperationDemo{
     public static void main(String[] args) {
         MathOperation m = new MathOperation();
         int ar[] = new int[] {1,2,3,4};

         m.multiply(2,4);
         m.multiply(2.2f,2.5f,3.5f);
         m.multiply(ar);
         m.multiply(5.5d,20);
     }
 }