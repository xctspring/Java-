package spring;

interface A {
	public void testA();
}

abstract class Test {
	 public abstract void testB();
}

public class Demo3 {
	public static void main(String[] args) {
		A a = new A() {
			
			@Override
			public void testA() {
				System.out.println("TestA方法~~~");
			}
		};
		
		a.testA();
		
		Test test = new Test() {
			
			@Override
			public void testB() {
				System.out.println("TestB方法~~~~");
			}
		};
		
		test.testB();
		
		//匿名内部类 的匿名对象来调用方法
		new A() {
		
			@Override
			public void testA() {
				System.out.println("匿名内部类的匿名对象~~~~");
			}
		}.testA();
		
		new Test() {
			
			@Override
			public void testB() {
				System.out.println("抽象类的匿名内部类的匿名对象~~~~~");
			}
		}.testB();
	}
}
