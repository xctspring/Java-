package spring;

/*
 	
 		
 	【问题】
 		代码中，程序只会严格的执行数据类型一致化问题，不会判断你书写的代码是否符合生活逻辑。
 		那么就有可能在赋值或者运算的时候，某些参数或者方法使用的是不符合业务逻辑。
 		
 	【考虑】
 		能不能对于赋值数据，使用数据的方式进行一定程度上的保护
 		
 	面向对象的三大特征：
 		1. 封装
 		2. 继承
 		3. 多态
 	
 	【封装思想】
 		权限标识符：
 			public：公共属性，用public修饰的成员变量和方法是任何人都可以使用的
 			private:私用的，用private修饰的成员变量和方法只能在本类中可以使用，不可以在类外使用
 	
 	【问题】
 		使用private可以把一些成员变量私有化，类外不能轻易使用，但是赋值和使用遇到了问题？
 		
 	【set 和 get 方法】
 		set方法就是用来在类外 【设置】 类当中的，用private修饰的成员变量的值
 		get方法就是用来在类外 【获取】  类当中的，用private修饰的成员变量的值
 		
 	【使用set的好处】
 		1.使用set可以将数据的赋值操作更加安全和符合业务逻辑
 		2.可以将使用方法进行保密，只给外部提供一个使用的接口
 
 	【什么时候使用private 封装数据】
 		在编程中如果若遇到【实体类】，生活中实际存在的类，通常就会被这个类中的数据全部私有化private
 		
 */
//淘宝vip
class VIP {
	private int age;
	private char sex;
	String userName;
	
	//set 方法:通过set方法提供给类外一个修改sex值的方式
	/*
	 	这里通过一系列的判断，保证了代码的一致性，也让代码符合了业务逻辑
	 	这在开发中是必不可少的
	 */
	public void setSex(char s) {
		// sex = s; 如果这么写是没有任何意义的，仍然没有对数据的业务进行判断
		if (s == '男' || s == '女') {
			sex = s;
		} else {
			System.out.println("输入性别只能是男或者女");
			sex = '女';		}
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setAge(int a) {
		if (a < 0) {
			System.out.println("输入年龄有误，不能小于0！");
			age = 0;
		} else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
}

public class Demo4 {
	public static void main(String[] args) {
		VIP v4 = new VIP();
		
		v4.userName = "spring";
		//v4.age = -5;
		v4.setAge(22);
		v4.setAge(-1);
		v4.setSex('男');
		System.out.println("Sex ：" + v4.getSex());
		System.out.println("Age ：" + v4.getAge());
	}
}
 