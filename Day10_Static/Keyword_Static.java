package spring;
 	
/*
 	static 关键字的使用
 	
 	用static 和不用 static修饰的区别（静态和非静态）：
 		1. 不用static修饰的时 非静态 的变量，这个非静态成员变量是属于类对象的，是在类对象中
 		   保存某些数据
 		
 		2. 用static修饰的是 静态 的变量，这个静态成员变量和类对象无关，是放在一个数据共享区中
 		   供多类使用的
 	
 	作用：
 		使用static  可以节约数据所需要的空间，面向大量数据
 	
 	【总结】
 		1. 用途； 如果一个类当中，存在某一个数据被多次重复使用，而且数据的内容是一样的，
 		这个时候就可以考虑使用 static 来修饰这个成员变量，方便多类使用，节约内存空间
 		
 		2. static 随着类的加载而定义，先于对象的创建而创建 【饮水机】
 		
 		3. 用 static 修饰的成员变量有两种调用方式：
 			1> 类对象.静态变量;   报Warning   应该使用静态的方式来调用static 变量
 			2> 类名.静态变量;  <------极力推荐-------->  可以不用创建一个对象
 			
 		4. 不能为了方便，把所有类当中的成员变量用static 修饰，这样的话，所有的成员变量都和类对象无关，
 		违背开发原则
 		
 		5. 用static 修饰的成员变量 不管是通过类对象还是通过类修改，一次修改，处处修改    相当于饮水机里放巴豆
 		
 */

class Dog {
	String name;
	//static 修饰这个成员变量，变成一个静态的成员变量，这是存储在共享的内存数据区
	static String country = "JP";
	
	public Dog() {}
	
	public Dog(String name, String country) {
		this.name = name;
		this.country = country;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Dog cyw = new Dog();
		cyw.country = "JP";
		
		Dog ldh = new Dog();
		ldh.country = "JP";
		
		System.out.println(cyw.country + " " + ldh.country); //报Warning   应该使用静态的方式来调用static 变量
		
		Dog.country = "PRC"; // 修改类中的static 变量     这里用类名来调用static变量   这种调用方法不会报Warning
		System.out.println(cyw.country + " " + ldh.country); // 全部的值都修改
		
		Dog hqs = new Dog();
		System.out.println(hqs.country);
		
		hqs.country = "JPX";
		System.out.println(cyw.country + " " + ldh.country + " " + hqs.country);
	}
}
