// �Ӽ����ϻ�ȡʮ�����֣���ֵ������
import java.util.Scanner;

class GetNumberStdin {  //stdin standard input ��׼�����豸
		public static void main(String[] args) {
			int[] arr = new int[10];
			
			//����һ��Scanner�Ķ��󣬰����������ĵ�ַ����ֵ��sc
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input Ten Numbers:");
			
			// ����forѭ���Ӽ����ϻ�ȡ����
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			// ʹ��forѭ���������������������
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "] =" + arr[i]);
			}
		}
}