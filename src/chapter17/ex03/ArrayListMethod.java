package chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		
		List<Integer>aList1 = new ArrayList();
		
		//1. add(E element) : List 에 값을 추가할때 :ArrayList,Vectory, LinkedList
			//마지막 방에 값이 들어감
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1);
		
		
		//2. add (int index, E element) : 특정 방번호에 값을 넣는다.
		aList1.add(1,6);	// 방 번호 1번에 6값을 넣겠다.
		
		System.out.println(aList1);
		
		//3. addAll(다른 리스트 객체) : 다른 컬렉션의 모든 내용을 합해서 출력
		List<Integer> aList2 = new ArrayList();
		aList2.add(1); aList2.add(2);
		System.out.println(aList2);	//1,2
		
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		//4. addAll(int index, 또다른 객체)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);
		
		System.out.println(aList3);	// 1 , 2
		aList3.addAll(1, aList3);	// 1번방 자리에 할당
		System.out.println(aList3);	//[1, 1, 2, 2]
		
		//5. set(int index, E element):  기존의 방의 값을 수정
		aList3.set(1, 5);	//1번 방의 값을 5로 수정
		aList3.set(3, 6);	//3번 방의 값을 6으로 수정
		System.out.println(aList3);
		
		
		//6. remove (int index) : 특정방 번호의 값을 삭제
		aList3.remove(1);	//1번 방에 있는 5를 삭제
		System.out.println(aList3);
		
		//7. remove(Object o) : 방의 들어간 값으로 삭제
		aList3.remove(new Integer(2));
		System.out.println(aList3);
		
		//8. clear() : 모든값을 삭제
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : 값이 없으면 : true , 값이 존재하면 : false
		System.out.println(aList3.isEmpty());
		
		//10. size() : 방의 갯수
		System.out.println(aList3.size());	//0
		aList3.add(1);aList3.add(2);aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		//11. get(int index) : 방 번호의 값을 가지고 올쨰
		System.out.println("0번쨰 : " + aList3.get(0));
		System.out.println("1번쨰 : " + aList3.get(1));
		System.out.println("2번쨰 : " + aList3.get(2));
		
		
		//12. toArray(): 	List ==> Array	(배열로 변환)
		Object[] obj = aList3.toArray();
		
		//배열의 값을 출력: Arrays.toString()
		System.out.println(Arrays.toString(obj));	//[1,2,3]
		
		//13. toArray(T[] t) --> T[]	리스트 ==> 배열
		Integer[] int1 = aList3.toArray(new Integer [0]);	
			//0 : 변환할 배열방의 갯수인데, 컬렉션의 배열방보다 작게설정된 경우 걸렛션에 저장된 것에
			// 맞추어서 처리됨
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(int2));
		
		
		
		
	}

}
