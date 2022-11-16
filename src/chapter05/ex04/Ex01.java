package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> : 오늘 까지 :12시 까지
		int a; // 선택지
		do {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("==============================================================");
		System.out.println("1. 인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
		System.out.println("2. 인풋값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고");
		System.out.println("3. 인풋값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수만 빼고");
		System.out.println("4. 프로그램종료");
		System.out.println("==============================================================");
		
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
						continue;
					}
				
				}System.out.println();
				break;
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
			}System.out.println();
			break;
		case 3:
			int e;
			System.out.println("방의 크기를 적어주세요");
			e=sc.nextInt();
			int[] arr3=new int [e];
			for (int p=0, j=0; p<e; p++, j++) {
				if(j%3==0) {
					if(j%6==0) {
						p--;
					}else {
				arr3[p]=j;
				System.out.print(arr3[p]+" ");
						}
					}
			}System.out.println();
			break;
		case 4:	
			System.out.println("프로그램 종료합니다.");
			break;
		default:
			System.out.println("없는 선택지입니다. 다시 선택해주세요");
				}
		}while ( a != 4 );
		
		
		
		
	
	}

}
