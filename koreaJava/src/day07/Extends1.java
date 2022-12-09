package day07;

// 상속
public class Extends1 {
	public static void main(String[] args) {
		MyString ms = new MyString();
		ms.setNum(3,-4);
		ms.getPlus();		// 저장된 두 수를 더함
		ms.getDiv();
		
		// 요구 1. 두 수를 더하긴 더하지만 우리는 마이너스 값이 없다
		MyStringEx mse = new MyStringEx();
		mse.setNum(3,-4);
		mse.getPlus();
		mse.getDiv();
		
		// 요구 2. 우리는 플러스하면 회사 로고가 보여야 한다
		
		MyStringLogo msl = new MyStringLogo();
		msl.setNum(3, -4);
		msl.getPlus("==logo==");
		msl.getDiv("==logo==");
		// 버그 | 추가사항
		// 추가사항 : 나눗셈
		
		// 위 상황 처럼 문제 점들을 고치려면 여러번 수정을 거쳐야 하는 부편함이 있다.
		// 그래서 ==> 상속 extends 
	}
}

class MyString{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	// 나눗셈 추가
	public double getDiv() {
		if(num2 == 0) {
			return 0.0;
		}
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
}

class MyStringEx{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		if(num1 < 0) {
			num1*= -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	public double getDiv() {
		if(num2 == 0) {
			return 0.0;
		}
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
}

class MyStringLogo{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int getPlus(String logo) {
		System.out.println(logo+(num1+num2));
		return num1+num2;
	}
	public double getDiv(String logo) {
		if(num2 == 0) {
			System.out.println(logo);
			return 0.0;
		}
		System.out.println(logo+((double)num1/num2));
		return (double)num1/num2;
	}
}
