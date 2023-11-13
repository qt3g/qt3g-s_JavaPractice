package no4;

public class Figure {
	//三角形の面積
	public static double getTriangleArea(double height, double base) {
		return base * height/2;
	}
	//四角形の面積
	public static double getRectangleArea(double height, double base) {
		return base * height;
	}
	//円形の面積
	public static double getCircleArea(double radius) {
		return radius*radius*Math.PI;
	}
}
