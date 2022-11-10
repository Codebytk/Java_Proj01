package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5;
		int value2 = 8/5;   //1   int/int =int
		
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0;
		System.out.println(data2);	  //1.6 
		
		double data3 = 8/5;        // double이지만 int/int = int(1)
		System.out.println(data3);
		
		double data4 = 8/5.0 ;   //정수8이 double 형으로 업캐스팅
		System.out.println(data4);  //1.6
		
		//주의 : 평균을 계산할 때에 double
		
		System.out.println("===================");
		
		//2. 다른 자료형 간의 연산(작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		// int data5 =5+3.5;   //오류발생
		double data6 = 5+3.5; //(int 5가 자동으로 업케스팅)
		
		int data7 = (int)3.5+5;		//8
		
		int data8 = (int)(5 + 3.5); //8
		double data9 =5/2.0 ;   // 5는 정수지만 2.0의 실수로 나누기 때문에 double업케스팅)
		System.out.println(data9);
		
		double data10 = 5/2;
		System.out.println(data10);     //2.0
		
		System.out.println("===================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 :data11(int)+data12(double)
		System.out.println(data11+data12); //50 -->double 형으로 바뀜
		//업케스팅 data11(int)/data12(double)
		System.out.println(data11/data12); 
		System.out.println(data11/(int) data12 );
		
		//<문제>
		// 국어: 90, 수학 :88 , 영어: 77 , 음악: 90 과학: 99
		//각 과목의 점수의 정보들을 int변수를 만들어서 저장후 :합계 평균갑을 출력
		
		int kor, math, eng, music, sience;
		kor = 90;
		math = 88;
		eng = 77;
		music = 90;
		sience = 99;
		int sum = (sience+math+eng+music+kor);
	    double avg = sum/5.0 ;
	    
	    System.out.println(sum);
	    System.out.println(avg);
	    
	    float 평균 = sum/5.0f;
	    System.out.println("평균점수는: " + 평균);
	    
	    
	    
	    
	}

}
