package com.sabalenka.edu.inner.Task02;

public class Car {
	String model;
	int year;

	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public class Engine {
		String type;
		int horsepower;

		public Engine(String type, int horsepower) {
			this.type = type;
			this.horsepower = horsepower;
		}

		public void displayEngineInfo() {
			System.out.println("Тип двигателя: " + type);
			System.out.println("Мощность: " + horsepower + " л.с.");
		}
	}

	public void displayCarInfo() {
		System.out.println("Модель: " + model);
		System.out.println("Год выпуска: " + year);
	}

	public void displayFullInfo(Engine engine) {
		displayCarInfo();
		engine.displayEngineInfo();
	}
}
