package spring;

/*
 	抽象类
 	
  		王者荣耀的英雄：
  		血量，速度
  		【强制要求】	每一个英雄都有三个技能
  		
  		java中的抽象类   abstract  修饰抽象类的关键字
  		
  		在开发当中，发现有一些类存在继承关系，但是父类中的方法，不能完全满足子类的使用
  		为了限制子类一定要对方法进行重写，来满足自己的使用，这里可以使用抽象类来完成。
  		抽象类的关键字是abstract，在抽象类当中使用abstract 修饰的方法， 在继承该类的子类时，必须【重写】
  			
  			在这个类中，用abstract修饰的方法，没有方法体，只是一个方法的声明
  			
  		好处：	
  			在继承的子类中，语法要求必须来实现父类中的用abstract 修饰的方法
  		
  		抽象类要注意的细节：
  			1. 如果一个函数，没有函数体，是要求子类来完成的方法，就要用abstract 修饰；
  			2. 如果一个类当中存在用abstract 修饰的函数，这个类必须必须用 abstract 修饰；
  			3. [问题]
  				抽象类能有自己的类对象吗？
  					没有，因为抽象类当中包含有抽象方法，而抽象方法时没有实现的，那么这个对象如果存在，方法时无法调用的
  				[问题] 为什么会有构造函数？？
  					为了满足继承的关系，因为在子类中是不允许通过this 关键字来给父类的属性进行赋值的，所以
  					我们要在抽象类里面提供一个构造函数，供继承于该类的子类使用
  			4. 如果一个类没有抽象方法，然后你用abstract 修饰了，请问有什么用？？
  				没有用，如果没有抽象方法，就不要用抽象类。
  			5. 如果一个类继承了一个抽象类，那么必须去完成这个抽象类里面的所有的抽象方法。
 */

abstract class Hero {
	//英雄属性
	int blood;
	int speed;
	
	// 抽象类中是可以有构造函数的
	public Hero(int blood, int speed) {
		this.blood = blood;
		this.speed = speed;
	}
	
	//在这个类中，用abstract修饰的方法，没有方法体，只是一个方法的声明
	 public abstract void Q();
	 public abstract void W();
	 public abstract void R();
}

class WangZhaoJun extends Hero {

	public WangZhaoJun(int blood, int speed) {
		super(blood, speed);
	}

	//在继承该类的子类时，必须【重写】
	@Override
	public void Q() {
		System.out.println("凋零冰晶");
	}

	@Override
	public void W() {
		System.out.println("禁锢寒霜");		
	}

	@Override
	public void R() {
		System.out.println("凛冬已至");			
	}
	
}

public class Demo6 {
	public static void main(String[] args) {
		WangZhaoJun wzj = new WangZhaoJun(10, 10);
		
		wzj.Q();
		wzj.W();
		wzj.R();
		
		new WangZhaoJun(15, 15).Q();
	}
}
