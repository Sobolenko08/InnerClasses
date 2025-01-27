package com.sabalenka.edu.inner.Task04;

public class MathUtils {

	public static class Factorial {

		public static long calculate(int number) {
			if (number < 0) {
				throw new IllegalArgumentException("Число должно быть неотрицательным.");
			}
			long result = 1;
			for (int i = 1; i <= number; i++) {
				result *= i;
			}
			return result;
		}
	}
}
