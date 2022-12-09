package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		TestClassEx tce = new TestClassEx();
		
		tc.print();
		tce.print();
		tce.add();
		
	}
}	
		

class TestClass{
	// private : 나 외에 다 사용 불가
	// protected : 상속받은 클래스까지는 사용 허용
	// default(안적으면) : 같은 패키지면 허용
	// public : 같은 프로젝트면 허용
	
	// 상속할거면 private -> protected
	protected int num;
	protected String str;
	private double dNum;
	
	public void print() {
		System.out.println("테스트 클래스 사용");
	}
	

}

// TestClass를 상속받아서 수정 & 추가

class TestClassEx extends TestClass{
	// TestClass가 북붙되어있다
	
	// 추가
	private int num2;
	
	// 수정(오버라이딩) 변수안의 함수가 더 우선시 된다.
	public void print() {
		System.out.println("TestClassEx가 만든 pring 사용");
		
	}
	
	// 추가
	public int add() {
		System.out.println("추가된 메서드");
		return 0;
	}
	
}
	
