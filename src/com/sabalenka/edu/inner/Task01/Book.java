package com.sabalenka.edu.inner.Task01;

public class Book {
	String title;

	public Book(String title) {
		this.title = title;
	}

	public class Author {
		String name;
		int age;

		public Author(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void displayAuthorInfo() {
			System.out.println("Автор: " + name + ", возраст: " + age);
		}
	}

	public void displayBookInfo() {
		System.out.println("Название книги: " + title);
	}
}