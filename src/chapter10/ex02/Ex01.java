package chapter10.ex02;

class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student{
	String stu2Id;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛나게 먹습니다.");
		
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// 업케스팅 실습
		// 1. Student 클래스를 생성하면서 Human 타입으로 지정 : h1
		// 2. Student 클래스를 생성하면서 Student 타입으로 지정 : s1
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		//4. Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		//5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		Human h1 = new Student();
		//Human의 필드와 메소드 까지만 접근 가능
		h1.age=24;
		h1.name="이태경";
		System.out.println(h1.age);
		System.out.println(h1.name);
		h1.eat();
		//h1.stuEat();
		//h1.stu2Eat();
		
		Student s1 = new Student();
		//Human 과 Student 의 필드와 메소드 까지 접근가능
		s1.stuID="2018";
		s1.stuEat();
		s1.eat();
		
		Human h2 = new Student();
		//Human 의 필드와 메소드 까지 접근가능
		
		
		Student s2 = new Student2();
		//Human 과 Student 의 필드와 메소드 까지 접근가능
		
		Student2 s3 = new Student2();
		//Human 과 Student 와 Student2 의 필드와 메소드 접근가능
		
		System.out.println("=========h1 포함============");
		System.out.println(h1 instanceof Human);	//true
		
		System.out.println(h1 instanceof Student);	//true
		
		System.out.println(h1 instanceof Student2);	//true
		
		System.out.println("=========h2 포함============");
		
		System.out.println(h2 instanceof Student);	//true
		
		System.out.println(h2 instanceof Human);	//true
		
		System.out.println(h2 instanceof Student2);	//false
		
		System.out.println("=========s1 포함============");
		
		System.out.println(s1 instanceof Human);	// true
		
		System.out.println(s1 instanceof Student);	//true
		
		System.out.println(s1 instanceof Student2);	//false
		
		System.out.println("=========s2 포함============");
		
		System.out.println(s2 instanceof Human);	//true
		
		System.out.println(s2 instanceof Student);	//true
		
		System.out.println(s2 instanceof Student2);	//true
		
		System.out.println("=========s3 포함============");
		
		System.out.println(s3 instanceof Human);	//true
		
		System.out.println(s3 instanceof Student);	//true
		
		System.out.println(s3 instanceof Student2);	//true
		
		
		
		
		
		
	}

}
