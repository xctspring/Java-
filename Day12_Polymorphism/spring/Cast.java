package spring;

/*
 	多态情况下，父类的引用不能访问子类特有的成员变量和成员方法
 	【需求】
 		就是要用子类特有的数据类型
 		
 	引用类型的强制类型转换：
 		基本数据类型  强制类型转换: 大数据类型  转换到  小数据类型
 					自动类型转换： 小数据类型  转换到  大数据类型
 		
 		引用的转换：
 			系统的类型转换是：
 				小数据类型 转换到 大数据类型
 				【说明】
 					这里的小数据类型是存在【继承关系】的子类，大数据类型是这个子类的父类
 			程序员的强制类型转换：
 				大数据类型 转换到 小数据类型
 			
 		这里引用的数据类型转换必须建立在继承的基础上，如果这两个类没有继承的关系，那么这里强制的话，会报异常
 		ClassCastException  表示强制类型转换失败
 */

abstract class BigAnimal {
	int age = 10;
	String name; // BigAnimal 类的成员变量
	
	public BigAnimal(String name) {
		this.name = name;
	}
	
	public abstract void play();
}

class Dog extends BigAnimal {
	int age;
	
	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public void play() {
		System.out.println(name + "狗狗喜欢玩球~~~~~");
	}
}

class Bird extends BigAnimal {
	int age;
	
	public Bird(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public void play() {
		System.out.println("小鸟在唱歌~~~~~");
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Dog dog = new Dog("旺财",20);
		dog.play();
		System.out.println(dog.name + dog.age); //使用父类的age变量
		
		BigAnimal ba = new Dog("可可", 3);// ba指向Dog子类的首地址  
		ba.play();
		System.out.println(ba.age); //使用父类的age变量   大数据类型转换为小数据类型，系统自动
		
		//如何让调用子类的age？？？
		Dog temp = (Dog)ba;// 虽然进行了强制类型转换，       但是ba还是指向Dog子类的首地址
		System.out.println(ba);
		System.out.println(temp);
		System.out.println(temp.age); // age
		
		BigAnimal btb = new Bird("老哥", 5);
		btb.play();
		
	}
}
