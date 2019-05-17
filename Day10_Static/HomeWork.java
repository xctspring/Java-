package spring;



/*
 	完成工具类的扩充  二分法查找和  自己实现arrayToString方法
 	二分法查找： 在Demo4 的ArrayTools类中
 	arrayToString方法 :在Demo4 的ArrayTools类中
 */


public class HomeWork {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		System.out.println("下标为：" + ArrayTools.halfSearch(arr, 7));
		
		System.out.println("转换成字符串为：" + ArrayTools.arrayToString(arr));
	}
}
