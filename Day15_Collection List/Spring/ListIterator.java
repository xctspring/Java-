package Spring;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 	list 特有的迭代器listIterator：
 		 listIterator:
 		 	在iterator 的基础上 hasNext() next() remove() 增加：
 		 		bollean hasPrevious(): 判断是否有上一代元素
 		 		object previous(): 先将指针向前移动一位，然后获取当前元素
 		 		
 		 		add(E e): 将当前指定的E元素，放入到迭代器指针所在的位置
 		 		set(E e): 注意这个和remove()一样不能单独使用，要和next() 一起使用
 		 				   替换通过上一次【获取元素】得到的元素，获取元素要使用next()方法，
 		 				  next()向下移动经过的最后一个元素就是被替换的哪个 
 */
public class Demo3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("郭达斯坦森");
		list.add("尼古拉斯赵四");
		list.add("施瓦辛格");
		list.add("巨石强森");
		
		ListIterator it = list.listIterator(); // 返回一个具有List 特征的迭代器
		
		System.out.println("有上一个元素吗？" + it.hasPrevious());
		it.next();
		System.out.println("当前元素是谁？" + it.previous());
		
		it.add("刘亦菲");//指针在前面，迭代器的添加是在最前面添加，后面全部后移
		System.out.println(list);
		
		/*
		 	在it.add 之后使用 list.add会报错(ConcurrentModificationException)，是一个共享资源问题。
		 	【原因】
		 	list 的数据空间是一个隐含的【共享资源】，可以看图
		 	有两个指针可以操作这个数据空间
		 		a. List list 引用类型变量
		 		b. Iterator 的迭代器
		 	这两者之间共同操作一个list 数据空间，操作时要考虑对【共享资源】的影响。
		 	
		 	【处理方法】
		 	 	当Iterator 对数据进行操作的时候，不要使用list 这个引用数据类型对数据
		 	 	进行添加，删除。修改操作。
		 */
		
		//list.add("岳云鹏"); // list 的add 是在最后添加 这样会报错
		
		it.next();
		it.set("凤姐"); // set()要和next() 结合起来使用。只是替换元素没有真正进行修改
		System.out.println(list);
		
		it.remove();// 这个会把新添加的 凤姐 被删去，变回原来被替换的尼古拉斯赵四
		System.out.println(list);
	}
}
