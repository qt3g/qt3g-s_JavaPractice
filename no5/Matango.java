package no5;

//お化けキノコクラス
public class Matango {
	int hp;
	final int LEVEL = 10; //お化けキノコのレベル
	char suffix;
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
	}
}