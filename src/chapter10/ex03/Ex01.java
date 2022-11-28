package chapter10.ex03;

class Fruit{		//Fruit 의 메소드를 오버라이딩 해서 출력. Apple, Banana,  Orange
	void eat() {
		System.out.println("모든과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit{
	@Override
	void eat() {
		System.out.println("사과는 맛있습니다.");
	}
}
class Banana extends Fruit{
	@Override
	void eat() {
		System.out.println("바나나는 맛있습니다.");
	}
}
class Orange extends Fruit{
	@Override
	void eat() {
		System.out.println("오랜지는 맛있습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Fruit fru1 = new Apple();
		Fruit fru2 = new Banana();
		Fruit fru3 = new Orange();
		fru1.eat();
		fru2.eat();
		fru3.eat();
		System.out.println("============================");
		
		Fruit[] arr1= new Fruit[3];
		arr1[0]=fru1;
		arr1[1]=fru2;
		arr1[2]=fru3;
		
		Fruit a1=arr1[0];
		Fruit a2=arr1[1];
		Fruit a3=arr1[2];
		a1.eat();
		a2.eat();
		a3.eat();
		
		
		
		
	}

}
