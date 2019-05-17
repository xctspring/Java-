import java.util.Scanner;

class Order {
	public static void main(String[] args) {
		// 定义变量
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		// 显示菜单	
		System.out.println("请问客官吃什么");
		System.out.println("1.红烧肉");
		System.out.println("2.麻辣小龙虾");
		System.out.println("3.蒜蓉油麦菜");
		System.out.println("4.糖醋里脊");
		System.out.println("9.退出点餐");
		
		// 从键盘上获取用户输入的信息
		choose = sc.nextInt();
		
		switch (choose) {
			case 1:
				System.out.println("1.红烧肉");
				break;
			case 2:
				System.out.println("2.麻辣小龙虾");
				break;
			case 3:
				System.out.println("3.蒜蓉油麦菜");
				break;
			case 4:
				System.out.println("4.糖醋里脊");
				break;
			case 9:
				System.out.println("下单成功");
			default:
				System.out.println("请重新选择");
				break;
		
			}
		} while (choose != 9); // 如果用户输入的不是九，表示继续点单，如果是，退出点单
		
	}
}