package Spring;

import java.util.ArrayList;
import java.util.List;


/*
 	--| Collection  集合接口类，规定了很多方法，要求所有的子类都要去实现
 		-------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
			-------| ArrayList 
 		-------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 		
 	List当中的特有方法
 		List 的一个特征： 所有遵从 List 的接口的实现类，都是可以通过索引index 去操作的	
 		添加：
 			List add(int index, E element); 向指定index 添加一个元素
 			List addAll(int index, Collection<? extends E> c) 向指定index 添加一个集合
 		
 		获取：
 			object get(int index); 通过指定下标获取指定元素
 			int indexOf(Object o); 获取指定元素下标
 			int lastIndexOf(Object o); 找出指定元素最后出现的下标。怎么实现？从后往前找
 			List subList(int fromIndex, int toIndex); 获取下标从fromIndex 开始的位置到toIndex 的位置，要头不要尾，这样的一个子集合
 		
 		修改：
 			set(int index, E element); 替换指定元素
 		
 		迭代：
 			listIterator();
 */
public class Demo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("郭达斯坦森");
		list.add("尼古拉斯赵四");
		list.add("施瓦辛格");
		list.add("巨石强森");
		
		System.out.println(list);
		
		//在下标为1 的位置上添加一个元素
		list.add(1, "史泰龙");
		System.out.println(list);
		
		List list2 = new ArrayList();
		
		list2.add("吴京");
		list2.add("谢楠");
		list2.add("张俊豪");
		list2.add("彭于晏");
		
		
		list.addAll(2,list2); // 在下标为2 的位置添加一个集合
		
		System.out.println(list);
		
		Object o = list.get(0);// 获取指定下标的元素
		System.out.println(o);
		
		int index = list.indexOf("吴京");
		System.out.println(index);// 找出指定元素所在的下标
		
		list.add("张俊豪");
		list.add("吴彦祖");
		list.add("孔维森");
		list.add("张杰");
		
		System.out.println(list);
		
		index = list.lastIndexOf("张俊豪");// 找出指定元素最后出现的下标
		System.out.println(index);
		
		List subList = list.subList(1, 5); //从fromIndex 位置开始到 toIndex 结束，要头不要尾
		System.out.println(subList); //  只会输出四个，下标为5的不会输出
		
		list.set(5, "甄子丹");
		System.out.println(list);
	}
}
