class Methods {
	public static void main(String[] args) {
		printStar();   // ����ʱ��ʹ�ú�����()���õ�  ����������������Ҫ�����

		printSumOfTwoNumbers(5,10);     // ����һ����Ҫ�ⲿ�����ķ�������Ҫʵ��
		
		int ret = sub(20, 15);
		System.out.println("ret = " + ret);
		
		printMax(5,10);
		printMax(5,5);
		printMax(11,5);
		
		
	}

	//���ﶨ����һ����ӡ���ǵĺ���
	/*
		���庯���ĸ�ʽ��
			���η� ����ֵ����  ��������С�շ�����������֪�壬�����ṹ��() {
				������
			} 
	*/
	// �޲���  �޷���ֵ
	public static void printStar() {  // ���η��� public static     ����ֵ���ͣ�void       ��������printStar
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
	}
	
	
	// �в���  �޷���ֵ    ��������int�������ݵĺͣ����Ҵ�ӡ   
	/*
		����Ҫ����������Ǻ��������ṩ�ģ���ô������Ҫ�����ⲿ��������Ҫʲô���͵�����
	*/
	public static void printSumOfTwoNumbers(int num1, int num2) { //int num1, int num2  �����β� 
		System.out.println("num1 + num2 =" + (num1 + num2));
	}
	
	//  �в���  �з���ֵ   ��������int�������ݵĲ�
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	// ��ӡ���������д���Ǹ���
	public static void printMax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("�����Ϊ��" + num1);
		} else if (num1 < num2) {
			System.out.println("�����Ϊ��" + num2);
		} else {
			System.out.println("һ����");
		}
	} //printMax
	
}
