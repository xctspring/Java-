package homework;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

/*
 	学生管理系统：
 		1.学生类:
 			属性：ID 姓名 年龄 性别  成绩
 			
 		2.班级类：
 			属性：名字
 				保存学生的数组
 			方法：
 				增加学生
 				通过ID删除学生
 				通过ID查找学生
 				通过ID修改学生信息
 				按照年龄，成绩，排序
 				展示学生
 					1.按照ID展示
 					2.按照性别展示
 			要求：使用异常处理
 */

abstract class Method {
	abstract public void study();
}

/*
 * 自定义异常
 */
class NoStudentIDException extends Exception {
	public NoStudentIDException(String message) {
		super(message);
	}
}

class Student extends Method {
	private int ID;
	private String name;
	private char sex;
	private int age;
	private float score;
	
	private static int count = 0; // ID
	
	// 通过构造代码块，自动计算创建对象的数量，来实现ID 的自增长
	{
		ID = count;
		count++;
	}
	
	public Student(String name, char sex, int age, float score) {
		setName(name);
		setAge(age);
		setName(name);
		setScore(score);
		setScore(score);
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		// 要有参数合法性判断
		if (sex != 'M' || sex != 'F') { 
			this.sex = 'M';
		} else {			
			this.sex = sex;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		// 使用到一个数据时，要先有参数合法性判断
		if (age <= 0 || age >= 150){
			this.age = 18;
		} else {
			this.age = age;
		}
	}
	
	public float getScore() {
		if (score < 0 || score > 100) {
			this.score = 0;
		} else {
		}
		return score;
	}
	
	public void setScore(float score) {
		if (score < 0 || score > 100) {
			this.score = 0.0f;
		} else {
			this.score = score;
		}
	}

	@Override
	public void study() {
		System.out.println("大家好！最近学习很辛苦！！！");
	}
}

class StudentManager {
	/*
	 	2.班级类：
 			属性：名字
 				保存学生的数组
 			方法：
 				增加学生
 				通过ID删除学生
 				通过ID查找学生
 				通过ID修改学生信息
 				按照年龄，成绩，排序
 				展示学生
 					1.按照ID展示
 					2.按照性别展示
	 */
	
	 private String className;
	 private Student[] allStu = null; //用于保存学生的数组，相当于教室
	 
	 private static int elementCount = 0; //用于统计当前班级人数，添加学生加1，删除学生减1
	 private Scanner sc = new Scanner(System.in);
	 
	 public StudentManager(String className) {
		 this.className = className;
		 allStu = new Student[10];//初始元素的个数为10 
	 }
	 
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 添加学生
	 * @param stuToAdd
	 * @throws NullPointerException 如果传入的参数为null，抛出异常
	 */
	public void addStudent(Student stuToAdd) throws NullPointerException {
		if (stuToAdd == null){
			throw new NullPointerException("学生信息不能为空！！！");
		}
		
		if (elementCount < this.allStu.length) {
			this.allStu[elementCount] = stuToAdd;
			elementCount++;
			System.out.println("添加学生成功！");
		} else {
			//数组元素个数不够用，扩容数组，grow
			grow();
		}
	}
	
