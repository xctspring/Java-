/*
	��������ֳ�ʼ���ķ���
		��̬��ʼ����
		int[] arr = new int[num];
		
		��̬��ʼ����
		int[] arr = {1, 2, 3, 4, 5};
*/
import java.util.Scanner;



class ArrayArguement {
	public static void main(String[] args) {
		int[] arr =new int[10];

		// ��������Ҫ�Ĳ�����һ���������͵�ʱ��ֱ��ʹ��������������
		boolean ret = getNumberFromStdin(arr);

		// ͨ�������ķ���ֵ���жϺ������������
		if (ret) {
			for (int i = 0; i < arr.length(); i++) {
				System.out.println("arr[" + i + "]= " + arr[i]);
			}

		}

	}

	/**
	 *�Ӽ����ϻ�ȡ���ݣ���ֵ��int��������
	 *@param array int[] ��������
	 *@return boolean���� ����true��ʾ������������������false��ʾ��������ʧ��
	 *����ʧ�ܵ�ԭ�򣺴������������ֵΪnull�����ߴ��������arr.lengthΪ0��
	 */
	public static boolean getNumberFromStdin (int[] array) {
		//�����Ϸ����ж� �������Ϊnull�����ߴ��������Ԫ�ظ���Ϊ0
		if (array == null || array.length == 0) {
			System.out.println("�������ݲ��Ϸ���");
			return false; // ��ʾ��������ʧ��
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("������ʮ������");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}



		sc.close();
		return true; // ��ʾ�������гɹ���
	}
}
