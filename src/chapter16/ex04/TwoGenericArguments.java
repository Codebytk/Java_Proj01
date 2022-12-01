package chapter16.ex04;

import java.awt.RenderingHints.Key;



//제너릭 클래스 : 클래스 이름 뒤에 K,V

class KeyValue<K,V>{
	private K key;
	private V value;
	
	//getter (필드의 값을 호출) , setter(필드의 값을 입력)
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class TwoGenericArguments {

	public static void main(String[] args) {
		// 1. <String , Integer> 타입으로 객체 생성
		KeyValue<String, Integer>kv1 = new KeyValue<>();
		
		//setter 를 사용해서 값 할당
		kv1.setKey("사과");		//String
		kv1.setValue(1000);		//Integer
		
		//getter 를 사용해서 값 출력
		String key1 = kv1.getKey();
		Integer val1 = kv1.getValue();
		System.out.println("key : "+key1+"\nvalue :"+val1);
		
		System.out.println(kv1.getKey()+ " , "+ kv1.getValue());
		
		KeyValue<Integer,String>kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found : 요청한 페이지를 찾지 못했습니다.");
		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		//3. <String, Void >  <====Void : 해당 필드를 사용하지 않겠다.
		
		KeyValue<String , Void>kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		System.out.println(kv3.getKey());
		

	}

}
