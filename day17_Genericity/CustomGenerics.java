package genericity;

import java.util.Arrays;
/*
 	实现一个自定义泛型的数组工具类
 	
 	在自定义类中使用自定义泛型
 		class 类名<自定义泛型> {
 			// 在这里所用到的和类名一致的自定义泛型的位置，都是相同的数据
 		}
 		
 	注意：
 		1. 类名中声明了自定义泛型的情况下，如果这类中使用了和类名自定义相同的泛型，不能用到
 		static 修饰的方法（静态方法）中, 因为泛型需要创建对象，对象调用静态方法会报错。【在static 修饰的方法中不能使用类名声明的自定义泛型】
 		
 		2. 当一个类使用了自定义泛型，在创建该类的对象的时候，给予了泛型的具体类型，那么在这个类当中所有使用到这个泛型的位置都会变成这个具体的
 		数据类型
 		
 		3. 如果一个要求泛型的类对象，在创建的时候没有给予具体的数据类型，所有使用到该泛型的位置都会变成Object 
 	
 	在一个用泛型修饰的类当中，static 修饰的方法能否使用泛型？？？
 		如果是static 修饰的方法，只能使用当前方法自定义的泛型
 		
 */

class ArrayTools<A> {
	// 数组转String
	public String arrayToString(A[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length - 1; i++) {
			str += (arr[i] + ",");
		}
		str = str + arr[arr.length - 1] + ']';
	
		return str;
	}
	
	// 数组逆序
	public void reverse(A[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			A temp = arr[i]; // 这里temp的数据类型是A
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {
		ArrayTools<String> tools = new ArrayTools<String>();
		
		String[] arr = {"你好", "hello", "笨猪", "萨瓦迪卡"};
		
		String str = tools.arrayToString(arr);
		System.out.println(str);
		
		tools.reverse(arr);
		System.out.println(tools.arrayToString(arr));
		
		ArrayTools<Integer> tools2 = new ArrayTools<Integer>();
		
		Integer[] arr2 = {1, 2, 4, 5, 6, 7, 3, 0};
		System.out.println(tools2.arrayToString(arr2));
		
		tools2.reverse(arr2);
		System.out.println(tools2.arrayToString(arr2));
	}
	
	
}
