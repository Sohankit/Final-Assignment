package in.ineuron.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Circle
		System.out.println("Enter Radius of the Circle");
		
		Double radius = sc.nextDouble();
		
		Circle c = new Circle(radius);

		System.out.println("Area of the circle is:" + c.area());
		System.out.println("Perimeter of the circle is: " + c.perimeter());

		//Triangle 
		System.out.println("Enter the value");
		
		System.out.println("Enter first value");
		double a = sc.nextDouble();
		
		System.out.println("Enter second value");
		double b = sc.nextDouble();
		
		System.out.println("Enter third value");
		double d = sc.nextDouble();

		Triangle t = new Triangle(a, b, d);

		System.out.println("Area of the trinagle is:" + t.area());
		System.out.println("Perimeter of the trinagle is: " + t.perimeter());

	}
}
