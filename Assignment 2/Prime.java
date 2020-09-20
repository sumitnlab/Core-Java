import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		int x;
		int temp=0;
		int i;
		Scanner  vj = new Scanner(System.in);
		System.out.println("Enter Number");
		 x = vj.nextInt();
		
			
		for(i=1; i<=x; i++){
				if(x%i==0){
					temp++;
				}
		}
		if(temp==2){
			System.out.println("No is Prime");
		}
		else
		{
			System.out.println("No is not Prime");
		}
	}
}
/*import java.util.Scanner;
public class Prime{

    public static void main(String[] args) {

        int num;
        int count=0;
		Scanner  vj = new Scanner(System.in);
		System.out.println("Enter Number");
		 num = vj.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                count++;
            }
        }

        if (count==2)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
*/