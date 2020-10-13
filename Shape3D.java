package metzler_p3;

public abstract class Shape3D {

	protected abstract double getArea();
	protected abstract double getVolume();
}

class Cube extends Shape3D{
	protected double area;
	protected double volume;

	public Cube(double input) {
		double i = Math.pow(input, 2);
		area = 6 * i;		
		
		volume = Math.pow(input, 3);
	}
	public double getArea() {	
		return area;
	}
	protected double getVolume() {
		
		return volume;
	}
}

class Pyramid extends Shape3D{
	protected double area;
	protected double volume;

	public Pyramid(double length, double width, double height) {
		double i = Math.pow((width / 2), 2);
		double j = Math.pow(height, 2);
		double k = i + j;
		k = Math.pow(k, 0.5);
		
		i = Math.pow((length / 2), 2);
		j = Math.pow(height, 2);
		double l = i + j;		
		l = Math.pow(l, 0.5);
		
		area = length * width + (length * k) + (width * l);
		
		volume = (length * width * height) / 3;
	}
	protected double getArea() {
		return area;
	}
	protected double getVolume() {
		return volume;
	}
}

class Sphere extends Shape3D{
	protected double area;
	protected double volume;

	public Sphere(double input) {
		double i = Math.pow(input, 2);
		area = 4 * 3.14 * i;
		
		i = Math.pow(input, 3);
		volume = (4/3) * 3.14 * i;
		
	}
	protected double getArea() {
		return area;
	}
	protected double getVolume() {
		return volume;
	}
}