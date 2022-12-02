package chapter16.ex07;

abstract class Fluit{
	abstract void print();	//추상메소드 , 객체의 필드 정보를 출력
}
class Apple extends Fluit{
	private String name;
	private int price;
	
	Apple(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	//getter , setter 를 통해서 인풋
	
	//print(메소드 오버라이드 해서 필드의 정보를 출력
	
	@Override
	void print() {
		System.out.println("과일이름 : "+name);
		System.out.println("과일가격 : "+price);
	}

	
	
}
class Banana extends Fluit{
	private String name;
	private int price;
	
	Banana(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	//getter , setter 를 통해서 인풋
	
	//print(메소드 오버라이드 해서 필드의 정보를 출력
	
	@Override
	void print() {
		System.out.println("과일이름 : "+name);
		System.out.println("과일가격 : "+price);
	}
}
class Pencil{
	private String name;
	private int price;
	
}

//제너릭 클래스 : Fluit을 상속하는 클래스만 저장할수 있는 제너릭 클래서
class GenericClass <T extends Fluit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {

	public static void main(String[] args) {

		GenericClass<Apple> g1 = new GenericClass<>();
		GenericClass<Banana> g2 = new GenericClass<>();
		g1.setT(new Apple("사과", 1000));
		g1.getT().print();
		System.out.println("================");
		g2.setT(new Banana("바나나",7000));
		g2.getT().print();
		
		
	}

}
