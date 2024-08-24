package com.sabalenka.edu.inner.Task03;

public class Main {
	public static void main(String[] args) {

		University.Student student1 = new University.Student(1, "Соболенко Александр");
		University.Student student2 = new University.Student(2, "Василий Пупкин");

		student1.displayStudentInfo();
		student2.displayStudentInfo();
	}
}
