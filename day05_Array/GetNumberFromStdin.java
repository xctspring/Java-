// 从键盘上获取十个数字，赋值给数组
import java.util.Scanner;

class GetNumberStdin {  //stdin standard input 标准输入设备
		public static void main(String[] args) {
			int[] arr = new int[10];
			
			//创建一个Scanner的对象，把这个【对象的地址】赋值给sc
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input Ten Numbers:");
			
			// 借助for循环从键盘上获取数据
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 使用for循环，遍历整个数组的数据
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "] =" + arr[i]);
			}
		}
}