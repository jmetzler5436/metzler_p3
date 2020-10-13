package metzler_p3;

public abstract class Shape {		
		
	public abstract String getName();

	
}

class Square extends Shape{
	protected String name = "square";
	
	public Square(double input) {		
	}
	
	public String getName() {		
		return name;
	}
}

class Triangle extends Shape{
	protected String name = "triangle";

	public Triangle(double input, double secinput) {
						
	}
	
	public String getName() {		
		return name;
	}
}

class Circle extends Shape{
	protected String name = "circle";

	public Circle(double input) {
						
	}
	
	public String getName() {		
		return name;
	}
}

class Cube extends Shape{
	protected String name = "cube";

	public Cube(double input) {
						
	}
	
	public String getName() {		
		return name;
	}
}

class Pyramid extends Shape{
	protected String name = "pyramid";

	public Pyramid(double input, double secondinput, double thirdinput) {
						
	}
	
	public String getName() {		
		return name;
	}
}

class Sphere extends Shape{
	protected String name = "sphere";

	public Sphere(double input) {
						
	}
	
	public String getName() {		
		return name;
	}
}
