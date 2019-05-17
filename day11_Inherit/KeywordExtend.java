package spring;

/*
 	继承：
 		多用于游戏开发
 		所有人物都属于一个类，这个类当中包含了所有的共通的属性
 		
 		每一个门派之间，技能不同，也就是在人物的基础中加入了技能的特征
 		
 		要求门派里面的人物必须有角色这个类里面的所有的属性
 		
 		继承：
 			在代码中就是一个类 继承 了另一个类的所有可以被继承的属性
 			
 		【发现】
 			1. 在调用子类的构造函数的时候，也会来调用父类的构造函数。也就是说，一个子类的创建必须现有父类的对象空间才可以
 			
 			2. 子类不能继承父类的private 属性的成员变量和成员方法
 			
 			3. 【注意事项】
 			 	继承的确能帮助我们节省代码空间，但是不能是为了节省代码而且继承，一定要存在继承关系，才能使用继承
 */

class Person {
	int age;
	String name;
	
	public Person() {}
	
	public Person(int age, String name) {
		this.age  = age;
		this.name = name;
	}
	
	public void coding() {
		System.out.println("愉快的写代码~~~~~~~");
	}
}

//extends 继承的关键字，表示Worker继承了Person类，那么Worker类就是Person类的一个子类
class Worker extends Person {
		int id;
		
		public Worker() {
			System.out.println("Worker类的无参构造函数~~~~~");
		}
		
		public Worker(int id) {
			this.id = id;
			System.out.println("Worker类的有参构造函数~~~~~");
		}
		
		public void working() {
			System.out.println("开心的工作~~~~~~~~");
		}
		
}

public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.coding();
		
		Worker worker = new Worker();
		//以下是Worker自己的成员方法和成员变量
		worker.working();
		worker.id = 9527;
		
		//以下是Worker继承了Person类的成员变量和方法， 这里可以直接使用
		//有父类的成员变量和成员方法 与 子类的【合在一起】才是一个 完整的Worker类对象
		worker.name = "xct";
		//worker.age = 16;
		//age 是父类用private 修饰的成员变量，那么这个成员变量是无法在Person类外使用的
		//也可以理解为只继承 非private 的成员
		
		System.out.println("age:" + worker.age + " id:" + worker.id + " name:" + worker.name);
	}
}
