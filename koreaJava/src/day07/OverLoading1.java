package day07;

public class OverLoading1 {
	// 오버로딩 : 같은 이름으로 메서드를 여러개 만드는 것
	// C언어 에서는 같은 이름의 함수가 존재 할 수 없다
	// C++ 에서 오버로딩 문법이 추가됨 - 메서드 이름이 같아도 매개변수가 다르면 OK
	private int num;
	
	public int print() {
		System.out.println(num);
		return num;
	}
	// 원래는 하나의 프로그램에 하나의 함수만 있을수 있지만
	// 같은 변수 라도 (소괄호)안의 내용을 다르게 해준다면 
	// 중복으로 만들수 있다. 그것이 오버로딩
	// Print 메서드를 오버로딩
	public int print(int num) {
		System.out.println(num);
		return num;
	}
	
	public int print(double dNum) {
		System.out.println((int)dNum + "실수함수 사용");
		return (int)dNum;
	}
	
	public int print(int num1, int num2) {
		System.out.println(num1+num2);
		this.num = num1+num2;
		return this.num;
	}
	
}
