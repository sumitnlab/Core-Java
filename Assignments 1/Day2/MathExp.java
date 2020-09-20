
class MathExp{
	public static void main(String args[]){
		int x=5;
		int y;
		
		y=(x*x + 3*x - 7);
		System.out.println(y);
		
		y = x++ + ++x;
		System.out.println(y);
		
		int z = x++ - --y - --x  +  x++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


		
	}
}


