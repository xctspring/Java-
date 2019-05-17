package spring;

//成员内部类

class Outer {
	int num = 100;
	
	class Inner {
		int num = 10;
		
		public void test() {
			System.out.println(num);//100
			System.out.println(Outer.this.num);//10
		}
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); //创建一个内部类对象
		inner.test();
	}
}
