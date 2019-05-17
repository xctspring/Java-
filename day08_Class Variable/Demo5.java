package spring;

/*
 	需求：用Java描述一个Baby类，
 	一个孩子出生之前就有名字，用代码来表示这个过程
 	
 	【构造函数】
 		构造函数的功能： 初始化类对象
 		
 		构造函数的格式：
 				修饰符 类名() {
 					语句体;
 				}
 				
		构造函数的小细节：
			1. 构造方法没有返回值
			2. 构造方法的函数名必须和类名相一致
 			3. 当一个类中没有构造方法的时候，Java编译器会自动帮我们生成一个无参构造函数
 			4. 如果类中有一个构造函数，java编译器不会帮我们生成构造函数
 			5. 一个类当中可以根据不同的使用情况，定义多个构造方法，这里利用的是java的函数重载机制
 			
 		构造方法和成员方法的区别：
 			返回值区别：
 				1. 构造函数没有返回值
 				2. 普通函数必须有返回值，就算真的没有返回值，也要有void
 			函数名区别：
 				1. 构造函数名必须是类名
 				2. 普通函数只要符合命名规范就ok 小驼峰
 			作用区别：
 				1. 构造函数是用来创建对象和初始化的
 				2. 普通函数是根据我们的实际需要来定义各种各样的函数
 			调用的区别：
 			 	1. 构造函数的实际使用者是JVM，是JVM在创建对象的时候要调用的方法
 			 	2. 普通函数只能通过对象或者类名来调用这个函数
 			 	
 	【反编译工具】
 		javap -c -l -private ***.class
 		-c 反编译的选择
 		-l 显示行号和本地变量
 		-private 显示所有类成员
 		***.class javap要反编译的class文件
 		*
 */
class Baby {
	private String name;
	
	//没有参数的构造构造方法，默认情况下java自动编写
	public Baby() {
		System.out.println("无参构造方法已经被调用~~~");
	}
	
	//有参数的构造方法
	//这里发现两个构造方法是一样的，这就是Java中的函数的【重载】
	public Baby(String n) {
	
		name = n;
		System.out.println("有参构造方法已经被调用~~~");
	}
	
	public String getName() {
		return name;
	}
}

public class Demo5 {
	public static void main(String[] args) {
		//直接创建了一个对象
		Baby baby = new Baby(); //无参构造方法
		//使用对象中的name属性
		System.out.println(baby.getName());
		
		
		Baby babyHavaName = new Baby("xct"); //有参构造方法
		System.out.println(babyHavaName.getName());
	}
}
