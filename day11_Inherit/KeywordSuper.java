package spring;

/*
 	子类在创建的时候，会自动调用父类对应的构造函数
 	但是父类的构造函数又不能被子类继承
 	
 	[问题]
 		创建子类的时候，希望通过子类来初始化从父类继承过来的属性，但是又不能直接调用父类的构造函数
 		用this 关键字不合适，因为这是父类的属性，用父类的构造函数更加合适
 	
 	[原因]
 		在父类的构造函数中，可能存在对于初始化操作的一个限制和约束，这个限制和约束是为了保证代码的业务逻辑符合生活要求，
 		但是如果在子类中直接使用this 来赋值继承而来的父类属性，没有通过判断和约束，可能导致代码的业务逻辑出现问题
 	
 		
 		super 调用父类构造函数的关键字
 		
 		super 关键字的细节：
 			1. super 关键字可以调用父类的成员方法和构造函数，他调用构造函数的规则和 this 关键字非常像，
 			如果调用构造函数，必须写在当前代码块的第一行；
 			
 			2. 如果在代码中，没有【显示】的调用父类的构造函数，那么Java编译器会在代码的编译阶段，
 			自动补上一个无参的super()，隐含一个super();
 			
 			3. 如果在子类中需要对父类的属性，进行初始化操作，那么只能通过super 关键字来调用父类的构造函数，
 			不能在子类的构造函数中直接使用this 赋值
 			
 			4. super 和 this 不能在同一个构造函数中调用其他构造函数，因为用 super 或者 this都必须写在代码块的第一行，
 			总有一方不符合条件
 */

//父类
class Father {
	int age;
	int height;
	
	public Father() {
		System.out.println("父类的无参构造函数~~~~~~~~~");
	}
	
	public Father(int age, int height) {
		//构造函数对要初始化的参数有一定的判断和限制
		if (age <= 0 || height <= 0) {
			this.age = 1;
			this.height = 1;
			System.out.println("输入参数不合法，系统默认为1~~~~~~~~~");
		} else {
			System.out.println("父类的有参构造函数~~~~~~~~~");
		}
	}
	
	public void speaking() {
		System.out.println("我要说话了~~~~~~~~~~~");
	}
}


//子类
class Son extends Father {
	int id;
	
	// 隐含super 方法，默认调用 父类的无参构造方法
	public Son(int id) {
		this.id = id;
		System.out.println("子类自己的构造函数~~~~~~~~~");
	}
	
	public Son(int age, int height, int id) {
		// age 和 height 是来源于父类的
		super(age, height);// 使用super 关键字调用父类的构造函数
		this.id = id;
		 
		System.out.println("子类初始化父类属性的构造函数~~~~~~");
	}
	
	public void test() {
		super.speaking(); // 使用super 调用父类的成员方法
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Son son1 = new Son(10);  
		son1.speaking();
		son1.test();
		
		Son son2 = new Son(11, 120, 2);
		son2.test();
	}
}
