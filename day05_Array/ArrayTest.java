// 测试数组的定义与赋值
class ArrayTest {
	public static void main(String[] args) {
		/*
			数据类型[ ] 数组名 = new 数据类型[元素个数];
		*/
		int[] array = new int[10]; // 占48个字节  array数组名是引用类型占8B（引用数据类型都是8B）   数据占4*10B
		
		// 使用数组中的元素是用数组名[index]
		
		// 对数组中下标为1的元素赋值为10
		array[1] = 10;
		
		// 在数组当中，下标的有效范围是从0开始到元素个数 - 1
		System.out.println(array[1]);
		
		// 操作：使用数组的下标，对数组中的每一个元素进行赋值，使用for循环
		// array.length是数组的一个属性，是获取数组中元素的个数
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+ i +"] =" + i);
		}
	}
}

