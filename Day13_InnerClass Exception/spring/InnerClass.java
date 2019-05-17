package spring;

import spring.Outer.Inner;

/*
 	人（类）:
 		成员变量（没有行为）：
 			血液
 			骨头	
 			
 			心脏
 				心跳 行为
 				为了保持血液的循环
 			脑子
 				思考
 		[发现]
 			心脏脑子这些如果在人体中看作是一个成员变量，但是有行为，不合适，要看作一个方法，但是包含
 			一定的属性而且行为不能时看作人的行为
 			
 			这里可以把心脏和脑子看做是一个类，一个在人类内部的类
 			
 			内部类： 成员内部类 局部内部类  匿名内部类
 				 成员内部类
 					[注意事项]
 						a. 成员内部类可以使用外部类的所有的成员变量和成员方法，不管用什么修饰，不管是private 还是 public 或者 static ，
 						因为这个内部类是在外部类内的
 						b. 如何在外部类的类外创建一个内部类的对象？？？
 							一个成员内部类需要在外部类的类外创建一个对象，那么这里必须先有外部类的对象，才可以
 							外部类名.内部类名 引用类型变量 = new 外部类名().new 内部类名()
 							也可以将 new 外部类名() 换为  外部类对象
 						c. 如果在内部类当中，想要使用和外部类同名的变量或者成员方法
 							用这个格式 ：  外部类名.this.同名变量/同名方法  Outer.this是Outer类的当前使用对象
 */

// 外部类
class Outer {
	int num = 100;
	static int s = 10;
	// 定义一个【成员】内部类
	class Inner { //这是Outer 类的一个内部类
		int i = 10;// 内部类的成员变量
		int num = 50;
		
		public void testInner() {
			testOuter(); //可以使用外部类的成员方法
			//num = 200; //可以使用外部类的成员变量
			s = 20;
			testStatic();
			System.out.println(num); //  输出为50
			System.out.println(Outer.this.num); //Outer.this是Outer的类对象调用num 使用的是外部类的变量 100
			System.out.println("Inner类的成员方法~~~~~~~");
			Outer.this.testOuter(); //同样通过这个方法调用外部类的成员方法
		}
	}
	
	public void testOuter() {
		System.out.println("Outer类的成员方法~~~~~~~~");
	}
	
	public void testStatic() {
		System.out.println("Outer类的静态成员方法~~~~~~~");
	}
	
	//在外部类的方法中创建了一个内部类的对象
	public void createInner() {
		Inner inner = new Inner();
		inner.testInner();
		inner.i = 20;// 可以调用内部类的成员方法和成员变量
		testOuter();
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.createInner();
		
		//如何在外部类的类外创建一个内部类的对象
		//一个成员内部类需要在外部类的类外创建一个对象，那么这里必须先有外部类的对象，才可以
		
		/*
		 	
		 	Inner 在外部类类外的数据类型格式
		 	Outer.Inner
		 */
		Outer.Inner inner = new Outer().new Inner(); //通过匿名类调用
	
		//也可以这样写
		Outer no = new Outer();
		Outer.Inner inner2 = no.new Inner();
	}
}
