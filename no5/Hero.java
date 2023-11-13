package no5;

//勇者クラス
public class Hero {
	String name;
	int hp; //ヒットポイント
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は，" + sec + "秒座った!");
		System.out.println("HP が" + sec + "ポイント回復した");	
	}
	
	public void slip() {
	this.hp -= 5;
		System.out.println(this.name + "は，転んだ!");
		System.out.println("5 のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は，逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終 HP は" + this.hp + "でした");
	}
	
	public void sleep() {
		this.hp += 100;
		System.out.println(this.name+"は、眠って回復した!");
	}
}