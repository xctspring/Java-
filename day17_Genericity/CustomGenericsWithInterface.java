package genericity;

/*
 	接口中使用自定义泛型
 		interface 接口名<自定义泛型> {
 			成员变量; //public static final
 			成员方法; //abstract
 		}
 */
interface A<T> {
	public void add(T t); //接口中定义的方法使用了自定义的泛型
	
}
//一个类如果要【遵从】一个带有自定义泛型的接口，有两种方式

//plan A
//一个类【遵从】了带有自定义泛型的接口，但是没有指定泛型的具体数据
class Test<T> implements A<T> {

	@Override
	public void add(T t) {
		System.out.println(t.getClass() + "类型的方法");
	}
}
//plan B
//在遵从接口的时候，已经指定了泛型的具体数据，所有在接口中用到的使用泛型的方法，都是该数据
class Test2 implements A<String> {
	@Override
	public void add(String t) {
		// TODO Auto-generated method stub
		System.out.println("String类型的方法");
	}
}

public class Demo5 {

}
