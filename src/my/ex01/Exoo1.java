package my.ex01;

class Animal<M,K> {
	private M key;
	private K value;
	
	
	
	public M getKey() {
		return key;
	}
	public void setKey(M key) {
		this.key = key;
	}
	public K getValue() {
		return value;
	}
	public void setValue(K value) {
		this.value = value;
	}
}

public class Exoo1 {
	public static void main (String[]args) {
		Animal<String, Integer> a1 = new Animal<>();
		a1.setKey("강아지");
		a1.setValue(14);
		
		System.out.println(a1.getKey());
		System.out.println(a1.getValue());
		
		
		
		
	}
}
