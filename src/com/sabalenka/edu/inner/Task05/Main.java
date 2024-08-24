package com.sabalenka.edu.inner.Task05;

public class Main {
	public static void main(String[] args) {

		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Привет, Java!");
			}
		};

		greeting.sayHello();
	}
}
