package spring;

import java.util.Arrays;

/*
 	静态成员方法的使用
 	
 	Arrays  Java 中的数据工具类，集成了数组中大量常用的方法，使用类名直接调用
 	
 	自定义Arrays工具类，所用的方法直接使用类名调用，所以这些方法都是静态方法
 	
 	作业：
 		1. 完成工具类的工具扩充   ： 二分法查找   自己实现arrayToString 方法
*/
class ArrayTools {
	//自定义完成一个排序算法，使用静态方法
	
	//bubble  两两比较   若不符合条件即交换
	public static boolean bubbleSort(int[] arr) {
		//1. 参数合法性判断
		if(arr == null || arr.length == 0) {
			System.out.println("Input is invalid!!!!!!");
			return false;
		}
		boolean flag = true;// 定义一个flag, 如果发生交换则false， 若没有交换还是true， 最后判断是true  就不用交换了跳出循环，优化
			
			// 外部循环控制比较的轮次
		for (int i = 0; i < arr.length - 1; i++) {
				//内部循环控制当前轮次要进行多少次两两比较
			for (int j = 0; j < arr.length - 1 - i; j++) {
					//两两比较，符合条件，进行交换
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				} //if
			} //for j
			
			// 如果每次比较都没有交换位置，直接跳出循环，进行了优化
			if (flag) {
				break;
			}
			flag = true;	
		}// for i
			
		return true;
	}// bubbleSort
	
	//select
	public static boolean selectSort(int[] arr) {
		//参数合法性判断
		if (arr == null || arr.length == 0) {
			System.out.println("Input Param is invalid!!!");
			return false;
		}

		// 外层循环  控制遍历找寻最值的轮次
		for (int i = 0; i < arr.length - 1; i++) {
			
			int index = i;
			//利用遍历找出数组中的最值
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}// if
			}// for j
			
			//将最大值与当前指针位置的数组项对换
			if(index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}// for i
		
		return true;
	}
	
	//二分法查找
		public static int halfSearch(int[] arr, int num) {
			// 参数合法性判断
			if (arr.length == 0 || arr == null) {
				System.out.println("输入参数不合法！！！！");
				return -1;// 非法下标
			}
			
			int min = 0; //最小下标
			int max = arr.length - 1;//最大下标
			int mid = (min + max) / 2;//中间值
			
			
			while(num != arr[mid]){
				
				//在右半边查找
				if (num >= arr[mid]) {
					min = mid + 1;
				} else { //在左半边查找
					max = mid - 1;
				}
				
				// 最小下标大于最大下标时，  查找失败
				if (min > max) {
					mid = -1;
					break;
				}
		
				mid = (min + max) / 2;
			}
			
			return mid;
		}
		
		//自己写的arrayToString方法
		public static String arrayToString(int[] arr) {
			if (arr.length == 0 || arr == null) {
				System.out.println("输入不合法~~~~~");
				return null;
			}
			
			String str = "["; //字符串开头
			
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length - 1) {
					str += arr[i] + "]"; // 字符串结尾
				} else {
					str += arr[i] + ", ";
				}
			}
			
			return str;
		}
}


public class Demo4 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,2,4,6,8,10};
		
		Arrays.sort(arr); //调用系统的工具类
		System.out.println("arr:" + Arrays.toString(arr));
		
		ArrayTools.bubbleSort(arr); //调用自己写的冒泡算法
		System.out.println("arr:" + Arrays.toString(arr));
		
		ArrayTools.selectSort(arr);
		System.out.println("arr:" + Arrays.toString(arr));
	}
}