	/**
	 * 通过id找到学生id在数组中的下标
	 * @param id
	 * @return 返回找到的id下标，没找到就返回 -1 
	 * @throws NoStudentIDException
	 */
	public int findStudentByID(int id) throws NoStudentIDException {
		if (id < 1) {
			throw new NoStudentIDException("学生ID不能小于1！");
		}
		
		int index = -1; //当前学生在数组中的下标
		
		for (int i = 0; i < this.allStu.length; i++) {
			if (this.allStu[i].getID() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 通过ID删除学生信息
	 * @param id
	 * @throws NoStudentIDException 没有学生抛出异常
	 */
	public void deleteStudentByID(int id) throws NoStudentIDException {
		int  index = findStudentByID(id);// 调用查找学生的findStudentByID方法，找到学生再数组中的index
		
		if (index != -1) {
			for (int i = index; i < elementCount - 1; i++) {
				this.allStu[i] = this.allStu[i + 1];
			}
			this.allStu[elementCount - 1] = null; //原来的最后一个元素设置为空
			elementCount--; //长度减一
			System.out.println("删除成功！！");
		} else {
			System.out.println("删除失败，没有这个学生！！");
		}
	}
	
	/**
	 * 通过学生ID修改学生信息
	 * @param id
	 * @throws NoStudentIDException
	 */
	public void modifyStudentInfoByID(int id) throws NoStudentIDException {
		int index = findStudentByID(id);

		if (index != -1) {

			Student stuInfo = this.allStu[index];
			
			
			while (true) {
				showOneStudentInfo(stuInfo);
				System.out.println("请选择要修改的学生信息：");
				System.out.println("1.姓名");
				System.out.println("2.性别");
				System.out.println("3.年龄");
				System.out.println("4.成绩");
				System.out.println("5.退出");
				
				boolean flag = true;
				int choose = sc.nextInt();
				sc.nextLine();
				
				switch(choose) {
					case 1:
						String nameToModify = sc.nextLine(); 
						sc.nextLine();
						stuInfo.setName(nameToModify);
						break;
					case 2:
						char sexToModify = sc.nextLine().charAt(0);//nextLine() 返回的是字符串，要用charAt()选择是第几个字符
						sc.nextLine();
						stuInfo.setSex(sexToModify);
						break;
					case 3:
						int ageToModify = sc.nextInt();
						sc.nextLine();
						stuInfo.setAge(ageToModify);
						break;
					case 4:
						float scoreToModify = sc.nextLong();
						sc.nextLine();
						stuInfo.setScore(scoreToModify);
						break;
					case 5:
						flag = false;
						break;
					default:
						System.out.println("请输入1-5的数！");
						break;
				}
				if (!flag) {
					break;
				}
			}
		} else {
			System.out.println("修改学生信息失败，没有这个学生！！");
		}
	}
	
	private void showOneStudentInfo(Student stu) throws NullPointerException {
		if (stu == null) {
			throw new NullPointerException("传入的学生信息有误！");
		}
		
		System.out.println("当前学生的信息为：");
		System.out.println("Name:" + stu.getName() +  "ID:" + stu.getID());
		System.out.println( "Age:" + stu.getAge() + "Sex：" + stu.getSex());
		System.out.println("Score:" + stu.getScore());
	}
	
	//年龄用冒泡的升序
	public void bubbleSortAgeAscending() {
		//bubblesort
		int flag = 0; //通过设立flag表示是否发生交换，如果没有发生交换说明已经排序完成
		//外层控制循环的轮次
		for(int i = 0; i < elementCount - 1; i++) {
			for(int j = i;j <= elementCount - 1; j++) {
				if (this.allStu[i].getAge() > this.allStu[j].getAge()) {
					Student temp = this.allStu[i];
					this.allStu[i] = this.allStu[j];
					this.allStu[j] = temp;
					flag = 1; //flag = 1 说明发生了交换
				}
			}
			
			if(flag == 0) {
				break;
			}
			
			flag = 0;
		}
		
		// 成绩用选择降序
	public void selectSortScoreDecding() {
		
	}
	}
	
	/**
	 * 数组增长
	 */
	private void grow() {
		int oldCapacity = this.allStu.length; 
		int newCapacity = oldCapacity + (oldCapacity >> 1); //每次增长一半
		
		Student[] newArray = new Student[newCapacity];  //设置一个增长长度的数组
		
		//拷贝数据
		for (int i = 0;i < elementCount; i++) {
			newArray[i] = this.allStu[i];
		}
		
		this.allStu = newArray; //将新数组赋值给旧数组
	}
}

public class Demo1 {

}









































































