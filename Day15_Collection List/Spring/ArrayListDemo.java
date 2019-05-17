package Spring;

import java.util.ArrayList;

class Dog {
	int id;
	String name;
	
	public Dog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//如果希望类对象的比较规则符合我们的生活逻辑，需要重写 equals() 和 hashCode()
	
	@Override
	public boolean equals(Object obj) {
		Dog temp = (Dog)obj;
		System.out.println("重写的equals方法~~~");
		return this.id == temp.id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}

public class Demo6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Dog(1,"普拉达"));
		list.add(new Dog(2,"哈奇"));
		list.add(new Dog(3,"99"));
		list.add(new Dog(4,"小萨"));
		
		boolean ret = list.contains(new Dog(1,"普拉达"));
		System.out.println(ret);// false 因为系统默认的是比较两个对象的首地址，如果地址不同，证明时两个对象
		
	}
	
	//删除ArrayList里面的重复的自定义对象
}
