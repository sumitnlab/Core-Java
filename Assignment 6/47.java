

	//47.	Create a program to demonstrate constructor chaining.
	
class Library{
	private int length;
	Library(){
		System.out.println("Const Lib");
	}
	Library(int length){
		System.out.println("Parameter Lib");
	}
}
class Dept extends Library{
	private int no;
	Dept(){
		System.out.println("Const Dept");
	}
	Dept(int length,int no){
		//this();
		System.out.println("Parameter Dept");
	}
}
class LibDemo{
	public static void main(String args[]){
		Dept d = new Dept();
		Dept d1 = new Dept(50,5);
	}
}