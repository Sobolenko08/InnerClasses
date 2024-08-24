package com.sabalenka.edu.inner.Task06;

public class Main {
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {
						
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						Thread.currentThread().interrupt();
						System.out.println("Поток прерван");
					}
				}
			}
		};

		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
