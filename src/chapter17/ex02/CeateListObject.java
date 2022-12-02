package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//java.lang 패키지 하위의 클래스는 생략 가능(Object, String , Integer,...)

public class CeateListObject {

	public static void main(String[] args) {
		
		//참고로 알아둠. 몰라도 상관없는 내용
		//1. ArrayList
		List<Integer> aList1 = new ArrayList();	//내부적으로 메모리 공간은 10 개 확보
		List<Integer> aList2 = new ArrayList(30);	//내부적으로 초기 메모리 공간 방 30개 생성
		
		//2. vector
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(50);
		
		//3. LinkedList
		List<Integer> aList5 = new LinkedList(); // capacity 10
	//	List<Integer> aList6 = new LinkedList(60);		//오류발생,//초기설정시 오류발생
		
		//컬렉션은 자동으로 방크기가 늘어나고 줄어든다
		//Array.asList() 를 사용해서 값을 넣을 경우 방 크기가 고정되어서 늘어나거나 줄어들지 않는다.
		//고정된 값만 들어가야할경우 : 12달, 용일
		List<Integer>aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String>aList8 = Arrays.asList("월","화","수","목","금","토","일");
		
	//	aList7.add(13);	//값을 더 추가할수 없다.	//오류발생
		aList7.set(1,7);	// 1번방의 값을 7로 셋탕하겠다.
		
		try {
			aList8.add("오늘");
		} catch (UnsupportedOperationException e) {
			System.out.println("값을 더 추가는 불가능");
		}
		
		try {
			aList8.remove(0);
		} catch (UnsupportedOperationException e) {
			System.out.println("방의 값을 제거할 수 없습니다.");
		}
		
		
		System.out.println(aList7);
		
		aList8.set(0,"오늘");
		System.out.println(aList8);
		
		
		
		
		
		
		
		
		
	}

}
