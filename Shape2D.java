package metzler_p3;

public abstract class Shape2D {
	protected abstract double getArea();
}

class Square extends Shape2D{
	protected double Area;
	
	public Square(double input) {
		Area = Math.pow(input, 2);	
	}
	
	public double getArea() {		
		return Area;
	}
}
class Triangle extends Shape2D{
	protected double Area;

	public Triangle(double input, double secondInput) {
		double i = input * secondInput;
		Area = i / 2;		
	}
	
	public double getArea() {		
		return Area;
	}
	
}
class Circle extends Shape2D{
	protected double Area;

	public Circle(double input) {
		double i = Math.pow(input, 2);
		Area = i * 3.14;
	}
	
	public double getArea() {		
		return Area;
	}	
}

