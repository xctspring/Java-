package spring;

/*
	接口类型的多态
*/

interface AA {
	public void test();
}

class Test1 implements AA {
	
	@Override
	public void test() {
		System.out.println("遵从接口AA实现的方法~~~~");
	}
}

public class Demo3 {
	public static void main(String[] args) {
		//接口的引用数据类型，指向遵从接口的类对象，这也是多态
		AA a = new Test1();
		a.test();
	}
}
