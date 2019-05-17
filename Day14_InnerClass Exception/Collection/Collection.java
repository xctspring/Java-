package codingmonkey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/*
 
 集合：
 	集合就是存储 对象类型 的【容器】。
 	
 	---| Collection  集合接口类，规定了很多方法，要求所有的子类都要去实现
 	-------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
 	-------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 	
 	在Collection 当中，要求遵从Collection接口要实现一下的方法：
 		1. 添加系列的：
 			add(E, e);
 			addAll(Collection<? extends E> c); 添加另一个集合到当前集合
 		2. 删除系列的：
 			clear();
 			remove(Object o);
 			removeAll(Collection<?> c); 删除两个集合之间相同的元素
 			retainAll(Collection<?> c); 保留两个集合之间相同的元素
 			
 		3. 查看系列的：
 		
 			size();  获取集合中元素的数量
 			toArray(); 返回集合中所有元素的数组，返回的类型是Object
 */

public class Demo2 {
	 public static void main(String[] args) {
		//Collection 是一个接口，不能创建自己的类对象，但是可以指向任意的遵从接口的类对象
		
		//借助ArrayList 来完成Collection的学习   ArrayList里面包含了Collection中的方法，也有List的特征，是开发中用的最多的集合
		Collection c = new ArrayList();
		
		//add(Object o) 添加单个元素
		c.add("Cherry");
		c.add("达尔优");
		c.add("filco");
		System.out.println(c);
		
		Collection c2 = new ArrayList();
		
		c2.add("Leopold");
		c2.add("IKBC");
		//System.out.println(c2);
		
		//addAll(Collection c) 添加另一个集合到当前集合
		c.addAll(c2);
		System.out.println(c);
		
		//clear()  清空所有元素
		//c.clear();
		
		//删除指定元素
		c.remove("达尔优");
		System.out.println(c);
		
		//删除两个集合中相同的元素
		//c.removeAll(c2);
		//System.out.println(c);
		
		//保存两个集合中相同的元素
		c.retainAll(c2);
		System.out.println(c);
		
		
		System.out.println(c.size());
		
		
		//注意toArray的用法，   array直接输出是一个内存地址，要toString
		Object[] arr = c.toArray();
		System.out.println(Arrays.toString(arr)); // 注意array 转 String 的用法
	 }
}
