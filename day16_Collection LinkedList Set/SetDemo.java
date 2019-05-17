package spring;

import java.util.HashSet;
import java.util.Set;

/*
 	-------| Collection  单列集合接口类，规定了很多方法，要求所有的子类都要去实现
 	--------------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
	---------------------| ArrayList  底层维护的是一个Object 类型的数组，默认元素个数时10 个，特征： 查询速度快，增删慢
								什么时候使用ArrayList保存数据？数据查询要求比较高，而增删使用少
								如： 高校图书管理系统
	---------------------| LinkedList 底层维护的时一个链表，
								特征，增删快，查找慢
	---------------------| Vector（了解） 底层维护了一个Object类型的数组，和ArrayList一样，但是Vector是线程安全的，效率比较低 
 			
 	--------------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 	
 	无序：展示出来的顺序可能不是添加元素的顺序
	hashCode(); 返回元素内存中的地址编号
	equals(); 比较地址，如果地址相同，就认为相同
 */

public class Demo3 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("周二珂");
		set.add("陈一发儿");
		set.add("冯提莫");
		set.add("麦迪");
		set.add("姚明");
		set.add("陈一发儿"); // 不会放进去，不能放入相同的，但是也不会报错
		
		System.out.println(set);
		
	}
}
