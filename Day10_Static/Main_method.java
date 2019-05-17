package spring;

/*
 	main函数
 	public： 		
 		公共的，权限最高，自由度最大，可以在任何情况下使用，就是为了让
 		JVM在任何时候都可以找到main，直接执行
 	
 	static：
 		静态的，可以让JVM在调用的时候，不需要考虑对象的问题，直接使用，摆脱对象的束缚
 	 
 	void：	
 			空，没有返回值  这里main函数不需要返回值，JVM在运行main的时候不需要返回值，
 			因为这个返回值对于JVM来说没有意义
 	
 	main： 	
 			就是名字，一个约定俗成的名字，所有的开发语言中大部分都包含main函数，
 			这是程序运行的唯一入口
 				
 	():		
 			main函数运行所需的参数
 	
 	string[]
 			表示一个String类型的数据，可以存放在程序运行过程中需要的一些参数
 			
 	args
 			arguments参数，程序运行可能用到的参数
 */
public class Demo5 {
	public static void main(String[] args) {
		
	}
}
