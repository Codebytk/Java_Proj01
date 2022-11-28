package chapter10.ex10;

class C {
	String stuID;
	String name;
	int age;

	// stuID 재정의
	// c1.equals(c2) //stuID 필드를 재정의 해서 같으면 true 아니면 false

	// 생성자, 기본생성자1, 생성자 2,
	C() {
	}

	C(String stuID, String name, int age) {
		this.stuID = stuID;
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object stuId) {
		if (this.stuID == ((C) stuId).stuID) {
			return true;
		} else {
			return false;
		}
	}

	// toString 메소드 재정의 : 필드의 값을 출력 , 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}

}

public class Ex01 {

	public static void main(String[] args) {
		C c = new C("12345", "홍길동", 24);
		C c1 = new C("12345", "홍", 24);

		System.out.println("=====학생 아이디 비교=====");
		System.out.println(c.equals(c1));

	}

}
