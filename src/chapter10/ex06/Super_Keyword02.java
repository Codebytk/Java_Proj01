package chapter10.ex06;

class Aa{
	void abc() {
		System.out.println("Aa 클래스의 abc()");
	}
	void ab() {
		System.out.println("Aa클래스의 ab()");
	}
}

class Bb extends Aa{
	@Override
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		super.abc();		//this.abc
	}
	void cde() {
		super.abc();	//부모 클래스의 abc()
	}
	void def() {
		super.ab();     //부모 클래스의 ab()
	}
	
}

public class Super_Keyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bb :Aa Bb 가 내포되어있고, 타입을 Bb 타입으로 지정
		Bb bb = new Bb();
		
		bb.abc(); 		//B 클래스의 abc()
		bb.bcd();		//부모 클래스의 abc
		bb.cde();		//
		bb.def();		//
		

	}

}
