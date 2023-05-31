package in.ineuron.main;
import java.util.Scanner;

public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double area() {
		
		return (a*b)/2;
		
	}
	
	public double perimeter() {
	double s= a+b+c;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
