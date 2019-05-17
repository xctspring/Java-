package spring;

/*
 	面向对象的三大特性：
 		1. 封装	private  setter   getter
 		2. 继承	extends	 interface  implements
 		3. 多态	一个对象在不同状况下会有多种状态
 		
 	一个对象在不同环境下具有不同的形态，称为多态
 	
 	在Java 中，多态可以这样理解：
 		父类的引用指向子类的对象，
 		或者说，接口的引用类型变量指向遵从接口的类对象
 	
 	多态的注意事项：
 		1. 多态情况下，父类的引用不能访问子类特有的成员变量和成员方法
		2. 多态情况下，如果父类和子类中拥有同名的成员变量，那么使用的是【父类】的成员变量
		3. 多态情况下，如果父类和子类中拥有同名的成员方法，那么使用的是【子类】的成员方法
		4. 多态情况下，如果父类和子类中拥有同名的静态成员方法，那么使用的是【父类】的静态方法
		
	总结：
		在多态情况下，子类和父类存在同名是，访问的都是父类里面的成员，同名非静态成员方法，访问的是子类的。
	
 */

abstract class Animal {
	String name;
	String color = "原谅色";
	
	public Animal(String name) {
		this.name = name;
	}
	
	//抽象方法
	abstract public void run();
	
	public void eat() {
		System.out.println("民以食为天~~~");
	}
}

class Mouse extends Animal {
	int age = 1;// 这是子类自己的成员变量
	String color = "白色";
	
	public Mouse(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public void run() {
		System.out.println("仓鼠在跑步机里面锻炼身体！~~~~~~");
	}
	
	@Override
	public void eat() {
		System.out.println("仓鼠在小屋里吃水果干");
	}
	
	public void sleep() {
		System.out.println("仓鼠在小屋里呼呼大睡~~~~~~~~");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse("Jerry", 1);
		
		mouse.run(); //调用抽象的run 方法
		mouse.eat(); //调用重写的eat 方法
		mouse.sleep(); //调用自己的sleep 方法
		System.out.println(mouse.color);
		
		Animal ani = new Mouse("球球", 2); // 这就是多态 
		
		ani.eat();// 调用的是子类Mouse 重写的方法
		//!ani.sleep()   不能调用子类特有的方法
		//!ani.age = 5;  不能调用子类特有的成员变量
		ani.run(); // 调用的是父类中的抽象方法，但是是子类中的实现
		System.out.println(ani.color);
		
		ani.color = "pink"; //可以使用自己类当中的成员变量
	}
}
