package spring;

/*
 	 作业：
 	用java描述一个普通学生，Java基础班的学生，Java就业班的学生
 	这些学生都输于Student类
 	这些学生都回学习，但是每个班的学生学的内容不一样
 	普通版的学生：马克思列宁主义
 	基础班的学生： JavaSE
 	就业班的学生：JavaEE + SSH
 	
 */

//学生类父类
class Student {
	int id;
	String name;
	
	public Student() {
		System.out.println("Student类的无参构造函数~~~~~~~");
	}
	
	public Student(int id, String name) {
		if (id <= 0) {
			System.out.println("输入不合法，系统默认为1~~~~~~~~");
			this.id = 1;
		} else {
			this.id = id;
			this.name = name;
			System.out.println("Student类的有参构造函数~~~~~~~");			
		}
	}
	
	public void learning() {}
}

//普通班学生类
class StudentOfNormalClass extends Student {
	String course;
	
	public StudentOfNormalClass() {
		
	}
	
	public StudentOfNormalClass(int id, String name, String course) {
		super(id, name);
		this.course = "马克思列宁主义";
		System.out.println("StudentOfNormalClass类的有参构造函数被调用~~~~~~~~~");
	}
	
	@Override
	public void learning() {
		System.out.println("我是普通班的学生，我的ID是 " + id + " 名字是" + name + " 学的课程是" + course);
	}
	
}

//基础班学生类
class StudentOfFundamentalClass extends Student {
	String course;
	
	public StudentOfFundamentalClass() {}
	
	public StudentOfFundamentalClass(int id, String name, String course) {
		super(id, name); // 继承Student类
		this.course = "JavaSE";
		System.out.println("StudentOfFundamentalClass类的有参构造函数被调用~~~~~~~~~");
	}
	
	@Override
	public void learning() {
		System.out.println("我是基础班的学生，我的ID是 " + id + " 名字是" + name + " 学的课程是" + course);		
	}
}

//就业班学生
class StudentOfEmployingClass extends Student {
	String course;
	
	public StudentOfEmployingClass() {}
	
	public StudentOfEmployingClass(int id, String name, String course) {
		super(id, name);
		this.course = "JavaEE + SSH";
		System.out.println("StudentOfEmployingClass类的有参构造函数被调用~~~~~~~~~");
	}
	
	@Override
	public void learning() {
		System.out.println("我是就业班的学生，我的ID是 " + this.id + " 名字是" + this.name + " 学的课程是" + this.course);				
	}
}


public class Homework {
	public static void main(String[] args) {
		Student student = new Student(111, "小傻傻");
		
		StudentOfNormalClass studentOfNormalClass = new StudentOfNormalClass(222,"小猪猪","");
		studentOfNormalClass.learning();
		
		StudentOfFundamentalClass studentOfFundamentalClass = new StudentOfFundamentalClass(111, "小狗狗", "");
		studentOfFundamentalClass.learning();
		
		StudentOfEmployingClass studentOfEmployingClass = new StudentOfEmployingClass(333, "小鼠鼠", "");
		studentOfEmployingClass.learning();
	}
}
