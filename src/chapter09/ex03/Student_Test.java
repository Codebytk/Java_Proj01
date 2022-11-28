package chapter09.ex03;

class Student{
	String stuName;		//학생이름
	static int stuNo;	//학생수 모든 객체에서공유되는 필드 객체가 늘어나면 학생수도 늘어난다.
						//객채가 생성될수록 학생수 1씩 증가
	String stuAddr;		//학생수

	//static 필드의 토기값 할당, 클래스 로딩시 제일먼저 작동
	static {
		stuNo=0;
	}
	Student(String stuName, String stuAddr){
		this.stuName=stuName;
		this.stuAddr=stuAddr;
		stuNo++;				//학생수 모든 객채어서 공유
			//stuNo 는 객체를 생성할때 학생수가 늘어남
	}
	void pront () {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학생주소 : "+stuAddr);
		System.out.println("학생수 :"+ stuNo);
	}



}

public class Student_Test {

	public static void main(String[] args) {
		// 1. 객체 생성
		Student s1=new Student("홍길동", "서울 종로구");
		s1.pront();
		
		System.out.println("-============");
		Student s2=new Student("이순신","서울 강남구");
		s2.pront();

		System.out.println("-============");
		Student s3=new Student("강감찬","서울 성북구");
		s3.pront();
		System.out.println("=========인스턴스 필드: 다른 객체와 공유되지 않음=========");
		System.out.println(s1.stuName);
		System.out.println(s2.stuName);
		System.out.println(s3.stuName);
		
		System.out.println("===========정적 필드===========");
		System.out.println(s1.stuNo);
		System.out.println(s2.stuNo);
		System.out.println(s3.stuNo);
		
	}

}
