package r1;

import java.util.Scanner;

/*
 * 50.	Explain the importance of toString() and equals() method of the Object class and 
 * override them on class Employee(empId,name,salary).  
 * a. Create class for main method(say XYZ),and accept five employees information and store 
 * in an array. Also ensure if entered empId already exist or not (use equals method). 
 *  b. Display all employee info using toString method.
 */
class Employee1{
	int empid;
	private String name;
	private float salary;
	
	public Employee1(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public boolean equals(Object obj) {
		Employee1 e = (Employee1)obj;
		return empid == e.empid;
	}
	
		
}
public class ToString_50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size o array: ");
		int sz = sc.nextInt();

		Employee1 arr[] = new Employee1[sz];

		for(int i=0; i<arr.length; i++){
			System.out.println("Enter employeed id: ");
			int eid = sc.nextInt();
			for(int j=0; j<i; j++){
				System.out.println(arr[j].empid);
				if (eid==(arr[j].empid )){
					System.out.println("Already Exists");
					break;
				}
			}				
			
			System.out.println("Enter employeed Name: ");
			String ename = sc.next();
			System.out.println("Enter employeed Salary: ");
			float esal = sc.nextFloat();

			Employee1 e = new Employee1(eid, ename, esal);
			arr[i]=e;
			
		}

		for(Employee1 e : arr){
			System.out.println(e);
		}
	}

}
