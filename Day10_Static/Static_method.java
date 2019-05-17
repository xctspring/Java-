package spring;

/*
 	静态方法：
 	static 不单单能修饰成员变量，也能修饰成员方法
 	
 	有static修饰的函数，称之为静态函数或者静态方法
 	
 	格式：
 		权限修饰符 static 返回值 函数名() {
 			函数体;
 		}
 	
 	调用方式：
 		类对象.静态方法();报Warning   应该使用静态的方式来调用
 		类名.静态方法();
 		
 	静态方法使用的注意事项：
 		1. 在静态方法中不能使用非静态的成员变量，因为没有对象，没有对象调用成员变量；可以使用静态的成员变量
 		2. 在静态方法中不能使用this 关键字，因为没有对象，this 代表的是调用改方法的对象
 		3. 在静态方法中不能使用 非静态的成员方法，因为没有对象，  只可以使用静态成员变量
 		4. 能调用构造函数！   在静态方法中可以去创建一个对象来处理 
 	
 	 没有对象：
 	 	发现，  在静态方法中很多地方都不能涉及到对象的操作，因此称之为【没有对象】
 	 	
 	 	为什么没有对象？？？
 	 	必背： 	
 	 		1. 静态的成员方法或者函数，这些东西是在类文件加载之前，就已经内存中存在了，
 	 		对象可以访问这个静态方法，类名也可以访问这个静态方法
 	 		2. 这个静态方法是早于对象存在的，但是这个对象销毁了，这个方法依然存在
 	 		以上说明同样适用于静态成员变量
 	 		
 	 	什么时候使用 static 修饰成员方法和函数？？？
 	 		1.Arrays sort binarySearch toString copyOf   这些方法都没有用到它的类本身的数据
 	 		如果一个函数没有用到类当中本身的成员变量，所用到的数据都是来源于类外，靠参数传递。那么这个函数就可以定义为静态函数
 	 		
 	 	静态对静态
 	 	非静态对非静态
 */

class Student {
	String name;
	static String country = "PRC";//静态成员变量
	
	public Student(){}
	
	public Student(String name) {
		this.name = name;
	}
	
	//用static 修饰的静态方法
	public static void sleep() {
		//name = "xct";    报错     【注意事项1】
		//this.name = "xct"；   报错     【注意事项2】
		//run();  报错    【 注意事项3】
		country = "PRC";
		System.out.println("不要上课睡觉~~~~~~");
	}
	
	//非静态的成员方法
	public void run() {
		System.out.println("跑起来~~~~~~~~~~~~");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Student stu = new Student("xct");
		
		System.out.println(stu.country);
		
		stu.sleep(); //报 Warning 要用下面的静态的方式调用
		Student.sleep();
	}
}
