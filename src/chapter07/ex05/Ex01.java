package chapter07.ex05;

class Student{
	//필드선언
	String stuName;	//학생이름 : 학생이름없음
	int stuNo;	//학생 학번 : 0
	String stuPhone; //학생 핸드폰 번호 :000-0000-0000
	String stuAddr;	// 학생 주소	:"서울"
	int stuAge; 	//학생 나이 	:0
	double stuWeight; // 몸무게	:0.0
	
	Student(){ 	//기본 생성자 에서 초기값을 할당: this () 메소드를 사용해서 각필드의 값을 적용
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone="000-0000-0000";
		stuAddr="서울";
		stuAge=0;
		stuWeight=0.0;
		
	}
	Student(String Stuname){
		this();
		this.stuName=Stuname;
	}
	Student(String Stuname , int nom){
		this(Stuname);
		this.stuNo=nom;
	}
	Student(String Stuname , int nom, String Stuphone){
		this (Stuname,nom);
		this.stuPhone=Stuphone;
	}
	Student(String Stuname , int nom, String Stuphone,String addr){
		this (Stuname,nom,Stuphone);
		this.stuAddr=addr;
	}
	Student(String Stuname , int nom, String Stuphone,String addr, int age){
		this(Stuname,nom,Stuphone,addr);
		this.stuAge=age;
	}
	Student(String Stuname , int nom, String Stuphone,String addr, int age,double weight){
		this(Stuname,nom,Stuphone,addr,age);
		this.stuWeight=weight;
	}
	void print() {
		//필드의 내용출력
		System.out.println("학생 이름 : "+stuName);
		System.out.println("학번    : "+stuNo);
		System.out.println("핸드폰 번호: "+stuPhone);
		System.out.println("주소     : "+stuAddr);
		System.out.println("나이     : "+stuAge);
		System.out.println("몸무게    : "+stuWeight);
	}


}



public class Ex01 {

	public static void main(String[] args) {
	Student stu1= new Student();
	stu1.print();
	
	System.out.println("===========================");
	Student stu2= new Student("이태경");
	stu2.print();
	System.out.println("============================");
	Student stu3= new Student("이태경",2022);
	stu3.print();
	System.out.println("============================");
	Student stu4= new Student("이태경",2022,"01037722956");
	stu4.print();
	System.out.println("=============================");
	Student stu5= new Student("이태경",2022,"01037722956","경기");
	stu5.print();
	System.out.println("============================");
	Student stu6= new Student("이태경",2022,"01037722956","경기",24);
	stu6.print();
	System.out.println("============================");
	Student stu7= new Student("이태경",2022,"01037722956","경기",24,90.0);
	stu7.print();
	}

}
