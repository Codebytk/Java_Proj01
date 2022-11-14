package chapter4.ex07;

public class Break_Control_keyword {

	public static void main(String[] args) {
		// break 제어 키워드: 제어문 (if(생략됨) , switch(명시해야됨) , for , while, do while)
		//	-제어문을 탈출할떄 사용됨
		//1. 단일 loop 문에서 break 탈출
		for (int i=0; i<10; i++) {
			System.out.println();
			break;				//break를 만나면 제어문 탈출
		}
	for(int i=0; i<10; i++) {
		System.out.println(i);
		if(i==5) {
			break;
		}
	}		//0, 1, 2, 3, 4, 5
	System.out.println("==================");
	
	//2. 다중 (이중) loop문에서 break 탈출
	// case 1: 하나의 반복문만 탈출하는 경우
		for (int i=0 ; i<5 ; i++) {
			for (int j=0; j<5; j++) {
				System.out.println(i+" , "+j);
				if (j==2) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println("=======lable를 사용해서 한꺼번에 Lable 위치로 점프=============");
	//case 2: 점프해서 한번에 탈출 바깥쪽의 for 문을 탈출 (LABLE)
		pos1: for (int i=0; i<5; i++) {
			for ( int j=0; j<5; j++) {
				System.out.println(i+" , "+j);
				if(j==2) {
				break pos1;
				}
			}
			System.out.println();
		}
	//case 2: 점프해서 한번에 탈출 바깥쪽의 for 문을 탈출 ( 변수값을 조정해서 탈출)
	for (int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
			if (j==2) {
				i=100;     //바깥쪽 for 문의 변수의 값을 큰값을 넣어서 조건을 false 로 만든다.
				break;
			}
			System.out.println(i+" , "+j);
		}
	}
	
	}	

}
