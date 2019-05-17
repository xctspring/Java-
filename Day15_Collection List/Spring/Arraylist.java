package Spring;

import java.util.ArrayList;

/*
 	-| Collection  集合接口类，规定了很多方法，要求所有的子类都要去实现
 		-------| List  如果遵从了List 接口，要实现所有的List 方法，而且数据具备的特征： 有序  可重复
			-------| ArrayList  底层维护的是一个Object 类型的数组，特征： 查询速度快，增删慢
								什么时候使用ArrayList保存数据？数据查询要求比较高，而增删使用少
								如： 高校图书管理系统
			-------| LinkedList
			-------| Vector（了解）
 		-------| Set   如果遵从了Set  接口，要实现所有的Set 方法，而且数据具备的特征： 无序 不可重复
 		
 	1. ArrayList的特有方法：
 		(1) ensureCapacity(int minCapacity); 判断当前指定的最小元素个数是否大于minCapacity，小于就扩容
 		(2) trimToSize(); 截断底层维护的Object数组元素个数为size
 	2. ArrayList查询快，增删慢的原理：
 		因为在底层维护的是一个Object 类型的数组（有序表），可以利用数组的原理，可以通过下标来直接访问元素，
 		查询快，但是增加要移动大量数据，并且扩容后，会将原数组的数据完整拷贝，这个时间很长；删除时，会有一个
 		将整个数组左移的操作，这个操作很浪费时间。
 		
 	【一个面试题】
 		ArrayList创建的时候默认的Object类型数组元素的个数时多少？ 10
 		调用ArrayList 的无参构造函数创建一个ArrayList 的对象时，请问默认的容器大小是多少？如果长度不够用时，
 		又自增多少？1.5倍 + 1
 			ArrayList底层维护的是一个Object类型的数组，使用午餐构造函数创建ArrayList对象的时候，默认的Object类型
 			数组元素个数为10；当长度不够时，自动增长1.5倍 + 1 (数组元素个数 + (元素个数 >> 1))
 		
 */
public class Demo5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	}
}
