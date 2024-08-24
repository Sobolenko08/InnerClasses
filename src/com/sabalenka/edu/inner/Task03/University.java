package com.sabalenka.edu.inner.Task03;

public class University {

	public static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public void displayStudentInfo() {
			System.out.println("ID: " + id);
			System.out.println("Имя: " + name);
		}
	}
}