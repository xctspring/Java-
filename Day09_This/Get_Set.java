package spring;

class Person {
	private int age;
	private String sex;
	private String name;
	
	public Person() {
		System.out.println("这是一个无参的构造函数~~~~");
	}
	
	public Person(int age, String sex, String name) {
		/*
		this.age = age;
		this.sex = sex;
		this.name = name; 这样写没有考虑业务逻辑
		 */		
		this.setAge(age);
		this.setName(name);
		this.setSex(sex); // 这样写考虑了业务逻辑
		
		System.out.println("这是一个三个参数的构造函数~~~~");
	}
	//利用set方法，让代码既符合语法规则，也符合业务逻辑
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("输入一个大于0的数~~~,系统默认为：0");
			this.age = 0;
		} else{	
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		if (sex.equals("男") || sex.equals("女")){
			this.sex = sex;	
		}else {
			System.out.println("输入数据不合法~~~~~,系统默认为:男");
			this.sex = "男";
		}
		
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.println("xct的Age：" + age + "Name：" + name + "Sex：" + sex);
	} 
}
public class Deno5 {
	public static void main(String[] args) {
		Person xct = new Person(-1, "d", "xct");
		xct.show();
		new Person(23, "男", "xct").show();
	}
}
