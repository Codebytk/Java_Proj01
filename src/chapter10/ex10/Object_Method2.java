package chapter10.ex10;

class Aa{		//equals() 가 정의 되어 있지 않는 클래스
				// Object 클래스의 equals() 메소드는 Stack 의 참조 주소를 비교
	//필드
	String name;
	//생성자:
	Aa(String name){
		this.name=name;
	}
}
class Bb{		// object 의 equals() 를 재정의 해서 Heap 의 값을 비교하도록 설정
	String name;
	
	Bb(String name){
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {	//object 타입으로 업케스팅 되어서 들어옴
		if( this.name == ((Bb)obj).name ) {
			return true;
		}else {
			return false;
		}
	}
}

public class Object_Method2 {

	public static void main(String[] args) {
		// objext 클래스의 equals 메소드:  기본적으로 == 참조 주소를 비교함
				//객체의 Heap 의 값을  비비교하는 것이 아니라 Stack 메모리의 잠조주 갖ㅅ을 비쇼
		//String 클래스는 equals() 메소드가 재정의 되어있어서 Heap값을 비교하도록 설정되어있다.
		Aa s1 = new Aa("안녕");
		Aa s2 = new Aa("안녕");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("=========================");
		Aa a1= new Aa("안녕");
		Aa a2 = new Aa("안녕");
		System.out.println(a1==a2);			//stack 참조주소 비교, false
		System.out.println(a1.equals(a2));	//stack 참조주소 비교, false
		
		System.out.println("=========================");
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		System.out.println(b1==b2);//stack 참조주소 비교, false
			//equals 를 재정의 해서 Heap 값을 비쇼하도록 설정
		System.out.println(b1.equals(b2));	//true
		
		
		
	}

}
