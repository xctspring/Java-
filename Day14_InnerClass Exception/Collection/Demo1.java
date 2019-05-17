package codingmonkey;

import java.util.Arrays;

/*
 数组：存储一种数据类型的内容
 	int 
 	Book 
 	Student
 	1. 只能保存一类数据
 	2. 数组的元素个数是确定的，一旦被创建，无法修改
 	3. 数组中保存的元素内存是连续的

【需求】
	我想用一个数组，保存任意类型的东西，怎么办？？？
	Java 当中有一个类是所有类的直接或者间接父类-----Object 类
	
	我们可以使用Object类型作为我们数组的类型，这样就可以保存Java任意类型的数据
 */

public class Demo1 {
	public static void main(String[] args) {
		Object[] arr = new Object[5];
		// 多态，父类的引用指向子类的对象
		arr[0] = "Object 是所有数据类型的超类"; //String
		arr[1] = 5; //int 包装思想
		arr[2] = 3.14;//float
		arr[3] = new Demo1();//自定义类对象
		
		System.out.println(Arrays.toString(arr));
	}
}
