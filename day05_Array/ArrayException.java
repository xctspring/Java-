/*
	NullPointerException:
	�ڴ����null��ַ�ռ��쳣
	���ڴ����κζ���null�Ĳ�������ϵͳ�����
*/

class ArrayException {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		/*
			null:  ��
			null���ڴ浱�еĵ�ַ���Ϊ0���ֽڣ�����ռ���ϵͳ����
			ϵͳ�涨������ռ�˭����������
		*/
		arr = null; // arr���������ͣ�ָ�������ַ�ǿ��Ե�
		
		arr[1] = 100; // ��������ռ䲻���Է��ʻ��߸�ֵ
		
		System.out.println("arr[1]=" + arr[1]);
	}
}