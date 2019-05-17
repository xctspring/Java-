package homework;

import java.util.Scanner;


/*
	ͼ������Сϵͳ
	
	��Ҫһ��ͼ���ࣺ
		ͼ�����Ϣ�� ����  �۸�  ����
	һ������ͼ���ࣺ
		����ͼ��Ĺ���
			��������ͼ�飺 ͼ�����͵����� �������ͼ�����
			���ܣ���ɾ�Ĳ�
*/

/*
 	ͼ����   ͼ�����Ϣ�� ����  �۸�  ����
 */
class Book {
	private int id;//ͼ����
	private float price; //�۸�
	private String name; // ����
	private String author;//����
	
	public static int count = 1;
	
	{
		id = count;
		count++;
	}
	
	public Book(int price, String name, String author) {
		setPrice(price);
		this.name = name;
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		//�����Ϸ����ж�
		if (price < 0) {
			System.out.println("����ļ۸���С��0��ϵͳĬ��Ϊ0");
			this.price = 0;
			return;
		}
		this.price = price;
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
	
	public int getId() {
		return id;
	}
}

/*
 	ͼ��ϵͳ��  �õ�����ʵ��
 		��������ͼ�飺 ͼ�����͵����� �������ͼ�����
			���ܣ���ɾ�Ĳ�
 */
class BookSystem {
	Book[] books;
	private String name;
	
	public static BookSystem bs= null;
	
	private BookSystem(String name) {
		this.name = name;
		books = new Book[20];
	}
	
	public static BookSystem getInstance(String name){
		if (bs == null) {
			bs = new BookSystem(name);
		}
		return bs;
	}
	
	//��
	/**
	 * ��ͼ�����ϵͳ�����һ��ͼ��
	 * @param bookToAdd
	 */
	public void addBook(Book bookToAdd) {
		//�����Ϸ����ж�
		if (bookToAdd == null) {
			System.out.println("�������Ϸ�����������");
			return;
		}
		
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] == null) {
				this.books[i] = bookToAdd;
				break;
			}
		}
		return;
	}
	
	//ɾ
	/**
	 * ɾ�����Ϊid��ͼ��
	 * @param id
	 */
	public void deleteBookByID(int id) {
		//�����Ϸ����ж�
		if (id <= 0) {
			System.out.println("�������Ϸ�~~~~");
			return;
		}
		
		// �ҵ�Ҫɾ������
		int index = findBookByID(id);
		
		if (index != -1) {
		for (int i = index; i < this.books.length - 1; i++) {
				books[i] = books[i + 1];
			}
			books[this.books.length - 1] = null;
			System.out.println("ɾ���ɹ�");
		} else
		{
			System.out.println("ɾ��ʧ��");
		}
	}
	
	//��
		public void modifyBookByID(int id) {
			//�����Ϸ����ж�
			if (id <= 0) {
				System.out.println("�������Ϸ�~~~~");
				return;
			}
			
			int index = findBookByID(id);
			if (index != -1) {
			while (true){
			System.out.println("Ҫ�޸ĵ�ͼ����Ϣ���£�");
			System.out.println("���Ϊ��" + this.books[index].getId());
			System.out.println("�۸�Ϊ��" + this.books[index].getPrice());
			System.out.println("����Ϊ��" + this.books[index].getName());
			System.out.println("����Ϊ��" + this.books[index].getAuthor());
			System.out.println("-------------------------------------------");
			System.out.println("�����޷��޸ı�ţ����������ѡ��1.�޸ļ۸� 2. �޸����� 3.�޸����� 4.�˳�");
			
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			sc.nextLine();
			
			int flag = 1;
			switch (choose) {
			case 1:
				System.out.println("������۸�");
				float modifyPrice = sc.nextFloat();
				this.books[index].setPrice(modifyPrice);
				break;
			case 2:
				System.out.println("������������");
				String modifyName = sc.nextLine();
				this.books[index].setName(modifyName);
				break;
			case 3:
				System.out.println("���������ߣ�");
				String modifyAuthor = sc.nextLine();
				this.books[index].setAuthor(modifyAuthor);
				break;
			case 4:
				flag = 0;
				break;
				} //switch - case
			
			if (flag == 0) {
				break;
					} //if flag
				}// while
			} //if index
			System.out.println("�޸ĳɹ�������");
		}
		
	//��
	/**
	 *  ���ҷ���id����
	 * @param id
	 * @return  ������ı��id�����û�з���-1.
	 */
		
	public int findBookByID(int id) {
		//�����Ϸ����ж�
		if (id <= 0) {
			System.out.println("�������Ϸ�~~~~");
			return -1;
		}
		
		int index = -1;
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i].getId() == id) {
				index = i;
				break;
			} 
		}// for i
		return index;
	}// findBookByID	
	
	public void show() {
		for (int i = 0; i < this.books.length; i++) {
			if (books[i] != null) {
				System.out.println("��ţ�" + this.books[i].getId() + 
						"   �۸�" + this.books[i].getPrice() + 
						"   ������" + this.books[i].getName() +
						"   ���ߣ�" + this.books[i].getAuthor());
				
			}
		}
		System.out.println("---------------------------------------------------");
	}
}

public class LibraryManagement {
	public static void main(String[] args) {
		BookSystem bs = BookSystem.getInstance("xct��ͼ���");
		
		Book b1 = new Book(15, "�������뺣��","������");
		Book b2 = new Book(20, "����¥�Ρ�","��ѩ��");
		Book b3 = new Book(30, "��Ц��������","��ӹ");
		Book b4 = new Book(40, "��Thinking in Java��","�����");
		Book b5 = new Book(8, "�����»ᡷ","���»�༭��");
		Book b6 = new Book(5, "�����ߡ�","���߱༭��");
		Book b7 = new Book(9, "����С˵��","С��");
		Book b8 = new Book(100, "��Java���ļ�����","�����");
		Book b9 = new Book(20, "��Java�����ŵ�������","XXXXX");
		
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
		
		System.out.println( bs.findBookByID(5)); 
		
		bs.deleteBookByID(7);
		
		bs.show();
		
		bs.modifyBookByID(8);
	}
}









































