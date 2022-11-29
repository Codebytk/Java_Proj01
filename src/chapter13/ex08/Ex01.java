package chapter13.ex08;

import chapter09.ex01.A;

interface Animal{
	void cry();
	void fly();
}
class Animal1{
	Animal cat =new Cat(); 
	void abc() {
		cat.cry();
		cat.fly();
	
	}
	class Cat implements Animal{
		@Override
		public void cry() {
			System.out.println("냐옹");
			
		}
		@Override
		public void fly() {
			System.out.println("고양이는 날지 못합니다.");
			
		}
	}
		
	
}
class Dog{
	Animal dog = new Animal() {
		@Override
		public void cry() {
			System.out.println("멍멍");
			
		}
		@Override
		public void fly() {
			System.out.println("개는 날지 못합니다.");
			
		}
	};
	void ddog() {
		dog.cry();
		dog.fly();
	}
}
class Eagle{
	void eee(Animal eagle) {
		eagle.cry();
		eagle.fly();
	}
}

//인터 페이스를 사용해서 4가지 형태로 출력
//1. Animal을 구현한 Inner class 를 생성후 메소드 출력
//2. Animal을 익명 클래스로 생성해서 출력
//3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋받아서 출력 : 참조변수를 생성
//4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋받아서 출력 : 참조변수를 미생성

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("1번 방법");
		Animal1 cat = new Animal1();
		cat.abc();
		System.out.println("2번 방법");
		Dog d1 = new Dog();
		d1.ddog();
		System.out.println("3번 방법");
		
		Eagle ee = new Eagle();
		
		Animal a1 = new Animal() {
			@Override
			public void cry() {
				System.out.println("끼이이오");				
			}
			@Override
			public void fly() {
				System.out.println("독수리는 날수 있습니다.");			
			}
		};
		ee.eee(a1);
		System.out.println("4번 방법");
		ee.eee(new Animal() {
			@Override
			public void cry() {
				System.out.println("어흠");
			}
			@Override
			public void fly() {
				System.out.println("호랑이는 날지 못합니다");
			}
		});
	}

}
