package chapter07.ex05;

class A{
	//필드  //Heap 영역에 저장
	int m;
	int n;
	
	
	//메소드 : 정수값 2개를 받음
	void init(int m, int b) {		// 메소드 내의: a,b,c <=== 지역변수:stack 저장
		int c;
		c=3;
		this.m=m;	//this.m : 인풋 매개변수, 실행블락에 매개변수 받는변수, 필드의 변수
		n=b;	    //  this. :기본적으로 생략
	}
	
	//메소드
	void work() {
		this.init(2,3);			//this 자신의 객체의 필드나 메소드 호출
		System.out.println(m+" " +n);
	}
	void init2(int m, int n) {
		this.m=m;
		this.n=n;
	}
}


public class This_keyword {

	public static void main(String[] args) {
		// this : 자기자신 객체의 필드나 메소드 <===필드 , 메소드에 적용
		// this () : 자신 객체의 다른 생성자 호출시 사용
		// super: 상속에서 부모의 객체의 필드나, 메소드 사용.
		// super(): 부모 클래스 생성자 호출할때 사용
		A a=new A();
		

	}

}
