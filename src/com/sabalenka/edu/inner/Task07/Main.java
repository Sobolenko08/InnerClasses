package com.sabalenka.edu.inner.Task07;

public class Main {
	public static void main(String[] args) {

		final double radius = 5.0;

		Shape circle = new Shape() {
			@Override
			public double area() {
				return Math.PI * radius * radius;
			}
		};

		System.out.println("Площадь круга с радиусом " + radius + " равна " + circle.area());
	}
}