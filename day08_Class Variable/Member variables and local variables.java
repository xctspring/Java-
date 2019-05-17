package spring;

/*
 	成员变量和局部变量的区别
 		定义位置的区别：
 			1. 成员变量是定义在类里面的
 			2. 局部变量是定义在方法里面的普通变量
 			
 		作用上的区别：
 			1. 成员变量是用来描述一类事物的公共属性
 			2. 局部变量的给函数提供一个用来保存数据的变量内存空间，只是当前函数体中可以使用
 		
 		初始值的区别：
 			1. 成员变量的初始值是在创建对象的时候才有的，如果创建的时候没用赋初值，那么所用的成员变量都是0值
 			2. 局部变量在创建的时候，是没有确定值的，只能通过赋值操作给予一个确定的数据，在java中不能使用未赋值的局部变量
 			
 		生命周期的区别：
 			1. 成员变量的生存周期是随对象创建而生，随着对象的销毁不复存在【在内存的堆区】
 			2. 局部变量是在声明变量而生，在函数结束或者代码块的结束而销毁【在内存的栈区】
 			 
 */
class Person {
	String name; //成员变量
	
	//成员方法
	public void eat() {
		int age = 12; //局部变量
		for (int i = 0; i <= 12; i++) {
			System.out.println(name + "是个大帅比");
		}
	}
}


public class Demo1 {
	
	public static void main(String[] args) {
		Person p1 = new Person(); 
		p1.eat();
		p1.name = "春天";
		p1.eat();
	}
}
