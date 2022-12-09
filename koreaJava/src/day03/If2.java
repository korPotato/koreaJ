package day03;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		// 출력 (결과를 사용자에게 보여줌)
		System.out.println("출력syso");
		
		// 입력 (사용자가 값을 제공)
		Scanner sc=new Scanner(System.in);
		
		// 입력을 받으려면 받을 변수(공간)가 있어야한다.
		// 숫자를 입력받고 싶으면 숫자변수
		// 글자를 받고 싶으면 문자열변수 등.. 초기화 값을 만들어야 한다.
		int 숫자1 = 0;
		String 글자1 = null;
		double 숫자2 = 0.0;
		
		// 입력받기 (키보드)
		System.out.println("정수를 입력하세요 : ");
		숫자1 = sc.nextInt();
		System.out.println("문자열을 입력하세요 : ");
		글자1 = sc.next();
		System.out.println("실수를 입력하세요 : ");
		숫자2 = sc.nextDouble();
		
		System.out.println(숫자1);
		System.out.println(글자1);
		System.out.println(숫자2);
		
		if(숫자1 == 10) {
			System.out.println("입력한 숫자는 10입니다.");
		} 
		if(숫자2 == 3.14) {
			System.out.println("입력한 실수는 3.14입니다.");
		}
		
		if(글자1.equals("비교대상") ) {
			// String
			// 문자열은 숫자와 틀리게 비교를 한다.
			// 문자열은 변수 .(점)equals(이퀄스)를 사용해야 한다.
			// 변수.equals() 이퀄스 소괄호안의 내용과 비교를 하게된다. 
			System.out.println("입력한 문자열은 비교대상 입니다.");
		}
		
		
	}
}
