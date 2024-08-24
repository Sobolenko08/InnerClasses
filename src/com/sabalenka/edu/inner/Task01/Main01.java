package com.sabalenka.edu.inner.Task01;

public class Main01 {
	public static void main(String[] args) {

		Book book = new Book("Война и мир");

		Book.Author author = book.new Author("Лев Толстой", 82);

		book.displayBookInfo();

		author.displayAuthorInfo();
	}
}
