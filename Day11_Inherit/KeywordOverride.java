package spring;

/*
 	[问题]
 		父类的方法不太适用于子类
 	
 	【重写的概念】
 		子类中有和父类重名的方法，这种情况叫做重写
 		
 	@Override  有用来保证这个方法是重写父类中的方法，开启严格检查，如果父类中没有这个方法，通过@Override 就会报错
 	
 	【重写的注意事项】
 		1. 重写的函数必须是所有的参数，返回值，函数名，权限修饰符都必须一样
 		
 		2. 父类类中如果是用private 修饰的方法，那么这个方法没有办法重写，原因是这个方法本身子类都没有继承
 		
 		3. 如果父类中的方法用 public 修饰，但是子类中用 private 修饰，这种情况也不算重写
 
 作业：
 	用java描述一个普通学生，Java基础班的学生，Java就业班的学生
 	这些学生都输于Student类
 	这些学生都回学习，但是每个班的学生学的内容不一样
 	普通版的学生：马克思列宁主义
 	基础班的学生： JavaSE
 	就业班的学生：JavaEE + SSH
 	
 	
 */
class Father1 {
	int age;
	String name;
	
	public Father1() {}
	
	public Father1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void LOL() {
		System.out.println(name + ":" + "老爸英勇黄铜五~~~~~~~");
	}
}

class Son1 extends Father1 {
	String id;
	
	public Son1() {}
	
	public Son1(int age, String name, String id) {
		super(age,name);
		this.id = id;
	}
	
	// 这个并不算继承，这是子类中自己重新定义的一个方法
	/*
	 	为了保证是在父类继承的基础上完成的方法【重写】
	 	这个时候要用到一个关键字
	 	@Override  表示当前的方法是在父类的基础上继承来完成的，重新优化来符合子类的需求
	 	
	 	如果父类中没有这个方法，通过@Override 就会报错
	 */
	@Override
	public void LOL() {
		System.out.println(name + ":儿子是最强王者~~~~~~~~~~~~~~~~");
	}
	
}

public class Demo3 {
	public static void main(String[] args) {
		Father1 father1 = new Father1(40, "sss");
		father1.LOL();
		
		Son1 son1 = new Son1(18, "xct", "CALLMEDATUI");
		
		//子类的确可以调用父类的方法，但是有的时候父类的方法不太适合子类，需要修改
		son1.LOL();
		
	}
}
