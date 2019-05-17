package spring;

// Bus类
class Bus {
	//成员变量
	String name; //名字
	String color; //颜色
	int wheel; //轮胎数
	
	public void run() {
		//正常情况，如果车胎出问题了，要修车，无法开车
		if (wheel == 6){
		System.out.println("开客车~~~~~");
		} else {
		System.out.println("修车~~~~");
		}
	}
}
	
//修理厂
class Factory {
	String name; //厂名
	String address; //地址
	String telephone; // 电话
	
	/*
	 	修理厂的功能是修车，所以必须给他一辆车才可以进行修理
	 	Bus 是一个类，我们需要给修理厂提供一个Bus 的类对象
	 	类对象是一个引用数据类型
	 	需要给 repair 方法提供一个一个Bus bus 的参数，用于给函数提供修理的车辆
	 */
	public void repair (Bus bus) throws InterruptedException {
		if (bus.wheel < 6) {
			System.out.println("修轮胎");
			Thread.sleep(1000);  //等待1s  修车
			System.out.println("修好给钱");
		}else {
			System.out.println("没坏补休");
		}
	}
}
public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		Bus bus = new Bus();
		
		bus.name = "宇通";
		bus.color = "红色";
		bus.wheel = 6;
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(5000);
			bus.run();
		}
		
		bus.wheel = 5;
		bus.run();
		
		Factory factory = new Factory();
		factory.name = "春天汽修";
		factory.address = "山水映像";
		factory.telephone = "911";
		
		factory.repair(bus);
		
		bus.run();
	}
}

