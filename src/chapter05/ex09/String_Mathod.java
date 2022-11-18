package chapter05.ex09;

import java.util.Arrays;

public class String_Mathod {

	public static void main(String[] args) {
		// String 클래스에서 사용되는 주요 메소드(함수)
				// 기본자료형:boolean,byte,short,int, long , float , double, char
				// 참조자료형:배열 / 열거 / 객체 / 인터페이스    <===첫자 모두 대문자
		//1.문자열의 길이 (length())
		//참조 자료형 [참조] 변수
		String str1="Hello Java!";
		String str2="안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length()); // 글자의 갯수		
		
		System.out.println(str2.length());
		
		//2. 문자열 검색 (charaAt(),indexof(), last indexof())
		System.out.println(str1.charAt(0)); //1전방 문자를 출력 e
		System.out.println(str2.charAt(0));	
		System.out.println();
		
		
		
		System.out.println(str2.charAt(1));
		System.out.println(str1.charAt(1));
		
		System.out.println(str1.indexOf('a'));	//문자 a가 저장된 방번호를 출력
		System.out.println(str1.lastIndexOf('a'));//9
		
		System.out.println(str1.indexOf('a',8));	//8번부터 a를 검색9
		System.out.println(str1.lastIndexOf('a',8));//8번부터 a를검ㅅ색7
		
		
		//문자열을 검색해서 방번호를 출력
				//String str1="Hello Java!";
				//String str2="안녕하세요! 반갑습니다.";
		System.out.println("==================");
		System.out.println(str1.indexOf("Java"));//16
		System.out.println(str2.indexOf("하세요"));//2
		System.out.println(str1.lastIndexOf("ello"));
		
		System.out.println(str1.indexOf ("bye"));
		
		
			//문자열 검색에 실패시 -1과 같은 값출력
		//String str1=2.3; //오휴발생 2.3(double 형 데이터를 String 에 저장시 오류
		String str3=String.valueOf(2.3);
		//String str3=2.3;
		//String str4=true;
		String str4=String.valueOf(true);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("==========================");
		
		//concat ():+ 연산자와 같은 문자열과 문자열을 연결시켜주는 매소드
		String str5= str3.concat(str4);
		String str6=str4+str3;
		System.out.println(str5);
		System.out.println(str6);
	
		//String.valueof()+ concat()==>+
		String str7= "안녕" +3;
		String str8="안녕".concat(String.valueOf(3));
		
		
		System.out.println(str7);
		System.out.println(str8);
		
		//4. 문자열===>byte[] (getBytes() )
		//	 문자열==> char[] ( toCharArray() )
		String str10="Hello Java!";
		String str11="안녕하세요! 반갑습니다.";
		
		//getBytes() : 문자열을 1글자씩 잘라서 byte 배열에 저장, 아스키 코드값이 출력
		byte[] arr1=str10.getBytes();
		byte[] arr2=str11.getBytes();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("======================");
		System.out.println("======================");
		
		//toCarArray():
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr3[0]);
		
		//5. 문자열 수정, 대문자로 변환: toUppercase(), 소문자로 변화: toLowercase();
		System.out.println(str1.toLowerCase()); //소문자
		System.out.println(str1.toUpperCase()); //대문자
		System.out.println("======================");
		//6. 문자열 수정 : replace ("수정할 원본", "수정할 내용");
						//substring (시작방번호, 잘라올 방번호);
		String str13 = "안녕 자바 World";
		System.out.println(str1.replace("Hello", "안녕"));
		System.out.println(str13.replace("World", "월드"));
		
		//substring(0,5) : 0번방에서 5번방까지 잘라서 출력
		System.out.println(str13.substring(0,4)); //0번에서 시작해서 4번방 앞까지 짤림
			//모든 프로그램에서 시작은 포함, 끝은 미포함
		System.out.println(str13.substring(3,11));
		
		//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		
		System.out.println(Arrays.toString(strArray));
		
		System.out.println("========================");
		
		//trim() : 문자열 앞, 위의 공백을 제거하는 매소드
		
		System.out.println("        abc         ".trim());
		
		System.out.println("========================");
		
		//6. 문자열의 내용비교(equals(), equalsIgnoreCase() )
		
			//equals() : Heap 의 값을 비교, 대문자 소문자 까지 체크
			//equalsIgnorecase() : Heap의 값비교, 대.소문자를 체크하지 않고 비교
		String str20= new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");
		
		//== : Stack 메모리의 참조 주소비교
		System.out.println(str20==str21); //false
		System.out.println(str20==str22);	//false
		System.out.println(str21==str22);	//false
		System.out.println("===========================");
		
		//equals() : 대소문자를 체크하면서 Heap의 값을 비교
		System.out.println(str20.equals(str21));//true
		System.out.println(str20.equals(str22));//false
		System.out.println(str21.equals(str22));//false
		System.out.println("===========================");
		//equalsIgnoreCase(): 대소문자 체크하지 않으면서 Heap 값 비교
		System.out.println(str20.equalsIgnoreCase(str21));//true
		System.out.println(str20.equalsIgnoreCase(str22));//false
		System.out.println(str21.equalsIgnoreCase(str22));//false
		
		
		
		
		
		
		
		
		
		
		
	}

}
