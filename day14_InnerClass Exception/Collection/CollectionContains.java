package codingmonkey;

import java.util.ArrayList;
import java.util.Collection;

/*
 	contains containsAll以及equals方法
 	如果是系统默认的话，比较的是这些对象再内存当中的地址，但是有的时候实际使用中相比较的是对象里面的内容
 	比如：学生的ID比较，学生的name比较 
 	
 	这里需要重写两个方法：
 		equals	默认是比较两个对象的方法
 		hashCode  默认是对象在内存中的地址以整数输出
 	
 	在系统默认中通过contains containsAll 以及 equals 方法的比较流程是：首先，获取要比较对象的hashCode,
 	然后比较两个hashCode里面的数据是否相同，如果相同证明一样的，如果不相同，就不一样
 	
 	
 */

class Student {
	int id;
	String name;
		
	public Student(int id,String name) {
		 this.id = id;
		 this.name = name;
		}
	
	//对 equals方法的重写，比较内容而不是比较地址
	@Override
	public boolean equals(Object obj) {
		System.out.println("Studnent的equals方法");
		Student stu = (Student)obj;  //强制类型转换，大数据类型转换为小数据类型
		
		//this 就是调用这个方法的Student类对象
		//Object obj 是要传入的类对象
		return stu.id == this.id;
		}
	
	//Java规定如果重写了equals 方法，那么必须返回hashCode算法；
	@Override
	public int hashCode() {
		System.out.println("Student的hashCode方法");
		return this.id; //equals 比较的是id  这里返回的就要是id
		}
	}

public class Demo4 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		
		c.add(new Student(1,"狗蛋"));
		c.add(new Student(2,"狗剩"));
		c.add(new Student(3,"狗娃"));
		
		Student stu = new Student(4,"狗燕");
		c.add(stu);
		
		stu.id = 5;
		stu.name = "狗天";
		
		boolean ret = c.contains(stu); //调用equals一个个比较
		System.out.println("ret = " + ret); // true  是一个对象，只是修改
		
		
		boolean ret1 = c.contains(new Student(1,"狗蛋"));
		System.out.println("ret1 = " + ret1);// false  不是一个对象，又创建了一个新的对象
		//System.out.println(stu);
		System.out.println(stu.hashCode());
	}
}
