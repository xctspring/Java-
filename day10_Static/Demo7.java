package spring;
/*
 	包含关系： 球队和球员
 */


class Player {
	int num;
	private String name;
	
	public Player(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class Team {
	String name;
	
	Player player1;
	Player player2;
	
	//创建球队的时候，不单单是起一个名字，还要给这个球队一些球员
	public Team(String name, Player player1, Player player2) {
		this.name = name;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void game() {
		System.out.println("勇士队勇夺2018赛季总冠军~~~~");
	}
	
	public Player getPlayer1(){
		return player1;
	}
}


public class Demo7 {
	public static void main(String[] args) {
		Team Warrior = new Team("Warrior",new Player(35,"Kevin Durant"),new Player(30, "Steven Curry") );
		
		Warrior.game();
		
		System.out.println(Warrior.getPlayer1().getName());//   包含关系
	}
}
