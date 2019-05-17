package spring;

import java.util.Comparator;
import java.util.TreeSet;

/*
 	TreeSet 添加自定义元素：
 		a. 向TreeSet 集合中添加元素的时候，如果元素本身就具备了自然顺序的特征，那么就按照自然排序的顺序添加
 		b. 添加自定义元素，这些元素没有自然顺序的话，就添加不进去，我们就可以开、提供一个当前类的一种比较规则，
 		   要遵从Comparable 接口，实现compareTo(T o) 方法
 		c. 如果比较元素的时候，campareTo方法返回的是0，表示这两个元素是一样的，那么这里不允许添加，认为是重复元素(TreeSet 和hashCode 还有equals之间没有任何关系，
 		  它和Comparable 有关系
 		d. 除了要求元素有自然顺序，或者遵从Comparable接口之外，还有一种实现方式：在创建TreeSet的时候，传入参数是一个自定义的比较器，这个比较器要求继承Comparator 接口，
 			遵从里面Compare(Object o1, Object o2)方法
 			
 		如何创建自定义比较器？
 			class 类名 implements Comparator {
 				public compare(Object o1, Object o2) {
 				
 				}
 			}
 		【发现】
 			一个自定义类遵从了Camparable 接口，实现了compareTo方法,这里又给了TreeSet提供了一个比较器，这里自定义比较器是遵从了Comparator 接口，实现了compare()方法,
 			同时存在的情况下，TreeSet默认使用的是比较规则是比较器的规则，这里推荐使用自定义比较器。
 */

class Worker implements Comparable<Worker> {
	int id;
	String name;
	int salary;
	
	public Worker(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "{编号：" + this.id + "姓名：" + this.name + "日薪：" + this.salary + "}";
	}

	@Override
	public int compareTo(Worker w) {
		//返回值有三种： 0， 负整数， 正整数
		//当前自定义类，我们通过薪水来比较，0 表示一样， 负表示小于， 正表示大于
		 
		System.out.println(this.name  + "CampareTo" + w.name);
		return this.salary - w.salary;
	}
}

//自定义比较器
class MyComparator implements Comparator<Worker> {
	
	@Override
	public int compare(Worker o1, Worker o2) {
		
		System.out.println("自定义比较器里面的Compare方法");
		return o1.salary - o2.salary;
	}
}


public class Demo8 {
	public static void main(String[] args) {
		//创建一个自定义比较器
		MyComparator comparator = new MyComparator();
		
		//将比较器作为参数放入TreeSet()中
		TreeSet<Worker> set = new TreeSet<Worker>(comparator);
		
		//树形结构的比较，叶子结点间不比较
		//新添加的和原来的根节点到叶子节点一一比较
		set.add(new Worker(1, "老王", 100));
		set.add(new Worker(2, "老刘", 10));
		set.add(new Worker(3, "老李", 101));
		set.add(new Worker(4, "老吕", 150));
		set.add(new Worker(5, "老宁", 200));
		// 到上面一步，不符合平衡二叉树，会先平衡
		
		//会与平衡后 的二叉树比较
		set.add(new Worker(6, "老欧", 250));
		
		System.out.println(set);
		
	}
}
