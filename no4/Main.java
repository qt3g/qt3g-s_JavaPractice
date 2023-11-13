package no4;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//三角形の面積を格納する変数
		double triangleArea;
		
		triangleArea = Figure.getTriangleArea(20,10);
		System.out.println("三角形の面積："+ triangleArea);
		
		triangleArea = Figure.getRectangleArea(5,10);
		System.out.println("四角形の面積："+ triangleArea);
		
		triangleArea = Figure.getCircleArea(10);
		System.out.println("円形の面積："+ triangleArea);

	}

}