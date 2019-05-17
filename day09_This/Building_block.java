package spring;

/*
 	小孩子出生的时候就必须哭，所以创建完对象就得哭
 	解决方案：
 		1. 把cry()方法放在构造函数中,但是如果有很多个构造函数，则需要在每一个构造函数中写cry()方法
 		2. 使用Java中的【构造代码块】
 	
 	构造代码块：
 		{
 			执行的代码;
 		}
 		
 		[发现]不管调用哪一个构造函数，都会执行cry方法，但是这个cry方法不在构造函数里面，而在构造代码块中
 		
 		构造代码块：
 			对一个类的所有对象进行一个统一的初始化操作（赋值，调用方法等）,只要这个对象被创建就会调用这个代码块
 			
 	位置： 写在构造函数之前，成员变量之后
 	
 	代码块分为三大类：
 		1. 构造代码块
 		2. 局部代码块：基本不用了 ， 用于缩短局部变量的生产周期
 		3. 静态代码块（static)
 */
class CuteBaby {
	
	//成员变量
	private String name;
	private int id;
	
	//构造代码块
	{
	cry(); //构造使调用方法
	id = 5; //构造时初始化id为5
	}
	
	//构造函数
	public CuteBaby(String n) {
		name = n;
		//cry();   //解决方案1
	}
	
	//私有化变量的set 和 get 方法
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void cry() {
		System.out.println("小孩子哇哇地哭~~~");
	}
	
	public void printId(CuteBaby baby) {
		System.out.println(baby.id);
	}
}

public class Demo1 {
	public static void main(String[] args) {
		CuteBaby baby = new CuteBaby("狗蛋");
		baby.printId(baby);
		//System.out.println(baby.getId());
	}
}

