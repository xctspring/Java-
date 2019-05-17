package spring;

/*
 比较器实现排序算法
 */
import java.util.ArrayList;
import java.util.Comparator;

class Student {
	int id;
	int score;
	int age;
	String name;

	public Student(int id, int score, int age, String name) {
		this.id = id;
		this.score = score;
		this.age = age;
	}

	public String toString() {
		return "{ID:" + this.id + "age:" + this.age + "name:" + this.name
				+ "score：" + this.score + "}";

	}
}

// 自定义排序异常
class CompareException extends Exception {
	public CompareException(String message) {
		super(message);
	}
}

// 完成排序算法 排序法则由比较器提供
// 自定义比较器，年龄升序的比较
class AgeAscendingCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}
}

class ScoreDscendingCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.score - o1.score;
	}
}

public class Demo9 {
	public static void main(String[] args) throws CompareException {
		ArrayList<Student> list = new ArrayList<Student>();

		for (int i = 0; i < 10; i++) {
			String name = "stu" + i;

			int age = (int) (Math.random() * 100 + 1);
			int score = (int) (Math.random() * 100 + 1);

			Student stuToAdd = new Student(i, score, age, name);

			list.add(stuToAdd);
		}

		bubbleSortUsingComparator(list, new AgeAscendingCompare());

		showList(list);

		System.out.println("=====================================");
		bubbleSortUsingComparator(list, new ScoreDscendingCompare());

		showList(list);
		System.out.println("=====================================");
		
		selectSortUsingComparator(list, new ScoreDscendingCompare());
		showList(list);
	}

	// 如何将比较器作为函数参数传入
	/**
	 * 利用比较器提供的排序法则作为排序算法的比较规则
	 * 
	 * @param list
	 *            排序的ArrayList
	 * @param compare
	 *            排序的规则
	 * @throws CompareException
	 */
	public static void bubbleSortUsingComparator(ArrayList<Student> list,
			Comparator<Student> com) throws CompareException {
		// 参数合法性判断
		if (list == null || list.size() == 0 || com == null) {
			throw new CompareException("排序异常");
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				// if 里面是排序的规则
				if (com.compare(list.get(j), list.get(j + 1)) > 0) {
					Student temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				} // if compare
			} // for j
		} // for i
	}
	
	//选择排序
	public static void selectSortUsingComparator(ArrayList<Student> list,
			Comparator<Student> com) throws CompareException {
		// 参数合法性判断
		if (list == null || list.size() == 0 || com == null) {
			throw new CompareException("排序异常");
		}

		for (int i = 0; i < list.size(); i++) {
			int index = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (com.compare(list.get(index), list.get(j)) > 0) {
					index = j;
				} //if
			} //for j
			if (index != i) {
				Student temp = list.get(i);
				list.set(i, list.get(index));
				list.set(index, temp);
			} //if index
		} // for i
	}

	public static void showList(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
