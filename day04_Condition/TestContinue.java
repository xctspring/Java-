// 测试continue关键字
class TestContinue {
	public static void main(String[] args) {
		/*
			如果在while和do-while循环中，使用continue关键字，要注意循环条件变更的位置，一般是在continue，防止死循环
		*/
		
		/* 死循环
		int num = 10;
		while (num > 0) { 
			System.out.println("num:" + num);
			
			if (num % 3 == 0) {
				continue;
			}
			
			num--;
		}
		*/
		
		// 不会死循环    可以认为i++在条件之外
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}