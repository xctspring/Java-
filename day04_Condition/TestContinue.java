// ����continue�ؼ���
class TestContinue {
	public static void main(String[] args) {
		/*
			�����while��do-whileѭ���У�ʹ��continue�ؼ��֣�Ҫע��ѭ�����������λ�ã�һ������continue����ֹ��ѭ��
		*/
		
		/* ��ѭ��
		int num = 10;
		while (num > 0) { 
			System.out.println("num:" + num);
			
			if (num % 3 == 0) {
				continue;
			}
			
			num--;
		}
		*/
		
		// ������ѭ��    ������Ϊi++������֮��
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}