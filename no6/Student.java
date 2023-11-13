//package no6;

public class Student {
	String name;
	String id;

	//コンストラクタの定義
	//クラス名前と同名のメソッドとして定義する
	public Student(String X,String Y) {//原則一つのコンストラクタには、名前以上の機能はつけてはいけない
		this.name = X;
		this.id = Y;
	}
	
}
