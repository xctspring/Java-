package spring;

import java.util.HashSet;

/*
 	----------| Collection  单列集合接口类，规定了很多方法，要求所有的子类都要去实现
 	--------------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
	---------------------| ArrayList  底层维护的是一个Object 类型的数组，默认元素个数时10 个，特征： 查询速度快，增删慢
								什么时候使用ArrayList保存数据？数据查询要求比较高，而增删使用少
								如： 高校图书管理系统
	---------------------| LinkedList 底层维护的时一个链表，
								特征，增删快，查找慢
	---------------------| Vector（了解） 底层维护了一个Object类型的数组，和ArrayList一样，但是Vector是线程安全的，效率比较低 
 			
 	--------------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 	---------------------| Hashset 底层使用了一个hash表来支持，特征： 存取速度快
 	
 	HashSet 的存储实现原理：
 		在HashSet 里面添加元素的时候，HashSet 会首先调用该元素的hashCode() 计算该元素的hash 值，
 		通过hash值的移位运算，就可以算出该元素在hash 表中的位置
 		
 		情况1 ：
 			如果hash表中的位置没有任何一个元素，直接将该元素放入到这个hash 表中
 			
 		情况2：
 			如果计算该元素应该存放的位置上已经有其他元素，那么就会调用这个元素的equals() 和 已经在hash表中保存的元素进行比较，
 			如果结果为true，则后来者不能被保存到hash表中，如果为false，两个元素共存
 */

class Person {
	int id;
	String name;
	
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ID:" + this.id + " Name:" + this.name; 
	}
	
	//对hashCode() 进行重写，返回需要进行作为标识符的字段
	@Override
	public int hashCode() {
		System.out.println("================hashCode===================");
		return this.id;
	}
	
	
	//对equals() 进行重写，基于自己定义的标识符进行判断
	@Override
	public boolean equals(Object obj) {
		System.out.println("================equals===================");
		Person p = (Person)obj;
		return this.name.equals(p.name);
		//return this.id == p.id;
	}
}

public class Demo4 {
	public static void main(String[] args) {
		/*
		HashSet set = new HashSet();
		
		set.add("科比");
		set.add("乔丹");
		set.add("杜兰特");
		set.add("艾弗森");
		set.add("艾弗森"); //相同的无法添加，但是也不会报错
		
		System.out.println(set);
		*/
		HashSet set = new HashSet();
		
		set.add(new Person(1,"哈登"));
		set.add(new Person(2,"杜兰特"));
		set.add(new Person(3,"保罗"));
		set.add(new Person(4,"欧文"));
		
		//认为如果ID 相同就是同一个对象
		System.out.println(set);
		//系统默认地址不同，添加的对象是不相同的，所以添加成功
		System.out.println(set.add(new Person(1,"大胡子")));
		System.out.println(set.add(new Person(1,"夜店登")));
		
		System.out.println(set);
	}
}
