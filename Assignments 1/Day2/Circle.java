	
import java.util.Scanner;	
class Circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float r;
		
		System.out.println("Enter the radius of the circle");
		float k = sc.nextFloat();
		
		double Area = 3.14*k*k;
		System.out.println("Area Of Circle : "+Area);
		double Circumference = 2*3.14*k;
		System.out.println("Circumference Of Circle : "+Circumference);
	}
}