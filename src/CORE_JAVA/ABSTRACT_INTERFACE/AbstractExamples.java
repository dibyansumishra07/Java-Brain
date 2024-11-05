package abstractClassAndInterface;

import java.util.Scanner;

abstract class Shape {
	int width;

	abstract void area();
}

class Square extends Shape {

	
	
	public Square(int width) {
		super.width=width;
	}

	@Override
	void area() {
		System.out.println(super.width*super.width);
	}

}

class Circle extends Shape {

	public Circle(int width) {
		super.width=width;
	}
	@Override
	void area() {
		System.out.println(Math.PI*super.width*super.width);

	}
}

public class AbstractExamples{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		Square a = new Square(x);
		Circle b = new Circle(y);
		a.area();
		b.area();
	}
}