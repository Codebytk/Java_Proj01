package chapter16.ex10;

//제네릭 클래스 / 제너릭 메소드 를 사용해서 두점의 좌표값으로 넓이를 구하는 프로그램 작성

//두점의 좌표를 처리하는 클래스 생성. <제너릭 클래스
class Point<X,Y>{
	X x;
	Y y;
	//생성자를 사용해서 t,v값을 입력
	Point () {}
	Point (X x, Y y){		//X : x 좌표 , y: y 자표
		this.x = x;
		this.y = y;
	}
	
	//getter 만 생성
	
	public X getT() {
		return x;
	}
	public Y getV() {
		return y;
	}
}
//제너릭 메소드 : 일반 클래스 내부의 제너릭 메소드
class GenericMethod{
	
	//makeRectangle() 메소드 호출시
	public static <T,V> double makeRectangle (Point<T,V>p1, Point <T,V> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌
		double c;
		c = Math.abs((double) p2.getT() -(double) p1.getT());
		
		double d;
		d = Math.abs((double) p2.getV() -(double) p1.getV());
		return c*d;//넓이를 리턴해주면 됨
	}
	
}

public class Ex01 {
	public static void main(String[]args) {
		
		
		//두점의 좌표를 저장하는 p1, p2
		Point p1 = new Point(10.0,20.0);
		Point p2 = new Point(30.0,10.0);
		
		System.out.println("p1에 X,Y값을 구하고 각각 X Y 값에서  p2의  X 의값과 Y값을 빼서 곱하기");
		System.out.println("첫번쨰 좌표"+(p1.x)+" "+(p1.y));
		System.out.println("두번쨰 좌표"+(p2.x)+" "+(p2.y));
		GenericMethod gm1 = new GenericMethod ();
		System.out.println("넓이 : "+ gm1.makeRectangle(p1,p2));
		
		
		
		
		
		
		
		
		
	}
}
