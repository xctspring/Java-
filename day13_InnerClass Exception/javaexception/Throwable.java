package javaexception;

/*
 	Throwable 这是Java 中所有错误和异常的超累
 		Error  错误 无法处理  只能避免
 		Exception  异常可以处理，分为：运行时异常和编译时异常
 	
 	例如：
 		去餐馆吃饭，吃完了，发现没带钱，这是运行时异常
 		准备去吃饭，没钱，这是编译时异常
 	
 	Throwable 的方法：
 		构造函数：
 			创建一个Throwable 的类对象，用于提供报错
 			Throwable(); 创建一个错误信息为null 的Throwable类对象
 			Throwable(String message); 创建一个错误信息为传入参数message 的Throwable 类对象
 	
 		成员方法：
 			getMessage(); 获取错误的详细信息字符串
 			toString(); 返回一个错误的简短描述
 			
 			printStackTrace; 在控制台打印异常的前因后果
 */

public class Demo1 {
	public static void main(String[] args) {
		//创建一个Throwable类对象，这里的错误信息为null
		Throwable t = new Throwable("我感冒了~~~~");
		
		System.out.println(t.getMessage());
		System.out.println(t.toString());
		
		t.printStackTrace();
		test();
	}
	
	public static void test() {
		Throwable a = new Throwable("你来咬我啊~~~~~");
		a.printStackTrace();
	}
}
