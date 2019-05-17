/*
	获取一百以内的所用整数
	获取一百以内带有7的数或者是7的倍数 
*/

class Practice {
	public static void main(String[] args) {
		int num = 100;
		//获取一百以内的所用整数
		/*
		while (num >= 0) {
			if (num % 2 == 0) {
				System.out.print(" num=" + num);
			}
		num--;
		}
		*/
		
		//获取一百以内带有7的数或者是7的倍数 
		while (num >= 0) {
			if (num % 7 == 0 || num % 10 == 7 || num / 10 ==7) {
				System.out.println("num=" + num);
			}
			num--;
		}
	}
}