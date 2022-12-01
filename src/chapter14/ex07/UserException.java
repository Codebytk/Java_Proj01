package chapter14.ex07;

//사용자 정의 예외
//1. 점수가 음수이면 예외 발생 시키는 사용자 정의 예외
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
//2. 점수가 100 점을 초과 하는 경우 사용자 정의
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
//사용자 정의예외를 처리할 클래스 
class Aa {
	
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {	//MinusException 강제 발생 시킴
			throw new MinusException("예외가 발생됨 : 음수값 입력 불가함");	//일반예외
		}else if (score >100) {		//OverException	강제 발생 시킴
			throw new OverException("예외가 발생됨 : 100이 넘는 값 입력 불가함");	//일반예외
		}else {
			System.out.println("정상값입니다.");
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		Aa a1= new Aa();
		
		try {
			a1.checkScore(120);
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(OverException e) {
			e.printStackTrace();
		}
		

	}

}
