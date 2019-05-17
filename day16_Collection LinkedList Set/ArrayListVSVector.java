package spring;

/*
 	-------| Collection  单列集合接口类，规定了很多方法，要求所有的子类都要去实现
 			-------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
				-------| ArrayList  底层维护的是一个Object 类型的数组，默认元素个数时10 个，特征： 查询速度快，增删慢
								什么时候使用ArrayList保存数据？数据查询要求比较高，而增删使用少
								如： 高校图书管理系统
				-------| LinkedList 底层维护的时一个链表，
								特征，增删快，查找慢
				-------| Vector（了解） 底层维护了一个Object类型的数组，和ArrayList一样，但是Vector是线程安全的，效率比较低 
 			-------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 	
 	 1. ArrayList 和Vector 的区别：
 	 	相同点：
 	 		ArrayList 和Vector 底层都是维护一个Object 类型的数组
 	 	不同点：
 	 		a. ArrayList 是线程不同步的 ，操作效率高
 	 		   Vector是线程同步的，操作效率低
 	 		b. ArrayList 是JDK1.2出现的，Vector是JDK1.0
 */
public class Demo2 {

}
