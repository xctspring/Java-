package spring;


/*
 * 	在java中自定义类的格式
 * 		自定义类：
 * 			[类修饰符] class 类名 [extends 父类名] [implement 接口名] {
 * 				事务共有的属性描述；
 * 				事务共有的行为描述；
 * 			}
 * 
 *  */

public class SuperHero {
	
		// 属性的描述   成员变量
		String name; //名字
		int age; //年龄
		char sex; //性别
		
		
		
		
		//行为的描述   成员方法
		
		/**
		 * 睡觉行为
		 *@return void 
		 */
		public void sleep() {
			System.out.println("站着睡觉");
		} //sleep
		
		/**
		 * 战斗行为
		 * @param void
		 */
		public void fight() {
			System.out.println("战斗");
		} //fight
				
}

