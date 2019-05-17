package Spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 	集合的遍历：
 		迭代器：
 			toArray();
 			Iterator();//获取迭代器
 */
public class Demo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("《忠犬八公》");
		c.add("《速度与激情》");
		c.add("《魔戒》");
		c.add("<第一滴血>");
		c.add("<战狼>");
		
		//遍历集合的方式一：可以使用toArray() 把所有的数据转换到数组中，通过数组变量获取
		Object[] arr = c.toArray(); //要进行数据的转换
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
		
		//遍历集合的方式二：通过迭代器，用到的方法是iterator()
		Iterator it = c.iterator(); //返回一个迭代器
		
		/*
		 	iterator 返回的是一个iterator 的接口类型，但是可以调用iterator 中的所有方法，
		 	这些方法要求遵从接口的类来完成。
		 */
		//hasnext() next() remove()
		
		//hasNext()  判断当前的集合当中，有没有下一个元素，原理：该方法中用当前的下标和集合中的size比较
		System.out.println(it.hasNext());
		
		//next() 获取当前迭代器所指向的元素，并且将迭代器指向下一个元素, 一般可以重复调用
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		//remove() 删除元素：要和next()一起使用，先使用next() 将结合中拿出，再删除，也就是说没有next()就不会remove()
		it.next();
		it.remove();//next了四次，最后一个拿出的是第四个元素，remove删除的是第四个元素
		
		System.out.println(c);
		
		// 常用用法- 清楚集合，将hasNext() 作为判定条件
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(c.isEmpty());
		
		
		
		
		
		
		
		
		
	}
}