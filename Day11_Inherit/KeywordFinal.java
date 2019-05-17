package spring;

/*
 	final 最终的 最后的
 	
 	final 的使用：
 		1. 如果一个局部变量使用final 修饰，那么这个变量在之后的操作中都不能被修改。
 		而且他里面的值就是第一次初始化的值
 		2. 如果用final 来修饰一个引用数据类型，那么要求这个引用类型的里面的地址不能发生改变【指向不能变】
 		3. 如果一个方法用final修饰，这个方法不能被重写
 		4.如果final修饰一个类，那么这个类不能被继承
 		
 */

class Circle {
	public void test() {
		System.out.println("这是Circle 类里面的Test 方法~~");
	}
}

public class Demo5 extends Circle {
	public static void main(String[] args) {
		final float PI = 3.1415f;
		
		// PI = 0; 报错
		
		Circle c = new Circle();
		 
		System.out.println(c);
		
		new Demo5().test();
	}
	
	@Override
	public void test() {
		System.out.println("这是在Demo5中重写的方法~~~~~~~~~");
	}
}
