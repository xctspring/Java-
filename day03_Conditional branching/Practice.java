/*
	��ȡһ�����ڵ���������
	��ȡһ�����ڴ���7����������7�ı��� 
*/

class Practice {
	public static void main(String[] args) {
		int num = 100;
		//��ȡһ�����ڵ���������
		/*
		while (num >= 0) {
			if (num % 2 == 0) {
				System.out.print(" num=" + num);
			}
		num--;
		}
		*/
		
		//��ȡһ�����ڴ���7����������7�ı��� 
		while (num >= 0) {
			if (num % 7 == 0 || num % 10 == 7 || num / 10 ==7) {
				System.out.println("num=" + num);
			}
			num--;
		}
	}
}