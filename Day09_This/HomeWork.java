package spring;

//电脑类
class PC {
	//成员变量	
	String screen;//屏幕
	String keyboard;//键盘
	
	//无参构造函数
	public PC() {
		screen = null;
		keyboard = null;
	}
	
	//有参构造函数
	public PC(String s, String k) {
		screen = s;
		keyboard = k;
	}
	
	//成员方法
	public void working() {
		if (screen != null) {
			System.out.println("一起来打LOL!");
		} else {
			System.out.println("去修屏幕");
		}
	}
}

//电视机类
class TV {
	//成员变量
	String screen; //屏幕
	String controller; 	//遥控器
	
	//无参构造函数
	public TV(){}
	
	//有参构造函数
	public TV(String s, String c) {
		screen = s;
		controller = c;
	}
	
	//成员方法
	public void watching() {
		if (controller != null) {
			System.out.println("看电影把~~~~");
		} else {
			System.out.println("去修电视把~~~~");
		}
	}
}

class Factory {
	String name;//工厂名	
	String address;//工厂地址
	String telephone;//电话
	
	//有参构造函数
	public Factory(String n, String a, String t) {
		name = n;
		address = a;
		telephone = t;
	}
	
	public void repairTV(TV tv) {
		if (tv.controller == null) {
			System.out.println("遥控器坏了，修理~~~~");
			tv.controller = "小米遥控器";
		} else {
			System.out.println("没有坏~~~~~");
		}
	}
	
	public void repairPC(PC pc) {
		if (pc.screen == null) {
			System.out.println("电脑屏幕坏了，修理~~~");
			pc.screen = "samsung";
		} else {
			System.out.println("没有坏~~~");
		}
	}
}

public class HomeWork {
	public static void main(String[] args) throws InterruptedException {
		PC thinkpad = new PC("IPS屏幕", "cherry");
		TV mi = new TV("SHARP", "APPLE");
		Factory  factory= new Factory("春天维修", "山水映像", "911");
		
		
		for (int i = 0; i < 10; i++) {
			thinkpad.working();
			Thread.sleep(1000);
		}
		
		
		thinkpad.keyboard = null;
		thinkpad.screen = null;
		
		factory.repairPC(thinkpad);
		
		thinkpad.working();
		
		for (int i = 0; i < 10; i++) {
			mi.watching();
			Thread.sleep(1000);
		}
		
		
		mi.screen = null;
		mi.controller = null;
		
		factory.repairTV(mi);
		
		mi.watching();
		
	}
}
