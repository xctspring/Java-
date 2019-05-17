package spring;

/*
 	在java中，有三种对于成员变量的赋值操作：
 		1. 构造函数
 		2. 构造代码块
 		3. 在定义时直接赋值
 	
 	优先级问题：
 		当存在构造函数的时候，构造函数中对于成员变量的修改是最终值；
 		如果不存在构造函数，定义时的默认值的优先级 ====== 构造代码块的优先级，也就是谁在后面最终执行谁
 	
 */
public class Demo2 {
	int i = 1;
	
	{
		i = 2;
	}
	
	
	public Demo2() {
		i = 3;
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		System.out.println(d.i); // 输出3  
	}
}
