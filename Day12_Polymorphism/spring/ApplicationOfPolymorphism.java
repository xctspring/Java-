package spring;

/*
 	多态的应用：
 		【需求1】	
 			我希望一个方法可以传入多种参数
 			
 			这个方法可以放入，矩形，圆形等等这种图形，直接计算这些图形的数据。
 			使用多态，利用父类的引用指向子类的对象这一特征，可以完成一个函数可以传递多种类型的数据。
 		
 		【需求2】
 			我希望一个方法可以返回多种参数。
 			
 			使用多态，利用父类的引用指向子类对象的特征，返回值设置为父类的引用数据类型，
 			这样不管返回哪一个对应子类的对象，都是可以的。
 			
 			
 */

abstract class Shape {
	
	public abstract double calculateC();
	public abstract double calculateS();
	
}


//园类  继承图像类
class Circle extends Shape {
	int radius;//圆的半径
	static float PI = 3.14f; // pi的值
	
	public Circle(int radius) {
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
	public void printC(Circle c) {
		System.out.println("圆的周长为：" + c.calculateC());
	}
	
	//打印圆的面积
	public void printS(Circle c) {
		System.out.println("圆的面积为：" + c.calculateS());
	}
}

//矩形类  继承图形类
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


public class Demo4 {
	
	// 利用多态，完成一个函数可以传递多种数据类型    不用对象调用  所以使用static 方法
	public static void getResult(Shape shape) {
		if (shape instanceof Circle) {
			System.out.println("圆的周长为：" + shape.calculateC());
			System.out.println("圆的面积为：" + shape.calculateS());
		} else if (shape instanceof Rectangle) {
			System.out.println("矩形的周长为：" + shape.calculateC());
			System.out.println("矩形的面积为：" + shape.calculateS());
		}
	}
	
	//利用多态,一个函数可以完成多种数据类型的返回
	public static Shape getshape(String str) {
		if (str == "rectangle") {
			return new  Rectangle(1, 2);
		} else {
			return new Circle(5);
		}
	}
		
	public static void main(String[] args) {
		Shape circle = new Circle(4);// 多态
		
		System.out.println(circle.calculateC());
		System.out.println(circle.calculateS());
		
		Shape rect = new Rectangle(3, 5);	
		
		System.out.println(rect.calculateC());
		System.out.println(rect.calculateS());
		
		Circle c =  new Circle(5);	
		
		Demo4.getResult(c);// 静态方法  类名调用
		
		Rectangle r = new Rectangle(5, 6);
		
		getResult(r);// 同一类中，静态方法可以省略
		
		Shape test = getshape("rectangle");
		
		if (test instanceof Rectangle) {
			System.out.println("这是一个Rectangle类的对象~~~~~");
		} else {
			System.out.println("这是一个Circle类的对象~~~~~~~~~");
		}
	}
}
