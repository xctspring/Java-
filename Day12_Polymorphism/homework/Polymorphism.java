package homework;

/*
 	多态的应用
 	
 	图形类：
 	圆类：
 	矩形类：
 	
 */

abstract class Shape {
	abstract public double calculatePerimeter();
	abstract public double calculateArea();
}

class Circle extends Shape {
	private double radius;
	private double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}
	
	@Override
	public double calculatePerimeter() {
		return PI * radius * radius;
	}
	
	public void show(Circle c) {
		System.out.println("圆的面积为：" + c.calculateArea()
						+  "圆的周长为：" + c.calculatePerimeter());
	}
	
}

class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {}
	
	@Override
	public double calculateArea() {
		return length * width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	public void show() {
		System.out.println("矩形的面积为：" + new Rectangle().calculateArea()
						+  "矩形的周长为：" + new Rectangle().calculatePerimeter());
	}
	
}

public class Polymorphism {
	//多态
	public static void getResult(Shape s) {
		if (s instanceof Circle) {
			System.out.println("圆的面积为：" + s.calculateArea()
					+  "圆的周长为：" + s.calculatePerimeter());
		} else if(s instanceof Rectangle){
			System.out.println("矩形的面积为：" + s.calculateArea()
					+  "矩形的周长为：" + s.calculatePerimeter());
		}
	}
	
	//
	
	public static void main(String[] args) {
		Circle c = new Circle(1.0);
		getResult(c);
		
		Rectangle r = new Rectangle(3.0, 4.0);
		getResult(r);
	}
}























