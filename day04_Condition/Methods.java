class Methods {
	public static void main(String[] args) {
		printStar();   // 调用时，使用函数名()调用的  函数是条狗哪里需要哪里吼

		printSumOfTwoNumbers(5,10);     // 调用一个需要外部参数的方法，需要实参
		
		int ret = sub(20, 15);
		System.out.println("ret = " + ret);
		
		printMax(5,10);
		printMax(5,5);
		printMax(11,5);
		
		
	}

	//这里定义了一个打印星星的函数
	/*
		定义函数的格式：
			修饰符 返回值类型  函数名（小驼峰命名，见名知义，动宾结构）() {
				函数体
			} 
	*/
	// 无参数  无返回值
	public static void printStar() {  // 修饰符： public static     返回值类型：void       函数名：printStar
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
	}
	
	
	// 有参数  无返回值    计算两个int类型数据的和，并且打印   
	/*
		这里要计算的数据是函数外面提供的，那么函数需要告诉外部，这里我要什么类型的数据
	*/
	public static void printSumOfTwoNumbers(int num1, int num2) { //int num1, int num2  两个形参 
		System.out.println("num1 + num2 =" + (num1 + num2));
	}
	
	//  有参数  有返回值   计算两个int类型数据的差
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	// 打印两个数据中大的那个数
	public static void printMax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("大的数为：" + num1);
		} else if (num1 < num2) {
			System.out.println("大的数为：" + num2);
		} else {
			System.out.println("一样大");
		}
	} //printMax
	
}
