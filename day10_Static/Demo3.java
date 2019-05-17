package spring;

/*
 	统计一下这个类有多少个对象
 	
 */

class Person {
	private int id;
	private String name;
	
	static int count;//  使用静态变量count 统计这个类创建了多少对象
	
	{
		count++;
		id = count;
	}
	
	/*
	可以这样写   但是有代码重复  使用构造代码块
	public Person() {
		count++;
		id = count;
	}
	
	public Person(String name) {
		count++;
		id = count;
		this.name = name;
	}
	*/
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getId()); //输出：1
		
		Person p2 = new Person("xct");
		System.out.println(p2.getId());//输出：2
		
		System.out.println(new Person().getId()); //输出：3
		
		Person p3 = new Person("lcy");
		System.out.println(p3.getId());//输出：4
		
		//构造代码块只会在创建对象的时候才会调用，这里并没有创建对象，只是用类名来使用了一个静态变量count
		System.out.println(Person.count); //输出：5
		
		
	}
}
