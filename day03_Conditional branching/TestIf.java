import java.util.Scanner;  //����   util��utility������;   ���߰�
/*
	Scanner    ɨ����   ��Ҫ����    import ���������	
*/


class TestIf {
	public static void main(String[] args){
	/*
		�ж�����
		��������� �ܱ�4�������ǲ��ܱ�100����  ����  �ܱ�400����
	*/
	
		int year = 2000;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("����һ������");
		}
		/*
		���ʹ��Scanner
		�̶��÷���
			1.���뼼�ܰ�  ��class֮ǰд��import java.util.Scanner;
			2.����һ��Scanner�ı���
			3.ʹ��new�ؼ��ֳ���Scanner   ��ֵ��sc
			4.ͨ��sc����next***�������������л�ȡ�û���������ݸ�ֵ��num����
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt(); // ��ȡ�û����ն����������Int���͵�������
		
		if (num > 10) {
			System.out.println("�����ֵ����10");
		} else if (num < 10) {
			System.out.println("�����ֵС��10");
		} else {
			System.out.println("�����ֵΪ10");
		} 
	}
}
