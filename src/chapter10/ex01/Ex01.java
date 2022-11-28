package chapter10.ex01;

class Animal{ 			//Animal 클래스를 상속해서  Tiger, Eagle,Lion 를 생성
							//자식 클래스 에서는 필드 1, 메소드 1 정의
						//LionChild클래스는 lion 클래스를 상속해서 필드1, 메소드 1.
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal{
	void tig() {
		System.out.println("호랑이");
	}
}
class Eagle extends Animal{
	void eag() {
		System.out.println("독수리");
	}
	
}
class Lion extends Animal{
	
	void lio() {
		System.out.println("사자");
	}
}
class LionChild extends Lion {
	
	
	void liokid() {
		System.out.println("사자세끼");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Tiger ani1=new Tiger();
		ani1.name="호랑이";
		ani1.age=3;
		ani1.color="주황색";
		System.out.println(ani1.name); 
		System.out.println(ani1.age);
		System.out.println(ani1.color);
		ani1.tig();
		
		ani1.eat();
		ani1.sleep();
		
		System.out.println("=============================");
		Lion ani2=new Lion();
		ani2.lio();
		
		ani2.name="사자";
		ani2.age=3;
		ani2.color="주황색";
		System.out.println(ani1.name); 
		System.out.println(ani1.age);
		System.out.println(ani1.color);
		
		ani2.eat();
		ani2.sleep();
		System.out.println("=============================");
		
		LionChild lionkid=new LionChild();
		lionkid.name="사자세끼";
		lionkid.age=1;
		lionkid.color="주황색";
		System.out.println(lionkid.name); 
		System.out.println(lionkid.age);
		System.out.println(lionkid.color);
		
		
		
		lionkid.lio();
		
		lionkid.eat();
		lionkid.sleep();
		
		
	 

	}

}
