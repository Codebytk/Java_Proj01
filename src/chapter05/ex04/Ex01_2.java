package chapter05.ex04;

import java.util.Scanner;

public class Ex01_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int idx;
		int n;
		int[] arr1;
		
		while (true) {
		System.out.println("==============================================================");
		System.out.println("1. 인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수저장 후 출력");
		System.out.println("2. 인풋값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 뺴고");
		System.out.println("3. 인풋값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수만 빼고");
		System.out.println("4. 프로그램종료");
		System.out.println("==============================================================");
		System.out.println("1~4번호까지 번호를 입력하세요");
		
		n=sc.nextInt();
		
		if(n==1) {
			System.out.println("1번선택 : 배열의 방의 크기를 넣어 주세요");
			idx=sc.nextInt();
			arr1=new int[idx];
			
			int i=0;//배열의 방번호를 지정하는 변수
			int a;//7과8의 배수 를 저장하는변수
			for(a=1; ; a++) { //조건을 생략하면 무한루프
				if(a%7==0||a%8==0) {    //7의 배수이거나 8의배수
					arr1[i]=a;			//배열 방에 7의 배수와 8의 배수를 저장
					i++; 	//배열의 방의 번호증가는 값이 저장 될떄만 증가되어야됨
					
				}
				if(i==idx) {	//i=방번호이고, idx:인풋받은 방의 개수
					break;
				}
			
			//for 문을 사용해서 배열에 (arr1)저장된 값을 출력
			/*
			 System.out.println("인풋받은 방의 개수: "+idx);
    		 System.out.println("마지막 방번호: "+i);
			 System.out.println("마지막 방번호에 들어간 값"+a);
			 System.out.println("1. 7의 배수 , 8의 배수 출력됨");
			 for (i=0; i<arr1.length; i++) {
			*/
		}
			for(i=1; i<arr1.length; i++) {
				System.out.print(arr1[i]+ " ");
			}
			System.out.println();
		
		// System.out.println("100번방의 갑출력:"+arr1[100]);
			}else if(n==2) {
				System.out.println("2 번 선택 : 방의 크기를 넣어주세요" );
				//인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 빼고 저장후 출력
				idx=sc.nextInt(); //배역방의 크기
				arr1= new int[idx];//스케너로 받은 값을 방크기로 지정
				
				//for 문을 사용해서 1씩 증가 하는데 4의 배수는 배열에 넣지 않고 저장
				int i=0;  //방번호
				int a;	// 값을 저장하는 변수
				for (a=1; ; a++) {
					if (a%4==0) {
						continue;	//continue 를 만나면 아래내용을 실행하지 않고 증가식으로 올라감
				}
					arr1[i]= a;
					i++;
					if (i==idx) {
						break;
					}	
				}
				// for 문을 사용해서 배열에 들어간 값을 출력
				System.out.println(" 배열의 값 출력 ");
				for (i=0 ; i < arr1.length; i++) {
					System.out.print(arr1[i]+" ");
				}System.out.println();
				
			}else if(n==3) {
				System.out.println("3 번 선택: 방의 크기를 입력하세요>>");
				idx=sc.nextInt();
				arr1=new int [idx];
				
				//3. 인풋값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수만 빼고
				int i=0;//방번호
				int a;	//3의 배수만 저장하되 6의 배수는 저장하지 않도록
				
				
				//for 문을 사용해서 값을 저장
				for(a=1 ; ;a++){
					if(a%3==0 && a%6!=0) {
						
						arr1[i]=a;
						i++;
					}
					if(i==idx) {
						break;
					}
				}
				
			//for 문을 사용해서 넣은 값을 출력
			System.out.println("배열의 내용을 출력");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			}else if(n==4) {
				System.out.println("프로그램을 종료합니다.");
			break;
			}else{
			System.out.println("없는 번호입니다 다시입력해주세요");
			}
		}
		
		
		
		
		
		
		
		}
		

	}


