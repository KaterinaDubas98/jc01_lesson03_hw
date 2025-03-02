package com.edu.home03.start;

public class Task05 {

	public static void main(String[] args) {
		
		double p = Math.PI;
		
		for (int i = 1; i <= 4; i++) {
			double result = Math.pow(p, i);
			System.out.println("PI в степени " + i + " = " + result);
		}
		
	}

}
