package spring;

/*
 	在java中有的类在创建之后就调用了某个方法一次之后再也不使用，这样会导致资源的浪费以及代码的臃肿
 	为此，  Java提供了一种方式：   ——————————   匿名对象
 	
 	匿名对象的格式：
 		new 类名().调用的方法();
 		
 	作用：
 		简化书写
 	
 	使用场景：
 		1. 在代码中，有一些类只使用一次，通过这个类对象来调用这个类的某些方法
 		2. 可以作为函数的实际参数传递
 */

class Student {
	String name;
	String id;
	
	public void study() {
		System.out.println("good good study,day day up!");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "spring";
		student.id = "00001";
		
		
		student.study();
		
		System.out.println(student);
		System.out.println(new Student());
		
		//创建一个匿名对象     new之后，创建的就是对象在【内存堆区】的空间，也就是对象的本体
		new Student().study();
		
		/*
		  	new Student().name = "xct";这里对匿名对象的成员变量进行赋值，
		 	语法上没有问题，但是这个成员变量之后无法使用，所以没有实际意义   
		 */
		
		test(student);
		test(new Student()); //可以作为函数的实际参数传递
	}
	
	
	public static void test(Student t) {
		t.study();

	}
}
