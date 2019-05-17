package spring;

/*
 	局部内部类
 		放在方法或者函数里面的类，称之为局部内部类
 		
 		
 		1. 局部变量的【生存周期】：   从声明位置开始，到代码块结束
 					【作用域】： 只能在代码块中
 		2. 类对象的    【生产周期】： 通过new 关键字创建的时候开始，JVM 进行垃圾回收的时候销毁对象时结束
 					【作用域】： 哪里有这个对象的地址，哪里就是他的作用域
 					
 		局部类对象实在函数的内部通过JVM虚拟机创建的，并且通过JVM垃圾回收机制创建的
 		所有，这个类对象的生存周期与 testInner函数不同
 		但是testInner函数中的普通局部变量n ，他的生存周期是和testInner()一致的
 		
 		如果在局部内部类对象里面使用了testInner函数的局部变量，就有可能存在  testInner函数里面的局部变量n
 		的生存周期被拉长，这不符合Java原理
 		为了解决这个问题，如果局部内部类对象要使用所在函数的局部变量时，这个局部变量使用final 修饰，只能使用不可修改
 */

class Test {
	int num = 100;
	
	public void testInner(){
		//局部内部类 定义在成员方法中
		int n = 10;
		class MethodInner {
			final int i = 10; //final 修饰
			
			public void function() {
				System.out.println();
				
				//! n = 100;
				
				System.out.println("局部内部类MethodInner的方法");
			}
		}
		//在函数里面就可以定义局部内部类的类对象
		MethodInner inner = new MethodInner();
		inner.function();
		
	}
	
	public void createInner() {
		//在这里无法定义局部内部类的类对象，因为局部内部类这个声明的生命周期在函数里面
		//！Method methodInner = new MethodInner();
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Test t = new Test();
		t.testInner();
	}
}
