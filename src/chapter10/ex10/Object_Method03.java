package chapter10.ex10;

import java.util.HashMap;

class D {			// equals () 메소드만 재정의 된 상태, hashcode() 재정의 되지 않는상태
					// 
	// 필드
	String name;

	// 생성자
	D(String name) {
		this.name = name;
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((D) obj).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "D [name=" + name + "]";
	}

}
class B{	//equals(), hashCode() 메소드 2개를 재정의 함
	// 필드
		String name;

		// 생성자
		B(String name) {
			this.name = name;
		}

		// equals() 재정의
		@Override
		public boolean equals(Object obj) {
			if (this.name == ((B) obj).name) {
				return true;
			} else {
				return false;
			}
		}
		@Override		//
		public int hashCode() {
			return name.hashCode();
		}

		@Override
		public String toString() {
			return "B [name=" + name + "]";
		}

		
		
}


public class Object_Method03 {

	public static void main(String[] args) {
		//HashMap : key : Value <==컬랙션
			//Key는 중복된데이터를 넣을 수 없도록 하는 자료구조
			//	equals(), hashCode();
		HashMap <Integer,String> hm1= new HashMap<>();
		hm1.put(1, "데이터1");					// 
		hm1.put(2, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);
		
		//Integer : equals() , hashCode() 메소드가 재정의 되어 있기 때문에
			// Map 자료 구조의 Key 로 사용 할 수 있다.
		
		//자신의 만든 객체를 Map에 Key 로 사용 할 수 있다.
		//	equals(),hashCode() 를 재정의 해야 Map 에 key 로 사용할수 있다.
		System.out.println("===================");
		//A 클래스는 equals () 재정의, hashcod() 재정의 안도디ㅁ<==Map 의 Key 로 사용할수 없다 
		
		HashMap<D,String> hm2 = new HashMap<>();
		hm2.put(new D("첫번쨰"), "데이터1");
		hm2.put(new D("첫번쨰"), "데이터2");
		hm2.put(new D("두번째"), "데이터3");
		
		System.out.println(hm2);
		
		System.out.println("==================");
		//b 클래스 : equals(), hashCoder() 재정의 <===Map 자료 구조의 Key로 사용 가능하다.
		HashMap<B,String>hm3=new HashMap<>();
		hm3.put(new B("첫번쨰"), "데이터1");
		hm3.put(new B("첫번쨰"), "데이터2");
		hm3.put(new B("첫번쨰"), "데이터4");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);
		
		
	}

}
