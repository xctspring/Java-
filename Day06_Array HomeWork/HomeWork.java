/*
	1. 从键盘是那个获取10个数存入数组，将这个数组逆序（不是逆序输出）
	
	2定义一个整型数组，输入10个整数到数组，将数组中的最大值及其下标输出.
	
	
*/

import java.util.Scanner;


class HomeWork {
	public static void main(String[] args) {
		int[] arr = new int[10];
		boolean ret = getNumFromStdin(arr);
		if (ret) {
			reverse(arr);
			printArray(arr);
			
		}
		int index = getMaxIndexInArray(arr);
		
		System.out.println("Max index is at" + index + "值为:" + arr[index]);
	}
	
	
	/**
	*从键盘是那个获取10个数存入数组，
	*@param int[] array 表示要传入的数组的【首地址】
	*@return boolean类型 返回true表示函数运行正常，返回false表示函数运行失败
	*运行失败的原因：传入数组参数的值为null，或者传入参数的arr.length为0
	*/
	public static boolean getNumFromStdin(int[] array) {
		// 参数合法性判断
		if (array == null || array.length == 0){
			System.out.println("输入数据不合法！");
			return false;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10个数：");
		
		for (int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
	
		return true;
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
	
	/**
	*将数组逆序（不是逆序输出）
	*@param int[] array
	*@return boolean类型 返回true表示函数运行正常，返回false表示函数运行失败
	*运行失败的原因：传入数组参数的值为null，或者传入参数的arr.length为0
	*/
	public static boolean reverse(int[] array) {
		// 参数合法性判断
		if (array == null || array.length == 0){
			System.out.println("输入数据不合法！");
			return false;
		}
		
		//
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		
		return true;
	}
	
	/**
	*找到数组中的最大值及其下标
	*@param int[] array
	*@return int类型的下标，函数运行成功，返回最大值下标；否则，返回 -1
	*/
	public static int getMaxIndexInArray(int[] array){
		// 参数合法性判断
		if (array == null || array.length == 0){
			System.out.println("输入数据不合法！");
			return -1;
		}
		
		/*
			利用循环找出最大值所在的下标
			利用两两比较找出最大值下标
		*/
		int index = 0; // 保存最大值所在的小标
		
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i ;
			}
		}
		
		return index;
	}
	
}



























