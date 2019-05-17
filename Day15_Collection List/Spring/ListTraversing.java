package Spring;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
  	三种List集合的遍历方式：
  		a. 使用for循环
  		b. 使用迭代器正序遍历
  		c. 使用迭代器逆序遍历
 */

public class Demo4 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("郭达斯坦森");
		list.add("尼古拉斯赵四");
		list.add("施瓦辛格");
		list.add("巨石强森");
		list.add("岳云鹏");
		
		//使用for循环遍历，利用size(),  get() 获取指定下标的元素
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------------");
		
		ListIterator it =list.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------");
		
		//使用previous()必须要与next() 结合，因为下标起始是在0处，要使用一个while将下标先移到最后一位
		// 使用迭代器逆序遍历
		while (it.hasPrevious()) {
			System.out.println(it.previous());
			
			System.out.println("--------------------------------");
		}
		
		// 增强for循环
		for (Object object:list) {
			System.out.println(object);
		}

	}
}
