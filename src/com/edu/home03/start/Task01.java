package com.edu.home03.start;

public class Task01 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double perimetr;
		double area;

		a = 5;
		b = 7;

		c = Math.sqrt(a * a + b * b);
		perimetr = a + b + c;
		area = (a * b) / 2;

		System.out.println("Периметр прямоугольного треугольника = " + perimetr);
		System.out.println("Площадь прямоугольного  треугольника = " + area);

	}

}
