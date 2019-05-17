package spring;

/*
 	java中的接口是单线继承
 	如果要使用多继承，可以使用接口来做
 	
 */

interface A {
	public void testA();
}

interface B {
	public void testB();
}

interface C extends A, B {
	public void test();
}

class Test implements C {
	@Override
	public void test() {
		System.out.println("测试test方法");
	}
	
	
	@Override
	public void testB() {
		System.out.println("测试testB方法");
	}
	
	@Override
	public void testA() {
		System.out.println("测试testC方法");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Test test = new Test();
			
		test.test();
		test.testA();
		test.testB();
	}
}
