class MySort {
	public static void main (String[] args) {
		
	}
	
	/**
	*从键盘上获取数据，赋值给int类型数组
	*@param array int[] 数组类型
	*@return boolean类型 返回true表示函数运行正常，返回false表示函数运行失败
	*运势失败的原因：传入数组参数的值为null，或者传入参数的arr.length为0；
	*/
	public static boolean getNumberFromStdin (int[] array) {
		//参数合法性判断 传入参数为null，或者传入数组的元素个数为0
		if (array == null || array.length == 0) {
			System.out.println("输入数据不合法！");
			return false; // 表示函数运行失败
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入十个数：");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		} 
		
		sc.close();
		return true; // 表示函数运行成功；
	}
	
	/**
	*展示指定的int类型的数组
	*@param int[] array
	*@return void类型
	*如果函数没有打印数组，存在两种情况：1.数的值为null，或者传入参数的arr.length为0
	*/
	public static void printArray(int[] array) {
		// 参数合法性判断
		if (array == null || array.length == 0){
			System.out.println("输入数据不合法！");
			
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i]);
		}
	}	
}
