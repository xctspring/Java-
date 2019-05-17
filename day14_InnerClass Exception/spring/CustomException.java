package spring;

/*
 	在开发过程中,Java的确提供了大量的异常类，但是有一些不太符合日常的生活逻辑
 	例如，电脑没有网的问题，吃饭没带钱的问题
 	
 	怎么办？
 	这个时候需要自定义异常！！！来满足我们的生活需求
 	
 	如果需要自定义异常，那么必须自定义Exception类
 	
 	继承了Exception类，但是要完成哪些方法呢？？？  
 	要完成构造函数类,并且使用父类的Exception(String message)来设置异常信息
 */

//自定义异常类，一个类继承了Exception，那么这个类就是自定义异常类
class NoNetWorkException extends Exception {
	public NoNetWorkException(String message) {
		super(message); //调用父类Exception的构造函数，来初始化异常信息message
	}
}

public class Demo5 {
	public static void main(String[] args) {
		try {
			QQ("127.0.0.1");
		} catch (NoNetWorkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("快把网线接上~~~");
		}
	}
	
	//因为这个异常时自定义异常，不会被系统直接捕获，需要声明throws
	public static void QQ(String ip) throws NoNetWorkException {
		// 表示没有IP地址
		if (ip == null) {
			throw new NoNetWorkException("没有IP地址");
		}
		System.out.println("QQ已经登录~~~~");
	}
}
