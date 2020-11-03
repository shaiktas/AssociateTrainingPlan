package Inheritance;

class Shape {
	String color;
	boolean filled;
	
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public String toString() {
		if(this.filled) {
			return String.format("A Shape with color of %s and is filled", this.color);
		}
		return String.format("A Shape with color of %s and is not filled", this.color);
	}
}

class Circle extends Shape {
	double radius;
	
	public Circle() {
		super();
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * (this.radius*this.radius);
	}
	
	public double getPerimeter() {
		return Math.PI * this.radius * 2.0;
	}
	
	@Override
	public String toString() {
		return String.format("A Circle with radius=%.2f, which is a subclass of ", this.radius)+ super.toString();
	}
}

class Rectangle extends Shape {
	double width;
	double length;
	
	public Rectangle() {
		super();
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return (2.0 * this.length) + (2.0 * this.width);
	}
	
	@Override
	public String toString() {
		return String.format("A Rectangle with width=%.2f and length=%.2f, which is a subclass of ", this.width, this.length)+ super.toString();
	}
}

public class shapeDemo {

	public static void main(String[] args) {
		Shape shape = new Shape("purple", true);
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(2, 10, "dark steel", false);

		System.out.println("The shape color is "+shape.getColor()+", and it's "+shape.isFilled()+" that it's filled.");
		System.out.println(shape.toString());
		
		System.out.println("The area of the Circle is "+circle.getArea()+", and the perimeter is "+circle.getPerimeter());
		System.out.println(circle.toString());
		
		System.out.println("The area of the Rectangle is "+rectangle.getArea()+", and the perimeter is "+rectangle.getPerimeter());
		System.out.println(rectangle.toString());

		System.out.println("The area of the 2nd Rectangle is "+rectangle2.getArea()+", and the perimeter is "+rectangle2.getPerimeter());
		System.out.println(rectangle2.toString());
	}

}
