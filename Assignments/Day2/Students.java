import java.util.Scanner;
class Students{
	public static void main(String args[]){
		int C;
		int CPP;
		int OS;
		int Angular;
		int AWP;
		float total;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks For Students");
		C = sc.nextInt();
		CPP = sc.nextInt();
		OS = sc.nextInt();
		Angular = sc.nextInt();
		AWP = sc.nextInt();
		 total = C + CPP + OS + Angular + AWP;
		 System.out.println("Total Marks = "+total);
		 percentage = (total/500)*100;
		 System.out.println("Percentage Marks = "+percentage);
	}

}