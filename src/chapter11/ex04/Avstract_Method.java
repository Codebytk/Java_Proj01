package chapter11.ex04;
abstract class Animal{		//추상 메소드가 1개라도 있으면 추상클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}

class Cat extends Animal{		//콘크리트 클래스 : 추상메소드를 모두 구현한 메소드
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
	}
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");	
	}
	@Override
	void run() {
		System.out.println("고양이가 달린다.");
	}
	
	
}
abstract class Dog extends Animal{ // 추상 클래스의 추상 메소드를 일부만 구현한 경우:
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}
	@Override
	void eat() {
		System.out.println("개는 뼈다구를 먹는다.");
	}
}
class DogChild extends Dog{	//콘크리트 클래스, 
	@Override
	void run() {
		System.out.println("강아지는 껑충");
		
	}
}


public class Avstract_Method {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못한다. 타입으로 지정은 가능하다.
		// Animal, Dog 는 추상클래스이므로 객체생성이 안된다.
		
		// 1. Animal 객체 생성
		
	//	Animal a1 =new Animal();	//오류발생 : 추상클래스는 객체화 하지 못한다.
		//cat () 을 객체화 해서 Animal 타입으로 정의,
		//Animal 의 메소드 호출시 오버라이딩 된 Cat 의 메소드 호출 
		Animal a2 = new Cat();
		a2.cry();
		a2.eat();
		a2.run();
		
		System.out.println("=======================");
		//Cat 객체화 해서 Cat 타입으로 지정
		Cat c2 = new Cat();
		c2.cry();
		c2.run();
		c2.eat();

		System.out.println("=======================");
		//Dog 는 추상클래스 이므로 객체화 할수 없다.
	//	Dog d1 = new Dog();	//오류발생
		
		//DogChild 로 객체화 Animal 타입으로 저장
		Animal a3 = new DogChild();
		a3.cry();
		a3.eat();
		a3.run();
		
		System.out.println("=======================");
		//DogChild 를 객체화 해서 Dog 타입으로 저장
		Dog d3 = new DogChild();
		d3.cry();
		d3.eat();
		d3.run();
		
		System.out.println("=======================");
		//DogChild를 객체화 해서 DogChild 타입으로 지정
		DogChild dh1 = new DogChild();
		dh1.cry();
		dh1.eat();
		dh1.run();
		
	}

}
