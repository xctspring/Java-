import java.util.Scanner;

class Order {
	public static void main(String[] args) {
		// �������
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		// ��ʾ�˵�	
		System.out.println("���ʿ͹ٳ�ʲô");
		System.out.println("1.������");
		System.out.println("2.����С��Ϻ");
		System.out.println("3.���������");
		System.out.println("4.�Ǵ��Ｙ");
		System.out.println("9.�˳����");
		
		// �Ӽ����ϻ�ȡ�û��������Ϣ
		choose = sc.nextInt();
		
		switch (choose) {
			case 1:
				System.out.println("1.������");
				break;
			case 2:
				System.out.println("2.����С��Ϻ");
				break;
			case 3:
				System.out.println("3.���������");
				break;
			case 4:
				System.out.println("4.�Ǵ��Ｙ");
				break;
			case 9:
				System.out.println("�µ��ɹ�");
			default:
				System.out.println("������ѡ��");
				break;
		
			}
		} while (choose != 9); // ����û�����Ĳ��Ǿţ���ʾ�����㵥������ǣ��˳��㵥
		
	}
}