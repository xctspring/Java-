package codingmonkey;

import java.util.ArrayList;
import java.util.Collection;

/*
 4. 判断系列
 	equals(Object c);比较两个集合中的元素是否相同，相同的条件是内容相同，顺序相同，返回true
 	isEmpty();
 	contains(Object c);  判断当前元素在集合中存不存在
 	containsAll(Collection c); 判断集合中的所有元素在当前集合中包不包含，判断一个集合是否是另一个集合的子集合，与元素的顺序无关
 */

public class Demo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("迪丽热巴");
		c.add("林允儿");
		c.add("梁春燕");
		c.add("吴京");
		c.add("任天野");
		c.add("吴刚");
		
		Collection c2 = new ArrayList();
		
		c2.add("胡歌");
		c2.add("吴磊");
		c2.add("黄渤");
		c2.add("张艺兴");
		
		//equals(Object c); 比较两个集合中的元素是否相同，相同的条件是内容相同，顺序相同，返回true
		boolean ret = c.equals(c2);
		System.out.println("ret=" + ret);
		
		//c.clear();
		// 判断当前集合中有没有元素
		System.out.println("这个集合是空的吗？" + c.isEmpty());
		
		//c.contains 判断是否包含指定元素
		System.out.println("当前集合中有没有梁春燕？" + c.contains("梁春燕"));
		System.out.println("当前集合中有没有夏春天？" + c.contains("夏春天"));
		
		// 判断一个集合是否是另一个集合的子集合，与元素的顺序无关
		System.out.println("c集合中是否包含c2集合？" + c.containsAll(c2));
	}
}
