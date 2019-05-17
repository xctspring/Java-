package genericity;

import java.util.ArrayList;

/*
 	 泛型是JDK1.5 之后添加的新特征
 	
 	[问题]：
 		a. 在没有约束的情况下，这里到处都是强转
 		b. 运行时会遇到一些无法预知的错误
 	
 	[利用泛型解决问题]
 		1. 可以避免代码中更没有必要的强制类型转换，保存的是什么数据，出现的就是什么数据
 		2. 限制了添加的数据类型，如果使用其他的数据类型天几啊，会报错，这是将运行时错误提前到编译时错误
 	
 	[使用泛型的注意事项]
 		1. 泛型没有多态的思想，是什么就放什么
 		2. 泛型两边的数据类型要一致	
 		【标准格式】
 		ArrayList<String> list = new ArrayList<String>();
 		
 		ArrayList<Object> list = new ArrayList<String>(); //false
 		
 		【允许的，是为了照顾新老版本问题】
 		ArrayList<String> list = new ArrayList(); //语法没有问题，但是会报警告
 		ArrayList list = new ArrayList<String>(); //语法没有问题，但是会报警告

 */
public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("平安中国");
		//list.add(1);
		list.add("多思考，多练习~~~");
		list.add("语言表达必须过关");
		
		String str = list.get(1);
		System.out.println(str.length());
	}
}
