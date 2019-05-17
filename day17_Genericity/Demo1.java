package genericity;

import java.util.ArrayList;
import java.util.Arrays;

/*
 	泛型是JDK1.5 之后添加的新特征
 	
 	[问题]：
 		a. 在没有约束的情况下，这里到处都是强转
 		b. 运行时会遇到一些无法预知的错误

 	
 */
public class Demo1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Hello");
		list.add('c');
		list.add(2);
		list.add(3);
		
		Object[] arr = list.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(list);
		
		

//  	从list 当中去除下标为1 的元素，这里我们知道这个元素是String类型的，但是使用get获取时，
//  	只能回到Object类型，增加很多没有必要的强制类型转换
		
		Object obj = list.get(1);
		String str = (String)obj;
		
		System.out.println(str.length());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
