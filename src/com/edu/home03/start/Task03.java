package com.edu.home03.start;

public class Task03 {

	public static void main(String[] args) {
		double x1;
		double y2;
		double x2;
		double x3;
		double y3;
		double per;
		double area;

		x1 = 2;
		y2 = 1;
		x2 = 9;
		x3 = 6;
		y3 = 6;
		
		double a = x2 - x1;
		double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y3 - y2), 2));
		double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y2), 2));

		per = a + b + c;
		area = Math.sqrt((per/2) * (per/2 - a) * (per/2 - b) * (per/2 - c));
		
		System.out.println("Даны координаты x1,y2 = " + x1 + "," + y2 + " , x2,y2 = " + x2 + "," + y2 + " и x3,y3 = " + x3 + "," + y3);
		System.out.println("Периметр образованного треугольника = " + per);
		System.out.println("Площадь обазованного треугольника = " + area);
		
	}

}
