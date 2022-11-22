package chapter08.ex01;

import chapter08.ex02.Student;
import chapter07.*;		//주위 하위 패키지는 적용이 안된다
import chapter07.Ex01;

public class Package {
	
	public static void main(String[]args) {
		//클래스 내부구성요소
			//1. 필드, 2. 생성자, 3. 메소드
		//클래스 외부 구성요소
			//1. 패키지, 2. 임포트, 3. 외부 클래스
		
			//1. 패키지(package): 클래스를 조직화 해서 관리하는 폴더
				//한 패키지 내에 동일한 이름의 클래스는 올수없다.
				//외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한경우
			//2. 임포트(import): 다른 패키지의 클래스를 사용할려 하는경우:import
		
		
		//student 클래스의 객체생성: 다른 패키지에 존재하는 클래스
			// chapter.ex02.Student
		//기본 생성자 호출
		Student s1 = new Student();
		s1.print();
		System.out.println();
		//매개변수 4개인 생성자 호출
		Student s2 = new Student("홍길동","1111",2022,"서울");
		s2.print();
		
		//car 클래스는 import 없이 전체이름으로 사용
		chapter08.ex02.Car car1=new chapter08.ex02.Car("삼성자동차 ", "검은색", 200);
		car1.print();
		
	}
}
