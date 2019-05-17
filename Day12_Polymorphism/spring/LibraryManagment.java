package spring;

import java.util.Scanner;

/*
 	图书管理的小系统
 	
 	需要一个图书类：
 		图书的信息： 书名  价格  作者
 	一个管理图书类：
 		对于图书的管理：
 			保存所有图书： 图书类型的数组 保存的是图书变量
 			功能：增删改查
 */

class Book {
	private int id;
	private float price;
	private String name;
	private String author;
	//利用经静态 的成员变量来计数
	public static int count = 1;
	
	{
		//利用构造代码块来计数，每次创建新的类对象都会调用这个构造代码块
		id = count;
		count++;
	}
	
	public Book(float price, String name, String author) {
		setPrice(price);
		this.name = name;
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price < 0) {
			System.out.println("输入不合法，默认为0~~~~~~~~");
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getID() {
		return id;
	}
}


//BookSystem做成一个单例类， 系统只有一个，有且只有一个系统对象
class BookSystem {
	// 图书管理系统里面是要有一个用来保存数据的数组，这个数组的类型是Book
	Book[] books;
	
	private String name;
	
	public static BookSystem bs = null;//用bs保存创建对象的首地址
	
	// 计数器，保存数组中的有效元素个数
	private static int count = 0;
	
	//私有化构造函数
	private BookSystem(String name) {
		this.name = name;
		//创建图书馆的时候，要把书架准备好，准备放图书
		books = new Book[10]; 
	}
	
	//提供一个用类名调用 的函数，供创建对象时使用
	public static BookSystem getInstance(String name) {
		if (bs == null) {
			bs = new BookSystem(name);
		} 
		return bs;
	}
	
	//增
	/**
	 * 给图书管理系统添加一本书
	 * @param bookToAdd
	 */
	public void addBook(Book bookToAdd) {
		//参数合法性判断
		if (bookToAdd == null) {
			System.out.println("添加失败，书不能为空~~~~~~");
			return;
		}
		
		if (count == this.books.length) {//也可以写为 this.books[this.books.length - 1] != null
			//这里要考虑数组的生长问题
			grow();
		}
		
		System.out.println("length：" + this.books.length);
		
		//使用for 循环依次查找书架上空的位置
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] == null) {
				this.books[i] = bookToAdd;
				count++;// 计数
				System.out.println("添加成功~~~~");
				break; // 如果放满了怎么办？？？grow
			}
		}
		return;
		

	}
	
	//数组不够用时，让数组生长
	private void grow() {
		//数组空间不够用了
		//增长的数量是当前数组长度的大约1.5倍
			
		//1. 获取新数组的长度  二进制操作效率要高于this..books.length / 2
		int newLength = this.books.length  + (this.books.length >> 1); 
		System.out.println("newLength:" + newLength);
	
		//2. 根据新的数组长度创建新的数组
		Book[] newBooks = new Book[newLength];
			
		//3. 利用循环把数组中的每一个元素复制到新数组中
		for (int i = 0; i < this.books.length; i++) {
			newBooks[i] = this.books[i];
		}
		this.books = newBooks;
	}
	/*
	 	数组不够用的时候来使用grow 让数组生长
	 	怎么判断不够用？？？
	 	 	[方法1] 数组中最后一个元素不是null
	 	 	[方法2] 有效数组下标（增加一个计数器） > length - 1
	 */
	
	public static int getCount() {
		return count;
	}

	
	//删
	/**
	 * 通过ID删除图书管理系统的一本书
	 * @param id 要删除的图书ID
	 */
	public void delBookByID(int id) {
		//参数合法性判断
		if (id <= 0) {
			System.out.println("输入ID不合法~~~~");
			return;
		}
		
		//先查到这本书
		int index = findBookByID(id);
		//删除操作   数组左移
		if (index != -1) {	
			for (int i = index; i < books.length - 1; i++) {
				this.books[i] = this.books[i + 1];
			}
			this.books[books.length - 1] = null; //最后一个赋值为null
			System.out.println("删除成功~~~~");
			count--;
		} else {
			System.out.println("删除失败~~~~~");
		}
	}
	
	//改
	public void modifyBookInfo(int id) {
		//参数合法性判断
		if (id <= 0) {
			System.out.println("输入ID不合法~~~~");
			return;
		}
		
		//先查到这本书
		int index = findBookByID(id);
		//删除操作   数组左移
		if (index != -1) {
			while (true) {
			System.out.println("这本书的信息如下：");
			System.out.println("书名： " + this.books[index].getName());
			System.out.println("价格： " + this.books[index].getPrice());
			System.out.println("编号： " + this.books[index].getID());
			System.out.println("作者： " + this.books[index].getAuthor());
			System.out.println("请问要修改什么信息？这里ID不能修改。1.书名 2.作者 3.价格 4.退出");
			
			int flag = 1; //设置一个结束标记位，可以用来跳出死循环
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt(); //nextInt();接收一个整型字符,不会读取\n，
			/*
			 	nextInt();接收一个整型字符,不会读取\n，
			 	nextline()读入一行文本，会读入"\n"字符，直接结束，没有收到键盘录入的信息
			 	
			 	可以在他们中间加一个in.nextLine();语句来接收这个"\n"。
			 */
			sc.nextLine();//可以在他们中间加一个in.nextLine();语句来接收这个"\n"。
			
			switch (choose) {
			case 1:
				System.out.println("请输入书名:");
				String modifyName = sc.nextLine(); //接受字符串 使用nextLine()
				sc.nextLine();
				this.books[index].setName(modifyName);
				break;
			case 2:
				System.out.println("请输入作者： ");
				
				sc.nextLine();
				this.books[index].setAuthor(sc.nextLine());
				break;
			case 3:
				System.out.println("请输入价格：");
				float modifyPrice = sc.nextFloat();
				sc.nextLine();
				this.books[index].setPrice(modifyPrice);
				break;
			case 4:
				flag = 0;
				break;
				} //switch - case
			if (flag == 0){
				break; //跳出死循环
				}
			} // while true
		} // if index
	}// modifyBookInfo
	
	//查
	/**
	 * 通过给定的ID找到这本书所在的下标
	 * @param id
	 * @return	返回这本书的下标，如果返回 -1 表示没有找到
	 */
	public int findBookByID(int id) {
		//参数合法性判断
		if (id <= 0) {
			System.out.println("输入ID不合法~~~~");
			return -1;
		}
		
		int index = -1;
		for (int i = 0; i < this.books.length; i++) {
			//找到符合条件的ID 跳出循环
			if (this.books[i].getID() == id) { 
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	//展示所有图书
	public void show() {
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] != null){
				System.out.println("书名：" + books[i].getName() + 
						"价格：" + books[i].getPrice() + 
						"编号：" + books[i].getID() +
						"作者：" + books[i].getAuthor());
			}
		}
	}
}

