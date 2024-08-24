package com.sabalenka.edu.inner.Task04;

public class Main {
	public static void main(String[] args) {

		int number = 5;
		long factorial = MathUtils.Factorial.calculate(number);

		System.out.println("Факториал числа " + number + " равен " + factorial);
	}
}
