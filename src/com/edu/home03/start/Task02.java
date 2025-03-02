package com.edu.home03.start;

public class Task02 {

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		double c;

		x1 = 3;
		y1 = 1;
		x2 = 9;
		y2 = 6;

		c = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Даны координаты x1,y1 = " + x1 + "," + y1 + " и x2,y2 = " + x2 + "," + y2);
		System.out.println("Расстояние между указанными точками = " + c);

	}

}
