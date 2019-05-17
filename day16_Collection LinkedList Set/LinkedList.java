package spring;

import java.util.LinkedList;

/*
 	 	-------| Collection  单列集合接口类，规定了很多方法，要求所有的子类都要去实现
 			-------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
				-------| ArrayList  底层维护的是一个Object 类型的数组，默认元素个数时10 个，特征： 查询速度快，增删慢
								什么时候使用ArrayList保存数据？数据查询要求比较高，而增删使用少
								如： 高校图书管理系统
				-------| LinkedList 底层维护的时一个链表，
								特征，增删快，查找慢
				-------| Vector（了解） 自带线程判断，线程安全，普遍效率较低
 			-------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 		
 		LinkedList 的特有的方法:
 		  1. 方法介绍：
 			a. boolean addFirst(E e);
 			b. addLast(E e);
 			c. E getFirst();
 			d. getLast();
 			e. removeFirst();
 			f. removeLadt();
 			
 		2. 	作业1：
 			栈：先进后出，弹夹，水杯  
 					StackList {LinkedList}
 			队列：先进先出
 					TeamList {LinkedList}
 		
 		3. 利用LinkedList 完成补课牌的洗牌功能
 			class Poker {
 				int color;
 				int num;
 			}
 			
 			String[] color = {"黑", "红", "梅", "方"};
 			
 			String[] num = {"A", "2",......, "K"};
 */
public class Demo1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("<<战狼3>>");
		list.add("<<美人鱼>>");
		list.add("<<少林寺>>");
		
		System.out.println(list);
		
		list.addFirst("<<见龙卸甲>>"); //在队首添加一个元素
		System.out.println(list);
		
		list.addLast("<<今晚80后脱口秀>>"); //在队尾添加一个元素
		System.out.println(list);
		
		Object o1 = list.getFirst(); //获取第一个元素
		System.out.println(o1);
		
		Object o2 = list.getLast();
		System.out.println(o2);
		
		list.removeLast();
		System.out.println(list); //删除队尾的最后一个元素
		
		list.removeFirst();
		System.out.println(list); // 删除队首的第一个元素
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
