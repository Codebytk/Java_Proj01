package chapter05.ex08;

import java.util.Arrays;

public class Argument_of_mainmethod {

	public static void main(String[] args) {
		// main Method 로 배의 값을 인풋하기
		
		//1. args: main 메소드로 string[] 배열을 담은 변수
		System.out.println(args.length); //args배열의 방의 갯수
		System.out.println();
		
		//2. args 배열변수에 담긴 각방의 값을 for 문을 사용해서 출력하기
		
		
		System.out.println("=======for 문을 사용해서 출력=======");
		for(int i =0; i<args.length; i++) {
			System.out.println(args[i]+" ");
		}
		
		System.out.println();
		System.out.println("====enhanced for 문을 사용해서 출력");
		for (String k:args) {
			System.out.println(k+" ");
		}
		System.out.println();
		System.out.println("====Arrays.toString 문을 사용해서 출력");
		System.out.print(Arrays.toString(args));
		System.out.println();
		
		
		
		System.out.println("==========================");
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		System.out.println(a+b+c+d);
		
		System.out.println("===============");
		// string 타입의 숫자를 정수로 변환해서 변수에 할당.
		int e= Integer.parseInt(a);	// string 타입의 숫자를 정수로 변환
		int f= Integer.parseInt(b);
		int g= Integer.parseInt(c);
		int h= Integer.parseInt(d);
		
		
		System.out.println(e+f+g+h);
		
		

	}

}
