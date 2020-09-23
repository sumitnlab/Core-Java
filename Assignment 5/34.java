/*
  34.	Create a class Circle that has two data members, 
  one to store the radius and another to store area and 
  three methods first init() method to input radius from user, 
  second calculateArea() method to calculate area of circle and 
  third display() method to display values of radius and area. 
  Create class CircleDemo ( main class) that creates the Circle object and calls init(), 
  calculateArea() and display() methods.
 */

 class Circle{
     private float r;
     private float area;

     void init(float r){
         this.r = r;
     }
     float calculateArea(){
         area = 3.14f * (r * r);
         return area;
     }
     void display(){
         System.out.println("Area of circle is :" +area);
     }
 }

 class CircleDemo{
     public static void main(String[] args) {
         Circle c = new Circle();
         c.init(10);
         c.calculateArea();
         c.display();
     }
 }
