package spring;

/*
 	需求：
 		描述一个图形类，要求所有继承于图形类的子类都要有计算周长和面积的公式
 */

//抽象类  图形类
abstract class Shape {
	
	public abstract double calculateC();
	public abstract double calculateS();
	
}

//园类  继承图像类
class Circle1 extends Shape {
	int radius;//圆的半径
	static float PI = 3.14f; // pi的值
	
	public Circle1(int radius) {
		this.radius = radius;
	}
	
	//计算园的周长
	@Override
	public double calculateC() {
		return 2 * PI * radius;
	}

	//计算圆的面积
	@Override
	public double calculateS() {
		return PI * radius * radius;
	}
	
	//打印园的周长
	public void printC(Circle1 c) {
		System.out.println("圆的周长为：" + c.calculateC());
	}
	
	//打印圆的面积
	public void printS(Circle1 c) {
		System.out.println("圆的面积为：" + c.calculateS());
	}
}

// 矩形类  继承图形类
class Rectangle extends Shape {
	private int length; //长
	private int width;	//宽
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	//计算矩形的周长
	@Override
	public double calculateC() {
		return 2 * (length + width);
	}
	
	//计算矩形的面积
	@Override
	public double calculateS() {
		return length * width;
	}
	
	//打印矩形的周长
	public void printC(Rectangle r) {
		System.out.println("矩形的周长为:" + r.calculateC());
	}
	
	//打印矩形的面积
	public void printS(Rectangle r) {
		System.out.println("矩形的面积为：" + r.calculateS());
	}
}

public class HomeWork2 {
	public static void main(String[] args) {
		Circle1 circle = new Circle1(4);
		
		circle.printC(circle);
		circle.printS(circle);
		
		Rectangle rectangle = new Rectangle(3, 2);
		
		rectangle.printC(rectangle);
		rectangle.printS(rectangle);
	}
}
