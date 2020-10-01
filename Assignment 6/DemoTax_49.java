package r1;

import java.util.Scanner;

/*48 Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax(). 
a. Create class Employee(empId,name,salary) and implement Taxable to 
calculate incomeTax on yearly salary. 
b. Create class Product(pid,price,quantity) and implement Taxable to 
calculate salesTax on unit price of product. 
c. Create class for main method(Say XYZ), 
accept employee information and a product information from user and 
print income tax and sales tax respectively
*/

interface Taxable{
double salesTax = 0.07;
double incomeTax = 0.105;
abstract void calcTax();
}
class Employee implements Taxable{
Scanner vj = new Scanner(System.in);
int empId = vj.nextInt();

String name = vj.next();

double salary = vj.nextDouble();

public void calcTax(){
	
	//double yearlySal=salary*12;
	double total = (salary * 12 * incomeTax);
	System.out.println(total);
}
	
}
class Product implements Taxable{
Scanner vj = new Scanner(System.in);
int pid = vj.nextInt();

float price = vj.nextFloat();

double quantity = vj.nextDouble();

public void calcTax(){
	double amt = (int) (price * salesTax * quantity);
	System.out.println(amt);
}

}
class DemoTax_49{
public static void main(String[] args) {
//	Product p = new Product();
//	p.calcTax();
	Employee e = new Employee();
	e.calcTax();
}
}

