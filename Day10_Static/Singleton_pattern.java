package spring;

/*
 	做软件有很多开发模式，模式就是流程
 	
 	做开发的流程：
 		1. 需求分析
 		2. 制定开发文档
 		3. 按照开发文档的需求，分代码书写代码 25% - 35%
 		4. 完成项目，测试，调试
 		5. 上架
 		6. 后期维护
 	
 	软件开发有23种设计模式：
 			单例模式；
 				最终目的：在代码中，这个类，有且只有一个类对象
 		
 			[需求]
 				这个类程序中只有有且只有一个类对象
 			[方案]
 				程序中只调用一个构造函数d
 			[问题]
 				构造函数不能去约束用户使用，只调用一次构造函数的方式，很不安全，无法限制别人
 			[解决构造函数不安全的问题]
 				构造函数私有化，用private 修饰
 			-----------------------------------------------------------------------------------
 			[问题]
 				构造函数私有化了，安全了，但是类外无法调用了
 			[方案1]
 				给构造函数加上static 修饰，这样无需对象就可以调用了
 			[发现]
 				构造函数不能用static来修饰，构造函数在类建立之前就已经有了，属于类外的，没有对象，违背构造函数的原理
 			[方案2]
 				思考：
 					我需要的是一个只用类就可以调用的方法，不需要对象调用？	 static 修饰就ok
 					这个方法是用来创建对象的？ 这个方法是需要返回值的，返回值类型是Single 类对象类型
 					为了方便调用，用public 来修饰
 					public static Single singleGetInstance() 
			------------------------------------------------------------------------------------
			[问题]
				发现封装了这些东西，创建的对象还是不一样的？
			[方案]
				用一个静态的成员变量来保存【创建过的】【对象】的【首地址】,
				不能在类外使用，所以使用private
				也要保存一个类对象的地址，持久化数据，那么要用static 修饰
				数据类型是保存的对象的地址，所以是Single
				为了方便使用，初始化为null
			[发现]
				私有化用了  静态也用了，但是还是两个对象
			[解决]
				对保存的地址进行判断，如果是null，创建对象，返回保存的地址
				如果不是null，说明内存中已经有一个对象了，不再创建，返回保存的地址就可以了
 */	

class Single {
	int id;
	/*
	 	用一个静态的成员变量来保存【创建过的】【对象】的【首地址】,
		不能在类外使用，所以使用private
		也要保存一个类对象的地址，持久化数据，那么要用static 修饰
		数据类型是保存的对象的地址，所以是Single
		为了方便使用初始化为null
	 */
	private static Single s = null; 
	
	private Single(int id) {
		this.id = id;
	}
	
	public static Single getInstance(int id) {
		if (s == null) {			
			s = new Single(id);
		}
		return s;
	}
}

public class Demo6 {
	public static void main(String[] args) {
		Single single1 = Single.getInstance(5);
		System.out.println(single1);
		
		Single single2 = Single.getInstance(10);
		System.out.println(single2);  //发现封装了这些东西，创建的对象还是不一样的？
		
		System.out.println(single2.id);
	}
}
