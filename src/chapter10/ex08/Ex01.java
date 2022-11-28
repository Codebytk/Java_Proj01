package chapter10.ex08;

class Animal {
	Animal() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	Man() {
		System.out.println("모든 남자는 달립니다.");
	}
}
class Woman extends Man{
	Woman() {
		System.out.println("모든 여자는 달립니다.");
	}
}
class Lion extends Woman{
	Lion() {
		System.out.println("모든 사자는 달립니다.");
	}
}
class Tiger extends Lion{
	Tiger() {
		System.out.println("모든 호랑이는 달립니다.");
	}
}
class Cat extends Tiger{
	Cat() {
		System.out.println("모든 고양이는 달립니다.");
	}
}
class Dog extends Cat{
	Dog() {
		System.out.println("모든 개는 달립니다.");
	}
}
class DogChild extends Dog{
	DogChild() {
		System.out.println("모든 강아지는 달립니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// Animal 부모 클래스 run() 정의
		// 자식 클래스 : man , woman,  Lion, tiger, cat , dog , dogchild <===다형성
		//		-부모의 run 메소드를 재정의
		// arr 배열에 저장후 for , Enhancedfor 문으로 출력
		
		DogChild dd = new DogChild();

	}

}
