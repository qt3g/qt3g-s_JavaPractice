package no5;

class Main {
	 public static void main(String[] args) {
		 Hero h = new Hero();//	インスタンスの生成
		 h.name = "ミナト";
		 h.hp = 100;
	
		 Matango m1 = new Matango();//	インスタンスの生成
		 m1.hp = 50;
		 m1.suffix = 'A';
	
		 Matango m2 = new Matango();//	インスタンスの生成
		 m2.hp = 48;
		 m2.suffix = 'B';
	
		 //冒険の始まり
		 //h.slip();
		 //h.sit(30);
		 //m1.run();
		 //m2.run();
		 //h.sleep();
		 Hero h2;
		 h2 = h;
		 h2.hp = 200;
		 h.run();
	 }
} 
