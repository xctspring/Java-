// ��������Ķ����븳ֵ
class ArrayTest {
	public static void main(String[] args) {
		/*
			��������[ ] ������ = new ��������[Ԫ�ظ���];
		*/
		int[] array = new int[10]; // ռ48���ֽ�  array����������������ռ8B�������������Ͷ���8B��   ����ռ4*10B
		
		// ʹ�������е�Ԫ������������[index]
		
		// ���������±�Ϊ1��Ԫ�ظ�ֵΪ10
		array[1] = 10;
		
		// �����鵱�У��±����Ч��Χ�Ǵ�0��ʼ��Ԫ�ظ��� - 1
		System.out.println(array[1]);
		
		// ������ʹ��������±꣬�������е�ÿһ��Ԫ�ؽ��и�ֵ��ʹ��forѭ��
		// array.length�������һ�����ԣ��ǻ�ȡ������Ԫ�صĸ���
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+ i +"] =" + i);
		}
	}
}

