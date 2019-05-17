package genericity;

import java.util.ArrayList;

/*
 	??????????
 		????
 			?????????????????????????????????????????????????????????????
 			???纾????String??????String
 		
 		????宸???
 			??????????????????? <??写???>
 			
 		?????????梅????????
 			//???蟹??????????????
 			???畏? <????????宸????位??> ????????? ??????(????宸?? ?????斜????????????? ?????斜?) {
 			
 			}
 			
 		?????胁?????????????????????????????????????:
 		byte       --> Byte
 		short      --> Short
 		int        --> Integer
 		long	   --> Long
 		
 		double     --> Double
 		float 	   --> Float
 		
 		boolean    --> Boolean
 		
 		char       --> Character
 */

class Dog {
	
}

public class Demo3 {
	
	public Demo3(){
		
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		String str = "Hello";
		getType(str); //????String ??????????String????
		getType(new Dog()); //????Dog ???????????Dog????
		
		getType(1);
		getType(3.14f);
		getType(3.14);
		getType(3L);
		getType('c');
		
		int ret = getHashCode("???");//??????????String????
		System.out.println(ret);
		
		ret = getHashCode(1);//??????????int????
		System.out.println(ret);
	}
	
	//???????????
	public static <A> A getType(A a) {
		return a;
	}
	
	public static <A> int getHashCode(A a) {
		return a.hashCode();
	}
	
}































