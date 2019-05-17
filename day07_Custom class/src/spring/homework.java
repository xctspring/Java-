package spring;

import java.util.Scanner;


/*
  	1. 当数组中存在多个最大值的时候，获取所有最大值所在的下标
 
  	2.一个已经存在一定数据的数组，数组的个数为10，但是里面目前保存9个数据，用户输入一个数，在不影响数组的排列顺序的情况下，插入数组。
*/


public class homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[10]; //目标数组
		int[] index = new int[10]; //最大值数组
		
		getNumberFromStdin(array);
		int count = findMaxIndexFromArray(array, index);
		
		System.out.println("Max is array[index[0]]" + array[index[0]] + "at :");
		for (int i = 0; i < count; i++) {
			System.out.println(index[i]);
		}
		
		
	}
	
	/**
	 *当数组中存在多个最大值的时候，获取所有最大值所在的下标
	 *@param int[] array 目标数组  int[] index 保存小标的数组
	 *@return int   返回-1，运行失败；返回 其他值，运行成功，找到最大值的个数 
	 */
	public static int findMaxIndexFromArray(int[] array, int[] index) {
		// 参数合法性判断
		if (array == null || index == null || array.length == 0 || index.length == 0) {
			System.out.println("输入的参数不合法");
			return -1;
		}
		
		int count = 0; //最大值个数
		int max = 0; //最大值
		
		//先找出数组的最大值
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				max = array[i + 1]; //循环结束，找到最大值
			}
		}
		
		//用最大值找出数组中最大值的下标以及个数
		for (int i = 0; i < array.length; i++) {
			if (max == array[i]) {
				index[count] = i; //把最大值的下标放到index数组中
				count++; // 统计最大值的个数
			}
		}
		
		
		
		return count;
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
