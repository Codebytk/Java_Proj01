package chapter16.ex01;

//각각의 상품들을 지정하는 클래스가 별도록 존재함.

//1.  Apple 클래스와 Apple 클래스를 담을수 있는 클래스

class Apple{}	//클래스 선언
class Goods1{	//상품클래스, Apple 상품을 담는 클래스
	//접근 제어자가 private 이기 때문에 외부에서 apple 참조변수에 값을 넣거나 가져오기 위해서 
	// getter, setter를 통해서만 apple 참조변수에 값을 수정하루 있다.
	// getter : apple 참조변수 값을 가져올때 사용
	// setter : apple 참조변수의 다른값을 할당할떄 사용
	
	private Apple apple = new Apple();

	
	//getter : 필드의 값을 리턴으로 돌려줌
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple=apple;
	}
	
}

//2. pencil 클래스와 pencil 클래스 를 담을 수 있는 클래스
class Pencil{}
class Goods2{
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}


public class ProbleamsBeforeGeneric {

	public static void main(String[] args) {
		//1. goods1 을 통해서 Apple 객체를 추가하고 가져오기
		Goods1 goods1 = new Goods1();
		goods1.getApple();
		goods1.setApple(new Apple());
		
		Apple apple = goods1.getApple();
		
		//2. Goods 2 를 사용해서 Pencil 객체를 추가하고 가져오기
		
		Goods2 goods2 = new Goods2();
		Pencil pencil = goods2.getPencil();	// getter 를 사용해서 pencil 객체를 가져옴
		goods2.setPencil (new Pencil());
		
		
		

	}

}
