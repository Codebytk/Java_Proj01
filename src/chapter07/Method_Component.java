package chapter07;

class Method{
	
	//필드는 생략
	//생성자 생략
	
	//1. 리턴타입: void + 매개변수: 없는메소드
	void print() {
		System.out.println("안녕");
	}
	//2. 리턴타입 :int + 매개변수 없는 매소드 
		//메소드를 호출시 돌려주는 값)
	int date() {
		int a;
		a =3;
		return a;
	}
	//3 리턴 타입 :
	double sum(int a,double b){
		return a+b;
	}
    //4. 리턴 타입 :
    void printMonth(int m) {
    	if (m<0||m>12) {
    		System.out.println("잘못된 입력입니다.");
    	}else {
    		
    		System.out.println(m+"월 입니다.");
    	}
    	}

}
public class Method_Component {

	public static void main(String[] args) {
		/*
	 	Method (메소드) : 실행 블락에 프로그램 기능을 저장
			-호출 작동,
			-리턴타입
				void: 리턴타입이 존재하지 않을때
				int  : 정수값을 리턴
				boolan: false, true 를 리턴
				....double, char
				String: 문자열을 리턴
				
				
		*/
		//1. 객체 생성 : class==> Object (instance)
		Method m= new Method();
		
		//2. 매소드 호출 : m.메소드 명
		m.print();
		
		int k = m.date();		//data()를 호출하는 순간 정수 3값이 리턴
		System.out.println(k);
		
		double l = m.sum(50, 60.6);
		System.out.println(l);
		
		m.printMonth(10);
		m.printMonth(20);
		
	}

}
