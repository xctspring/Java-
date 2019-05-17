package spring;

/*
 	----| Throwable		是所有异常和错误的超类		
 	-------| Exception	错误，无法处理，只能避免
 	-------| Error 异常，可以处理
 	
	运行时异常，编译时异常
	OutOfMemoryError 超出内存使用
	
	ArrayIndexOutOfBoundsException
	NullPointerException
	
	Exception 
	
	Throwable：
		Throwable();
		Throwable(String message);
		
		getMessage();
		toString();
		printStackTrace(); 打印异常的前因后果
	
	Exception:
		捕获异常：
			try {
				//有可能出现的异常代码
			} catch (异常类型 e) {
				//处理异常的方式
			}
			
		抛出异常：
			1. 格式
				throw new 异常类型();
			2. 如果说方法中有throw出现，那么要求在方法的末尾用throws 来表示这个函数有抛出异常
			外部调用的时候要处理
			3. 调用有抛出异常 的函数时，有两种处理该异常 的方式。第一种时继续抛出，使用 throws；
			     第二种，捕获当前发生的异常，直接处理
			4. 在代码中如果执行了throw 之后的代码，都不会再执行
			5. throws 之后可以跟上多种异常，用逗号隔开
			6. 在抛出异常的时候，每一个条件有且只能抛出一个异常，不同的条件要进行不同的判断
	
	try-catch 和 throw 的区别：
		try-catch 处理之后的代码时可以允许执行的，JVM认为这里异常已经处理结束，后面代码可以继续允许
		throw 是将异常抛出，代码中骑士仍然存在异常，在抛出异常之后的代码是不会运行的，而是在函数中
		在调用抛出异常的函数时，必须将异常catch和处理掉
		
		[问题]
			什么时候用捕获，什么时候用抛出？
			 	抛出一般对应调用者，告诉调用者 ，这里存在一个异常你要考虑
			 	如果在用户层面上，这里抛出异常这个异常就会暴露在用户的使用过程中，这是绝对不允许的 	
			 	这里只能用捕获，然后采用一些方式，将当前异常，反馈给开发者
 */

public class Demo4 {
	public static void main(String[] args) throws ArithmeticException {
		//testException(5, 0, null);
		try {
			testThrows(5, 0, null);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("测试异常的抛出和捕获~~");
		}
	}
	
	public static void testException(int num1, int num2, int[] arr) {
		int ret = 0;
		
		try {
			arr[0] = 10;
			ret = num1  / num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String str = new String();
	
	// 如果说方法中有throw出现，那么要求在方法的末尾用throws 来表示这个函数有抛出异常
	// 外部调用的时候要处理
	public static void testThrows(int num1, int num2, int[] arr) throws ArithmeticException {
		
		 //在抛出异常的时候，每一个条件有且只能抛出一个异常，不同的条件要进行不同的判断
		if (num2 == 0) {
			// 手动创建一个异常，将这个异常抛出，函数执行到这里后 ，跳出
			throw new ArithmeticException("除数不能为0！");
		} else if (arr == null) {
			throw new NullPointerException("空指针异常！");
		} else if (arr.length == 0) {
			throw new ArrayIndexOutOfBoundsException("数组长度为0");
		}
		
		System.out.println("我就想试一下~~~");// 有异常没有catch  后面的不会执行
		int ret = 0;
		
		ret = num1 / num2;
		
		arr[0] = 0;
	}
}