public class Demo6 {
	public static void main(String[] args) {
		BookSystem bs = BookSystem.getInstance("逸夫图书馆");//单例类的创建对象
		
		Book b1 = new Book(15, "《老人与海》","海明威");
		Book b2 = new Book(20, "《红楼梦》","曹雪芹");
		Book b3 = new Book(30, "《笑傲江湖》","金庸");
		Book b4 = new Book(40, "《Thinking in Java》","外国人");
		Book b5 = new Book(8, "《故事会》","故事会编辑社");
		Book b6 = new Book(5, "《读者》","读者编辑社");
		Book b7 = new Book(9, "《最小说》","小四");
		Book b8 = new Book(100, "《Java核心技术》","外国人");
		Book b9 = new Book(20, "《Java从入门到放弃》","XXXXX");
		
		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		bs.addBook(b5);
		bs.addBook(b6);
		bs.addBook(b7);
		bs.addBook(b8);
		bs.addBook(b9);
		
		bs.show();
		System.out.println("————————————————————————————————————————————————————");
		
		bs.delBookByID(5);
		bs.show();
		System.out.println("————————————————————————————————————————————————————");
		
		bs.addBook(b5);
		bs.show();
		System.out.println("————————————————————————————————————————————————————");
		
//		bs.modifyBookInfo(6);
//		bs.show();
//		System.out.println("————————————————————————————————————————————————————");
		
		bs.addBook(b9);
		bs.show();
		System.out.println(BookSystem.getCount());
		System.out.println("————————————————————————————————————————————————————");
		
		bs.addBook(b7);
		bs.show();
		System.out.println(BookSystem.getCount());
		System.out.println("————————————————————————————————————————————————————");
		
	}
}
