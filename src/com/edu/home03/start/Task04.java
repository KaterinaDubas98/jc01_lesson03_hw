package com.edu.home03.start;

public class Task04 {

	public static void main(String[] args) {
		
		double r;
		double lenght;
		double area;
		
		r = 7;
		
		lenght = Math.PI * 2 * r;
		area = Math.PI * Math.pow(r, 2);
		
		System.out.println("Радиус круга = " + r + ", периметр = " + lenght + ", площадь = " + area);

	}

}
