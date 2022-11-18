package chapter07;

class Student{
	
	
	//필드선언
	String stuName;		//학생이름
	int stuNum;			//학번을 저장
	String stuAddr;		//학생의 주소
	String stuPhone;	//학생의 전화번호
	double Weight;		//학생의 몸무게
	
	//생성자 오버로딩,
	//	기본생성자,매개변수3개인 생성자, 매개 변수 5개인 생성자
	Student(){}
	
	Student (String sName, int sNum,String sAddr){
		this.stuName=sName;
		this.stuNum=sNum;
		this.stuAddr=sAddr;
	}
	Student(String sName, int sNum,String sAddr,String sPhone,double sWeight){
		this.stuName=sName;
		this.stuNum=sNum;
		this.stuAddr=sAddr;
		this.stuPhone=sPhone;
		this.Weight=sWeight;
	}
	void print() {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학번   :"+stuNum);
		System.out.println("학생의 주소 : "+stuAddr);
		System.out.println("학생의 전화번호부 : "+stuPhone);
		System.out.println("학생의 몸무게 : "+Weight);
		
	}
	//필드의 값을 출력 하는 메소드 void print(){ 필드의 값을 출력
	
	

}

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("===========기본 생성자===============");
		
		Student stu1=new Student();
		stu1.print();
		
		System.out.println("===========매개변수3개===============");
	
		Student stu2=new Student("이태경",20181,"고양시");
		stu2.print();
			
		System.out.println("===========매개변수5개===============");
		
		Student stu3=new Student("이태경",20181,"고양시","01011112222",90.1);
		stu3.print();
			
		
	}
}