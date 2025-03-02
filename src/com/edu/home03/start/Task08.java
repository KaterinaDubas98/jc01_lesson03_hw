package com.edu.home03.start;

public class Task08 {

	public static void main(String[] args) {
		
		double edge = 5;
		double cubeFace;
		double cubeSurface;
		double cubeVolume;
		
		cubeFace = Math.pow(edge, 2);
		cubeSurface = cubeFace * 6;
		cubeVolume = Math.pow(edge, 3);
		
		System.out.println("Площадь грани = " + cubeFace);
		System.out.println("Площадь всех граней = " + cubeSurface);
		System.out.println("Обьём = " + cubeVolume);

	}

}
