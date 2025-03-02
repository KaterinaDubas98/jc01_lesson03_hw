package com.edu.home03.start;

public class Task07 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double mean;
		double secMean;
		
		a = 14;
		b = -8;
		
		mean = (Math.pow(a, 3) + Math.pow(b, 3))/2;
		secMean = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое = " + mean);
		System.out.println("Среднее геометрическое = " + secMean);

	}

}
