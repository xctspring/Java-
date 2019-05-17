import java.util.Scanner;  //导包   util（utility）多用途   工具包
/*
	Scanner    扫描器   需要导包    import 导入这个包	
*/


class TestIf {
	public static void main(String[] args){
	/*
		判断闰年
		闰年的条件 能被4整除但是不能被100整除  或者  能被400整除
	*/
	
		int year = 2000;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("这是一个闰年");
		}
		/*
		如何使用Scanner
		固定用法：
			1.导入技能包  在class之前写上import java.util.Scanner;
			2.创建一个Scanner的变量
			3.使用new关键字常见Scanner   赋值给sc
			4.通过sc调用next***方法从命令行中获取用户输入的数据赋值给num变量
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt(); // 获取用户在终端上输入夫人Int类型的数据流
		
		if (num > 10) {
			System.out.println("输入的值大于10");
		} else if (num < 10) {
			System.out.println("输入的值小于10");
		} else {
			System.out.println("输入的值为10");
		} 
	}
}
