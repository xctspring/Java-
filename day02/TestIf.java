class TestIf {
	/*
		测试分支结构
	*/
	public static void main(String[] args){
		/*
			判断闰年
			闰年的条件  能被4整除不能被100整除 或者 能被400整除
		*/
		int year = 2000;
		if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
			System.out.println("这是一个闰年");
		}
		
	}
	