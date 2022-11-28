package chapter12.ex04;

interface Animal {
}

interface Animal1 extends Animal {
	void cry();
}

interface Animal2 extends Animal {
	void run();
}

interface Animal3 extends Animal {
	void eat();
}

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("냐용");
	}

	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");

	}
}

class Tiger implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("어흥");

	}

	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");

	}

}

class Dog implements Animal2, Animal3 {
	@Override
	public void eat() {
		System.out.println("개는 먹습니다.");

	}

	@Override
	public void run() {
		System.out.println("개는 달립니다.");

	}
}

class Lion implements Animal2, Animal3 {
	@Override
	public void eat() {
		System.out.println("사자는 먹습니다.");

	}

	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
	}

}

class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("끼이이오");

	}

	@Override
	public void eat() {
		System.out.println("독수리는 먹습니다.");

	}

	@Override
	public void run() {
		System.out.println("독수리는 달립니다.");

	}

}

//45
//Cat , tiger <===cry run 만 구현
//Dog , Lion <==== eat run 만 구현
//Eagle       <=== cry , run , eat 전부다 구현
// 배열에 넣어서 오버라이딩 된 메소드 저장
// instanceof 를 사용해서 내부의 Cat, Tiger 타입이 존재하면 cry(), run()
// instanceof 를 사용해서 내부의 Dog, Lion 타입이 존재하면 eat(), run()
// instanceof 를 사용해서 내부의 Eagle 타입이 존재하면 eat(),run(),cry()

public class Ex01 {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		Animal[] arr = new Animal[] { a1, a2, a3, a4, a5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Cat) {
				((Cat) arr[i]).cry();
				((Cat) arr[i]).run();
			} else if (arr[i] instanceof Tiger) {
				((Tiger) arr[i]).cry();
				((Tiger) arr[i]).run();
			} else if (arr[i] instanceof Dog) {
				((Dog) arr[i]).run();
				((Dog) arr[i]).eat();
			} else if (arr[i] instanceof Lion) {
				((Lion) arr[i]).run();
				((Lion) arr[i]).eat();
			} else if (arr[i] instanceof Eagle) {
				((Eagle) arr[i]).cry();
				((Eagle) arr[i]).run();
				((Eagle) arr[i]).eat();
			}
		}

	}

}
