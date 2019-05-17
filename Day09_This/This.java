package spring;

/*
 	this 关键字可以调用成员变量，成员方法，而且还能调用构造函数
 	
 	格式：
 		this(参数);
 		
 	注意：
 		1. 如果一个构造函数A通过this关键字调用了构造函数B，必须写在构造函数中的第一行，所以一个构造函数中只能写一个this调用构造函数
 		2. 两个构造函数不能通过this关键字相互调用，语法不通过  （会死循环）
 		
 */
class Bus {
	private int wheel;
	private String name;
	
	public Bus() {
		//无参构造函数
		this(6);	// 这里this 关键字  调用了一个参数的构造函数，同时如果一个构造函数A通过this关键字调用了构造函数B，必须写在构造函数中的第一行
		//this(6,"hi");  再加一个this调用会报错，因为都要放在第一行
		System.out.println("这是Bus类的无参构造函数~~~~");
	}
	
	public Bus(int wheel) {
		this.wheel = wheel;
		System.out.println("这是一个参数的构造函数~~~~");
	}
	
	public Bus(int wheel, String name) {
		this.wheel = wheel;
		this.name = name;
		System.out.println("这时两个参数的构造函数~~~~~");
	}
	
	public void show() {
		System.out.println("Name：" + name + "Wheel：" + wheel);
	}
}
public class Demo4 {
	public static void main(String[] args){
		Bus YuTong = new Bus(); //调用无参的构造函数
		YuTong.show();
	}
}
