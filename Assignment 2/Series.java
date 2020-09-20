

  /*19.Calculate  series : 12+22+32+42+.........+n2
	12=10+2
	22=20+2
	32=30+2
	42=40+2
	52=50+2
	160= (n*(n+1)/2)*10+(2*n)
  */
  
  import java.util.*;
  class Series{
	public static void main(String args[]){
		Scanner  vj = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = vj.nextInt();
		int total = (n*(n+1)/2)*10+(2*n);
		System.out.println("Calculation of Series : " +total);		
		
	}
}

  
  