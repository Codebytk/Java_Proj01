package chapter07.ex05;
class Aa{	//this() 를 사용하지 않고 생성자 작성
	//필드
	int m1,m2,m3,m4;
	
	//생성자
	Aa(){	// 기본생성자 : 필드의 기본값 초기화
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a){	//매개변수로 정수 1개를 인풋받아서 m1에 값을 할당
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;	
	}
	Aa(int a,int b){	//매개변수로 정수 1개를 인풋받아서 m1에 값을 할당
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;	
	}
	Aa(int a,int b, int c){	//매개변수로 정수 1개를 인풋받아서 m1에 값을 할당
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = 4;	
	}
	Aa(int a,int b, int c,int d){	//매개변수로 정수 1개를 인풋받아서 m1에 값을 할당
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = d;	
	}
	//메소드 : 필드의 값을 출력하는 메소드
	void print() {
		System.out.println(m1+" "+m2+" "+ m3+" "+m4);
	}
	
}
	
class Bb{	//this() 를 사용하면서 생성자 작성
	//필드 선언
	int m1,m2,m3,m4;
	
	Bb() {	//기본 생성자일쨰 변수와 초기값이 할당
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	}
	Bb(int a){
		this();
		m1=a;
	}
	Bb(int a,int b){
		this(a);
		m2=b;
	}
	Bb(int a, int b, int c){
		this (a,b);
		m3=c;
	}
	Bb(int a, int b, int c,int d){
		this(a,b,c);
		m4=d;
	}
	void print() {
		System.out.println(m1+" "+m2+" "+ m3+" "+m4);
	}
	

}

public class This_Method02 {

		public static void main(String[]args) {
			
			// this(): 생성자 내부에서 사용되고 첫 라인에 위치해야 하고, 자신의 객체의 다른 생성자 호출
					//생성자를 여러개 생성할때 코드를 줄일수 있다.
 			System.out.println("Aa 클래스 기본생성자 호출");
			Aa a1=new Aa();
			a1.print();
			
				//매개변수 한개인 생성자 출력
			System.out.println("Aa클래스의 매새변수 정수 1개인 생성자 호출");
			Aa a2= new Aa(10);
			a2.print();
			
			System.out.println("Aa클래스의 매새변수 정수 1개인 생성자 호출");
			Aa a3= new Aa(10,20);
			a3.print();
			System.out.println("===Aa클래스의 배개변수 정수 4개인 생성자 호출");
			Aa a4= new Aa(10,20,30);
			a4.print();
			
			
				//매개변수가 한가지인 
			System.out.println("===Bb클래스에서 기본 생성자 호출");
			Bb b1= new Bb();
			b1.print();
			System.out.println("Ba 클래스에서 매개변수 기본");
			
			Bb b2= new Bb(10);
			b2.print();
			System.out.println("Ba 클래스에서 기본생성자호출");
			
			Bb b3= new  Bb(10,20);
			b3.print();
			
			System.out.println("Ba 클래스에서 기본생성자호출");
			Bb b4= new Bb(10,20,30);
			b4.print();
		}
}
