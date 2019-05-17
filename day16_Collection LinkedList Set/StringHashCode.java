package spring;


public class Demo6 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		String str3 = new String(str2);
		String str4 = new String(str1);
		
		System.out.println("这两个是同一个对象吗？" + (str1 == str2));//返回false
		
		//以下两个返回的hashCode 是一致的
		//规定，如果两个内容是一致的，返回的hashCode 是一致的
		System.out.println("str1 的hashCode:" + str1.hashCode());
		System.out.println("str2 的hashCode:" + str1.hashCode());
		
		// 以下的返回值都为false 
		System.out.println("这两个str3和str4是同一个对象吗？" + (str3 == str4));
		System.out.println("这两个str2和str3是同一个对象吗？" + (str2 == str3));
		System.out.println("这两个str1和str4是同一个对象吗？" + (str1 == str4));
	}
}
