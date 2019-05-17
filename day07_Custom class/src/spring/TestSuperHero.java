package spring;

public class TestSuperHero {
	public  static void main(String args[]){
		/*
		 * 创建对象的方式：
		 * 		类名 对象名 = new 类名();
		 * */
		SuperHero IRONMAN = new SuperHero(); // SuperHero 引用数据类型
		
		// .表示  的  的意思
		// 这里对IRONMAN的属性进行赋值
		IRONMAN.name = "钢铁侠";
		IRONMAN.age = 40;
		IRONMAN.sex = 'M';
		
		
		//调用IRONMAN的行为
		IRONMAN.sleep();
		IRONMAN.fight();
		
		/*
		 * 展示的是对象在堆区的首地址   spring.SuperHero@2e6e1408
		 * spring 包名
		 * SuperHero 类名
		 * @表示在哪里   
		 * 2e6e1408  十六进制表示堆区中对象所在内存空间的首地址  java中0x省略
		 */
		System.out.println(IRONMAN);
		
		
		SuperHero CapitalOfAmerica = new SuperHero();
		System.out.println(CapitalOfAmerica);
		
		
		CapitalOfAmerica.name = "美国队长";
		IRONMAN = CapitalOfAmerica;
		System.out.println(IRONMAN.name);
	
	}
} 