package chapter16.ex02;

//모든 객체는 object 를 상속하고 있다
//모든객체는 oObject 타입으로 모두 타입변환 할 수 있다.
	// Object 타입으로 저장된 객체를 가져와서 사용하기 위해서는 매번 다운 캐스팅이 필요하다.
	// 모든 객체는 object 타입으로 지정할수 있고,
		//매번 다운캐스팅이 필요하다.

class Apple{String apple = "애플";}
class Pencil{String pencil = "연필";}
class Banana{String banana = "바나나";}
class Orange{String orange = "오랜지";}




class Goods{
	private Object object = new Object();
	
	//object 는 자바의 모든 객체를 담을수 있는 타입이다.
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}






public class Usint_Object {

	public static void main(String[] args) {
		//1. goods 를 사용해서 Apple 객체를 저장후 가져오기 
		Goods goods1 = new Goods();
		goods1.setObject(new Apple()); 	
		
		Object obj = goods1.getObject();
		Apple app1 = (Apple) obj;
		
		Apple app2 = (Apple) goods1.getObject();
		System.out.println(app2.apple);
		
		//2. Good 를 사용해서 pencil 객체를 저장후 가져오기
		goods1.setObject(new Pencil());
		Object obj2 = goods1.getObject();
		Pencil pen1 = (Pencil) obj2;
		System.out.println(pen1.pencil);
		
		//3. goods 를 사용해서 Banana 객체를 저장후 가져오기
		goods1.setObject(new Banana());
		
		Banana banana = (Banana)goods1.getObject();
		System.out.println(banana.banana);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
