package spring;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 	铅笔：  一头是笔，一头时橡皮
 	笔是主要功能，橡皮是附加的工具
 	
 	橡皮做成接口，给铅笔提供一个擦出的方法

 */

interface Eraser {
	
	public void erasing();
}

class Pencil implements Eraser {
	
	@Override
	public void erasing() {
		System.out.println("擦擦擦~~~~~~~");
	}
	
	public void writing() {
		System.out.println("写写写~~~~~~~");
	}
}


public class HomeWork3 {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		
		pencil.erasing();
		pencil.writing();
	}
}
