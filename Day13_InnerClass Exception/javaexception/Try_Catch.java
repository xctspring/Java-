package javaexception;

/*
 	医院处理病人（对应的是java 处理异常的两种方式）：
 	 	1. 本医院当场处理
 	 	2. 推给其他医院
 	 	
 	 JVM在运行程序时，创建了一个Throwable 类对象，当发现异常，直接保存到Throwable类对象里面直接报错，
 	 利用printStackTrace方法来打印错误信息。
 	 
 	 Java异常处理的第一种方式：
 	 	捕获异常：捕获后，系统会继续往下执行，如果没有捕获，系统不会往下执行
 	 	
 	 	
 	 		try {
 	 			//可能出现的异常语句
 	 		} catch (异常类型 e) {
 	 			//对于异常的处理方式
 	 		} catch (异常类型 e) {
 	 			//对于异常的处理方式
 	 		} 
 	 		
 	 	try-catch 语句的特征：
 	 		1. 如果代码中没有try-catch 语句，程序发生异常就会在发生异常就会在发生异常的地方直接停止，不会继续进行
 	 		如果使用了try-catch 语句，程序发生异常，JVM会认为try-catch 已经将异常处理完毕，之后的代码会继续执行
 	 		2. 如果是在try-catch 语句中的try代码块里面，只要发现有一行代码出现了出错误，后面的代码都不会执行
 	 		3. 如果一个try-catch存在多种异常情况，可以书写多个catch语句，但是要求大的异常要放在最后，
 	 		否则会导致小的异常不生效，也会导致异常的处理不完全
 	 		4.【建议】异常处理不能统一处理，要根据不同的异常情况，区分处理，才能保证我们代码的健壮性。尽量使用Exception的子类，
 	 		而不是使用Exception类
 	 		
 	 	try {
 	 	
 	 	} catch () {
 	 	
 	 	} finally () {
 	 	
 	 	} 文件处理的时候再来讲，finally 无论如何都会执行
 */

public class Demo3 {
	public static void main(String[] args) {
		div(5, 0);
	}
	
	//相除
	public static void div(int num1, int num2) {
		int ret = 0;
		int[] arr = new int[20];
		//java.lang.ArithmeticException 两个数相除，除数为0的时候会产生这样的异常
		try {
			arr[0] = 5; //对应NullPointerException
			ret = num1 / num2; //对应ArithmeticException
			System.out.println("来咬我啊~~~");//不会执行，还没有处理呢
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		System.out.println("ret = " + ret); //异常已经被捕获，系统会继续往下执行
	}
}
