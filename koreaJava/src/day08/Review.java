package day08;
public class Review {
	public static void main(String[] args) {
		// 상속 : 클래스를 복사 붙여넣기 ( 사람 -> 컴퓨터)
		// extends 부모클래스명
		Test test = new Test();
		test.setVar(2,"a");
		
		Test2 test2 = new Test2();
		test2.setVar(2, "a",3.14);
		
		
	}
}

class Test{
	private int num;
	protected String str;
	
	Test(){
		System.out.println("생성자");
	}
	
	public void setVar(int num, String str) {
		this.num = num;
		this.str = str;
	}
	
	public int getNum() {
		return num;		// 변수 직접 쓰지말고 메서드 써라
	}
	public String getStr() {
		return str;
	}
}

class Test2 extends Test{	// Test에 있는 변수와 메서드가 복퉅됨
	private double dNum;
	public Test2() {
		// 부모생성자를 그대로 사용
		super();		//부모생성자
	}
	
	// 상속을 받는 이유 : 클래스를 조금 변경하기 위해서 ==> 수정&추가
	@Override
	public void setVar(int num, String str) {
		super.setVar(num, str);		// Test클래스의 setVar을 사용하겠다라는 뜻
		// 오버라이딩 == 재정의(수정) : 우선 순위가 자신 것이 더 높음
		this.dNum = 0.0;
	}		// 오버라이딩 : 상속 받은 후 재정의
	
	public void setVar(int num, String str, double dNum) {
		super.setVar(num, str);
		this.dNum=dNum;
		// 오버로딩 : 메서드 이름 같아도 매개 변수 다르면 다른 메서드로 취급
		// 같은 이름의 메서드 여러게
	}
	
	// 추가
	public double getDNum() {
		//super.getStr();
		//this.getStr();		// 오버라이딩(재정의) -> 우선순위는 this가 더 높다
		return dNum;
	}
}