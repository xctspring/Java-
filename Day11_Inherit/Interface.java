package spring;

/*
 	interface  接口
 	UI  User Interface
 	
 	接口的功能： 拓展当前的工具
 	
 	定义：
 		interface 接口名 {
 			// 拓展的内容，方法的声明或者静态常量
 		}
 		
 	interface 使用的注意事项：
 		1. 在interface 当中所有的方法，都是一个默认用abstract 修饰的方法，
 		用abstract 修饰的方法是没有方法体的，只有方法的申明但是没有方法的实现
 		2. 在interface 当中所有的成员变量都是一个默认的final 类型的，定义
 		时要完成初始化操作
 		3. 一个类如果要 遵从 接口，要使用的关键字时 implements，并且一定要完成
 		在接口中定义的抽象方法 
 		4. 在interface 中定义的成员变量 他的缺省属性为   public static final
 		5. 在interface 中定义的成员方法，缺省属性为 public abstract
*/

interface A {
	int i =10;// 在这里缺省了,全部为 public static final int i = 10;
	//final 必须初始化，且不可改变
	
	void test(); //在这里缺省了，全部为 public abstract viod test();
}

public class Demo7 implements A {
	
	@Override
	public void test() {
		System.out.println("这里时遵从接口实现的方法~~~~~~~~~~");	
	}
	
	public static void main(String[] args) {
		Demo7 d = new Demo7();
		
		d.test();
		
		
	}
}
