package chapter11.ex02;

class Student{
	//필드
	String name;
	Student(){}
		
	//합계와 평균을 출력하는 메소
	void sum_evg() {
		
	}
}
class Student_Sub extends Student{
	//자식의 필드
	int kor;	//국어점수
	int eng;    //영어점수
	int math;	//수학점수
	
	//부모의 sum_avg 메소드를 오버라이딩 해서 객체의 kor, eng, math 의 합계와 평균을 출력하는 메소드
	Student_Sub(){}
	
	Student_Sub (String name, int kor, int eng, int math) {
		super.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	@Override
	void sum_evg() {
		int sum =kor+eng+math;
		double evg =sum/3.0;
		System.out.println("학생이름  국어  영어  수학  합계  평균");
		System.out.println(name+"   "+kor+ "   "+eng+"  " + math+"   "+sum+"  "+evg);
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//
		//생성자를 사용해서 객체생성시 필드의 값을 할당하고
		//홍길동 70 88 77
		//이순신 80 68 87
		//김똘똘 60 86 87
		//홍길순 77 56 80
		//강감찬 55 66 77
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서
		
		//배열의 값을 for 문으로 출력할때  
		// 오버 라이딩 된 메소드 출력
		// 5명 학생의 국어 에 대한 합계,평균
		// 5명 학생의 영어에 대한 합계, 평균
		
		
		Student[] arr = new Student [5];
		arr[0]=new Student_Sub("홍길동",70,88,77);
		arr[1]=new Student_Sub("이순신",80,68,87);
		arr[2]=new Student_Sub("김똘똘",60,86,87);
		arr[3]=new Student_Sub("홍길순",77,56,80);
		arr[4]=new Student_Sub("강감찬",55,66,77);
		
		for (int i=0; i<arr.length; i++) {
			arr[i].sum_evg();
		}
		
		System.out.println("학생들의 국어점수의 합계 및 평균");
		int sum2 = 0;
		for(int j=0; j<arr.length; j++) {
			sum2+=((Student_Sub)arr[j]).kor;
		}System.out.print(sum2+" ");
		System.out.println(sum2/5.);
		
		System.out.println("학생들의 영어점수의 합계 및 평균");
		sum2=0;
		for(int j=0; j<arr.length; j++) {
			sum2+=((Student_Sub)arr[j]).eng;
		}System.out.print(sum2+" ");
		System.out.println(sum2/5.);
		System.out.println("학생들의 영어점수의 합계 및 평균");
		sum2=0;
		for(int j=0; j<arr.length; j++) {
			sum2+=((Student_Sub)arr[j]).math;
		}System.out.print(sum2+" ");
		System.out.println(sum2/5.);
		
		
	}
}
