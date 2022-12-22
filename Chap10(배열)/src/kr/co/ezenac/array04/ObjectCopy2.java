package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] libray = new Book[5];
		Book[] copyLibray = new Book[5];
		
		libray[0] = new Book("혼자 공부하는 컴퓨터 구조+운영체제", "강민철");
		libray[1] = new Book("혼자 공부하는 컴퓨터 구조+운영체제2", "강민철2");
		libray[2] = new Book("혼자 공부하는 컴퓨터 구조+운영체제3", "강민철3");
		libray[3] = new Book("혼자 공부하는 컴퓨터 구조+운영체제4", "강민철4");
		libray[4] = new Book("혼자 공부하는 컴퓨터 구조+운영체제5", "강민철5");

		
		copyLibray[0] = new Book();
		copyLibray[1] = new Book();
		copyLibray[2] = new Book();
		copyLibray[3] = new Book();
		copyLibray[4] = new Book();
		
		for(int i=0; i<libray.length; i++) {
			copyLibray[i].setTitle(libray[i].getTitle());
			copyLibray[i].setAuthor(libray[i].getTitle());
		}
		
		
		libray[0].setTitle("구글 엔지니어는 이렇게 일한다");
		libray[0].setTitle("타이터스 윈터스");
		
		System.out.println();
		
		for(Book book : libray)
			book.showInfo();
		
		System.out.println();
		
		for(Book book : copyLibray)
			book.showInfo();
		
	}
	
}










