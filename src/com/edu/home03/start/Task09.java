package com.edu.home03.start;

public class Task09 {

	public static void main(String[] args) {
		
		double a = 5;
		double area;
		double h;
		double r1;
		double r2;
		
		area = (Math.pow(a, 2) * Math.sqrt(3))/4;
		h = (Math.sqrt(3) * a)/2;
		r1 = area / ((a * 3)/2);
		r2 = r1/2;
		
		System.out.println("Площадь треугольника = " + area);
		System.out.println("Высота треугольника = " + h);
		System.out.println("Радиус вписанной окружности = " + r1);
		System.out.println("Радиус описанной окружности = " + r2);

	}

}
