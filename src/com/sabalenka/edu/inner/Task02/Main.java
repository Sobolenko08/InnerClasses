package com.sabalenka.edu.inner.Task02;

public class Main {
	public static void main(String[] args) {

		Car car = new Car("Toyota Camry", 2022);

		Car.Engine engine = car.new Engine("V6", 301);

		car.displayFullInfo(engine);
	}
}
