import java.util.Scanner;


class TestSwitch {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("���ʿ͹ٳ�ʲô");
	System.out.println("1.������");
	System.out.println("2.����С��Ϻ");
	System.out.println("3.���������");
	System.out.println("4.�Ǵ��Ｙ");
	int choose = sc.nextInt();
	
	switch (choose) {
		// System.out.println("��������ʵ����");   ����  ���벻ͨ��
		case 1:
			System.out.println("1.������");break;
		case 2:
			System.out.println("2.����С��Ϻ");break;
		case 3:
			System.out.println("3.���������");break;
		case 4:
			System.out.println("4.�Ǵ��Ｙ");break;
		default:
			System.out.println("������ѡ��");break;
	
		}
	}
	
}