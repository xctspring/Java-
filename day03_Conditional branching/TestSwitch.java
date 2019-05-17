import java.util.Scanner;


class TestSwitch {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请问客官吃什么");
	System.out.println("1.红烧肉");
	System.out.println("2.麻辣小龙虾");
	System.out.println("3.蒜蓉油麦菜");
	System.out.println("4.糖醋里脊");
	int choose = sc.nextInt();
	
	switch (choose) {
		// System.out.println("这条语句会实现吗");   不会  编译不通过
		case 1:
			System.out.println("1.红烧肉");break;
		case 2:
			System.out.println("2.麻辣小龙虾");break;
		case 3:
			System.out.println("3.蒜蓉油麦菜");break;
		case 4:
			System.out.println("4.糖醋里脊");break;
		default:
			System.out.println("请重新选择");break;
	
		}
	}
	
}