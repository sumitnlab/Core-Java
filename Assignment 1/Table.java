import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to print Table");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++){
			int temp = i * num;
			System.out.println(temp);
		}
	}
}