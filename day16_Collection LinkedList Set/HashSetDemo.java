package spring;

import java.util.HashSet;
import java.util.Scanner;

/*
 	需求：接收键盘上录入的用户账号和密码，如果账号和密码保存在集合中，那么就认为是重复元素，
 	不允许添加到hashSet 里面去
 		
 */

class User {
	String username;
	String password;
	
	public User(String username, String passSword) {
		this.username = username;
		this.password = passSword;
	}
	
	@Override
	public String toString() {
		return "{用户名：" + this.username + "密码：" + this.password + "}";
	}
	
	//可以用于登陆判断
	@Override
	public boolean equals(Object obj) {
		User u = (User)obj;
		//同时比较两个字段的值
		return this.username.equals(u.username) && this.password.equals(u.password);
	}
	
	
	@Override
	public int hashCode() {
		return this.username.hashCode() + this.password.hashCode();//ha'shSet可以多个值，比较的是username和password 的编码
	}
}

public class Demo5 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		Scanner sc = new Scanner(System.in);
		
		//循环不断添加S
		while(true) {
			System.out.println("请输入用户名：");
			String usrName = sc.next();
			
			System.out.println("请输入密码：");
			String password = sc.next();
			
			User user = new User(usrName, password);
			
			if(set.add(user)) {
				System.out.println("注册成功！");
				System.out.println("当前用户：" + set);
			} else {
				System.out.println("注册失败！");
			}
		}
	}
}
















