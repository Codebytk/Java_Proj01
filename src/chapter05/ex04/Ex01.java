package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> : 오늘 까지 :12시 까지
		
		Scanner sc= new Scanner(System.in);
		System.out.println("==============================================================");
		System.out.println("1. 인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
		System.out.println("2. 인풋값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고");
		System.out.println("3. 인풋값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수만 빼고");
		System.out.println("4. 프로그램종료");
		System.out.println("==============================================================");
		int a; // 선택지
		a=sc.nextInt();
		switch(a){
		case 1:
			int b;//1번
			int []arr1;
			System.out.println("방의 크기를 적어주세요");
			b=sc.nextInt();
			arr1=new int[b];
			for(int i=0, c=1; i<b; i++, c++) {
				if(c%7==0||c%8==0) {
					arr1[i]=c;
					System.out.print(arr1[i]+" ");
					}else {
						i--;
					}
				System.out.println();
				}
		case 2:
			int d;//2번
			System.out.println("방의 크기를 적어주세요");
			d =sc.nextInt();
			int[] arr2=new int[d];
			int i=0;
			for(int c=0; i<d; c++ ) {
				if(c%4!=0) {
					arr2[i]=c;
					System.out.print(arr2[i]+" ");
					i++;
				}
			}
			System.out.println();
		case 3:
					
			
		
		
		}
		
		
		
		
		
	
	}

}
