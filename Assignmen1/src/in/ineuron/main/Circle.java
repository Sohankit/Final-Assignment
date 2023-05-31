package in.ineuron.main;

import java.util.Scanner;

public class Circle implements Shape {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return 3.15*(r*r);
	}

	@Override
	public double perimeter() {
		return 2*3.15*r;
	}
}
