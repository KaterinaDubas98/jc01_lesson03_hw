package com.edu.home03.start;

public class Task06 {

	public static void main(String[] args) {
		
		int a = 1234;
		int sec = a;
		int res = 1;

		while (a > 0) {
			res *= a % 10;
			a /= 10;
			
		}

		System.out.println("Произведение цифр четырехзначного числа " + sec + " = " + res);

	}

}


