package spring;

/*
 	就近原则：在类当中如果存在同名的变量名，Java编译器会认为最近的变量名时要操作的变量
 	
 	this关键字： 谁调用这个函数或者方法，谁就是this
 	this代表调用当前方法的类对象
 	
 	this关键字的作用：
 		1. 如果在同一个函数中，出现了和成员变量同名的变量名，可以利用的this 来区分不同的变量
 			this.成员变量   表示使用的时成员变量
 		2. this关键字还能调用类当中的其他函数，这里包括成员方法和构造函数
 */

class Car {
	private int speed;
	private String color;
	
	public Car() {
		System.out.println("这是一个无参的构造函数~");
	}
	
	public Car(int speed, String color) {
		this.speed = speed; //speed = speed;
		this.color = color; //color = color;  如果不加this关键字    java会根据就近原则任务Car函数中的 speed变量
		this.run(); //this 关键字调用方法
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setColor(String color) {
		System.out.println("this" + this);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void show() {
		System.out.println("Speed:" + speed + "Color:" + color);
	}
	
	public void run() {
		System.out.println("在德国的高速公路上以300KM/H狂飙~~~");
	}
}
 
public class Demo3 {
		public static void main(String[] args){
			Car BMW = new Car(220, "白色");  // BMW调用Car()，所以BMW就是this
			BMW.show();
			
			Car Auto = new Car(80, "红色");
			Auto.show();
			
			System.out.println("Auto" + Auto);
			Auto.setColor("白色");			
			Auto.show();
			
			System.out.println("BMW" + BMW);
			BMW.setColor("黑色");
			BMW.show();
		}
}
