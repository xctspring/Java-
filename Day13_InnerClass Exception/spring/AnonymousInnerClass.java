package spring;
/*
 	匿名内部类：
 		之前接触过的匿名食物包括： 匿名对象
 		
 		类的本体:
 			当定义类的时候，大括号里面的内容才是类的本体
 			{
 				//成员方法
 				//成员变量
 			}
 */

abstract class Animal {
	int age;
	
	public abstract void test();
	public abstract void jump();
	
}

class Monkey extends Animal {
	
	@Override
	public void test() {
		System.out.println("探究什么是类的本体~~~");
	}
	
	@Override
	public void jump() {
		System.out.println("You jump, I jump!!!!");
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		
		m.test();
		m.jump();
		//抽象类能不能有自己的类对象？？？  不能
		
		//抽象类的引用指向继承于该类的子类对象
		Animal a = new Monkey();
		
		
		//匿名内部类
		
		/*
	 	Animal 时一个抽象类， ani是一个抽象类的引用类型
	 	
	 	new Animal() {
	 		这里的内容要求继承于该抽象类的子类要完成的方法
	 		这里就是类的本体
	 		但是这个类又没有名字，所以称之为【匿名内部类】
	 		
	 		这里有一个隐含的【继承】关系
	 	};
		 */
		Animal ani = new Animal() {
			
			@Override
			public void test() {
				System.out.println("这是匿名内部类的test()方法~~~");
			}
			
			@Override
			public void jump() {
				System.out.println("这是匿名内部类的jump()方法~~~");
			}
		}; //注意这里有一个分号
		
	}
}

















