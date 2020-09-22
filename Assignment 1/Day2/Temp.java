import java.util.Scanner;
 class Temp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println("in Celsius it is :"+celsius + "0 degree");
    }
}