package chapter10.ex09;

class Student {
	//필드 
	String name;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int month;
	
	Student(){}
	Student (String name , int stuID, int age, String stuAdd, String stuPhone, double weight){
		this.name = name;
		this.stuID=stuID;
		this.stuAdd = stuAdd;
		this.age=age;
		this.stuPhone = stuPhone;
		this.weight=weight;
		if(month > 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력값입니다.1에서 12 사이에 정수값을 할당하세요");
			return;		//프로그램을 종료
		}
	}
	//getter(필드의 값을 리턴으로 돌려줌) ,setter (인풋값을 받아서 필드에 적용) 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//toString() 재정의 : 객체의 Heap 메모리의 주소값 출력, hashcode로 출력 (16진수로)
	//객체 자체를 출력 했을때 toString() 가 
	@Override
	public String toString() {		//object 클래스의 메소드, 모든 자바의 클래스
		return "Student [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + "]";
	}
	
	
}

public class Initial_field01 {

	public static void main(String[] args) {
		//1. 객체를 생성후 직접 필드의 값을 할당
		//2. 객체를 생성할때 생성지를 사용해서 필드의 값을 할당
		//3. DTO (Data Transper Object), VO (Value Object):
		//		: client 에세 값을 받아서 DAO 에 값을 전송
					//DAO(Data Acess Object) : DataBase 에 Insert, update, Delete
		//		getter(필드의 값을 읽을 떄), setter (필드의 값을 할당할때)를 사용해서 값을 할당
		
		//1. 객체를 생성 후 직접 필드의 값을 할당한다.
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age=20;
		s1.stuAdd="서울종로구";
		s1.stuID = 1111;
		s1.stuPhone="010-0000-0000";
		s1.weight = 80.5;
		
		System.out.println(s1);					//객체를 출력할때 toString() 메소드가 호출이됨
		System.out.println(s1.toString());
		
		//2. 객체를 생성시 생성자를 통해서 
		Student s2 = new Student("이순신", 22222,30, "서울 강남구", "01000000000", 85.5);
		System.out.println(s2);
		System.out.println(s2.toString());
		
		//3. setter 를 사용해서 값을 넣고 getter 를 사용해서 필드의 값을 출력
	Student s3 = new Student();
		s3.setName("강감찬");
		s3.setAge(40);
		s3.setStuAdd("서울성북구");
		s3.setStuID(3333);
		s3.setStuPhone("010-0000-0000");
		s3.setWeight(90.5);
	
		
		
		
	}

}
