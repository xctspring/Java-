/*
	NullPointerException:
	内存访问null地址空间异常
	在内存中任何对于null的操作都是系统允许的
*/

class ArrayException {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		/*
			null:  空
			null是内存当中的地址编号为0的字节，这个空间受系统保护
			系统规定：这个空间谁都不可以用
		*/
		arr = null; // arr是引用类型，指向这个地址是可以的
		
		arr[1] = 100; // 但是这个空间不可以访问或者赋值
		
		System.out.println("arr[1]=" + arr[1]);
	}
}