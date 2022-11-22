package chapter09.ex03;


 class A {
	int a=1;
	int b=2;
		
	void print () {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class B{
	 static int a=3;	//static (정적) 필드: 객체 생성 없이 클래스 이름으로 호출가능, 객체 생성후사용
	 static int b=4;
	 
	 static void print() {	//static(정적)메소드;
		 System.out.println(a+" "+b);
	 }
			 
 }
public class Instance_vs_Static{
	
	public static void main(String[]args) {
		//B class Static 필드 정적메소드 <===클래스 이름으로 사용가능, 객체생성후 사용됨
		
		//객체 생성 없이 클래스
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.print();
		//객체 생성후 필드와 메소드 호출
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}