package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	ArrayList<Book> booklist;
	
	public Student(int studentId, String studentName) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		
		booklist = new ArrayList<>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book();
		
		book.setTitle(title);
		book.setAuthor(author);
		
		booklist.add(book);
	}
	
	public void showInfo() {
		System.out.print(this.studentName + "학생이 읽은 책은 : ");
		
		for(Book book : booklist) {
			System.out.print(book.getTitle() + "입니다." );
		}
	}
	
	
}
