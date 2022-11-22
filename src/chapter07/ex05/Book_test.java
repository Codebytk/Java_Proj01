package chapter07.ex05;

class Book{
	String title; 	// c팩의 제목을 넣는 변수 
	String author; 	//책의 저자를 넣는변수
	Book () {
		title="책제목 없음";
		author="자작 미상";
	}
	Book (String title){
		this();
		this.title=title;
	}
	Book (String title, String author){
		this (title);
		this.author=author;
		
	}
	void print () {
		System.out.println("책의 제목은 : "+ title);
		System.out.println("책의 저자는 :"+author);
	}
}



public class Book_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//기본생산자 
		Book book1=new Book();
		book1.print();
		
		Book book2=new Book("콩쥐 팥쥐");
		book2.print();
		
		Book book3=new Book("홍길동전", "허균");
		book3.print();
		
	}

}
