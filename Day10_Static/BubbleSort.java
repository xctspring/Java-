package spring;

import java.util.Arrays;

public class BubbleSort {
	public static boolean bubbleSort(int[] arr){
		//参数合法性判断
		if(arr == null || arr.length == 0) {
			System.out.println("Input is invalid!!!!");
			return false;
		}
		boolean flag = true;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
			flag = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr ={2,4,5,7,8,3,1,6,9,10};
		
		BubbleSort.bubbleSort(arr);
		
		System.out.println("arr[] =" + Arrays.toString(arr));
	}
}
