package spring;

class Animal {
	String name;
	String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
}

class Dog extends Animal {
	String id;
	
	public Dog(String name, String color, String id) {
		super(name, color);
		this.id = id;
	}
	
	public void barking() {
		System.out.println("小狗在叫~~~~~汪汪汪~~~~~~");
	}
}

class Cat extends Animal {
	String id;
	
	public Cat(String name, String color, String id) {
		super(name, color);
		this.id = id;
	}
	
	public void mewing(){
		System.out.println("小猫在叫~~~~~~喵喵喵~~~~~~");
	}
}

public class Demo4 {
	public static void main(String[] args) {
		Dog sijia = new Dog("旺财", "白", "111");
		
		//instanceof 关键字  	  判断一个类对象是否属于某一个类
		
		/*
		 	sijia是通过new Dog()构造函数来创建的，确定是Dog类的对象
		 	Dog继承于Animal的，所以sijia 也是Animal的类对象
		 */
		System.out.println("sijia是Dog类对象吗？？？" + (sijia instanceof Dog));
		// System.out.println("sijia是Dog类对象吗？？？" + (sijia instanceof Cat));  会报错  
		// Dog类和Cat类之间没有直接关系，他们都是Animal的子类，但是各自的类对象和对方都没有关系
		System.out.println("sijia是Animal类对象吗？？？" + (sijia instanceof Animal));
		
		Animal ani = new Animal("大象", "灰色");
		
		// 父类的引用可以指向子类对象
		Animal test = new Cat("小七", "黑白灰", "美短");
		
		//可以调用父类的成员变量
		test.name = "007";
		test.color = "白猫";
		
		//用test 调用子类的成员变量，发现不允许
		// 父类的引用可以指向子类对象，但是不能使用子类的成员方法和成员变量
		//test.id = " ";
		
		System.out.println("test是Animal的类对象吗？？？" + (test instanceof Animal));
		//  test指向在Cat的类空间是 Cat的类对象  
		//  但是操作空间仅限于父类的成员变量
		System.out.println("test是cat的类对象吗？？？" + (test instanceof Cat)); 
	}
}
