package spring;

//局部内部类

public class Demo2 {
	public static void main(String[] args) {
		final int a = 10; // 局部内部类中要使用，用final修饰
		
		class MethodInner {
			int num = 0;
			
			public void test() {
				System.out.println(a);
				
				//!a = 10;
			}
		}
		
		MethodInner inner = new MethodInner();
		inner.test();
		System.out.println(inner.num);
	}
	
	public static void useClass() {
		
	}
}
