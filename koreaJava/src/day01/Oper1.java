package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 글자, 숫자, 소수점있는숫자
		// String : 글자(문자열)
		// int : 숫자	(정수)
		// double : 소수점 있는 숫자 (실수)
		
		// 자료형 변수명;
		int 숫자1 = 3;
		int 숫자2 = 2;
		
		// 프로그래밍에서는 연산이 가능 ( +, -, *, /,....)
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println(1/1);
		
		// 연산은 변수끼리도 가능	(저장되어있는 값을 연산한다.)
		
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		
		// 글자는 더하기만 가능하다
		String 글자1 = "안녕";
		String 글자2 = "하세요!";
		System.out.println(글자1+글자2);
		
		// 숫자는 더하기, 뺴기, 곱하기, 나누기 등등 여러가지 가능하다.
		// 우선순위높음 : *, / (곱하기 나누기)
		// 우선순위낮음 : +, - (더하기 뺴기)
		// 우선순위낮은것을 먼저 하려면 (소괄호)로 감싸줘야한다.
		
		// 0. 문자열을 합치는 덧셈
		String str = "Hello "+"World";
		System.out.println(str);
		// 1. 덧셈
		int num = 1+1;
		System.out.println(num);
		// 2. 뺄셈
		int num1 = 2-1;
		System.out.println(num1);
		// 3. 곱셈
		int num2 = 3 * 3;
		System.out.println(num2);
		// 나눗셈
		int num3 = 9 / 3;
		System.out.println(num3);
		// 나머지 연산자
		int num4 = 10 % 3;
		System.out.println(num4);
		
		// 합계와 평균 구하기 
		int 국어 = 55;
		int 영어 = 44;
		int 수학 = 68;
		int 합 = 0;
		합 = 국어 + 영어 + 수학;
		double 평 = 합 / 3.0;		// 정수 ÷ 실수 = 실수		// 뒤 정수에 실수를 줘야 실수값이 제대로 나온다.혹은 정수 앞에 (double)실수코드를 넣어줌으로 실수로 계산한다. 
		System.out.println("총점 : "+합+"점");
		System.out.println("평균 : "+평+"점");
		// 숫자 즉 정수는 소수점이 없는 값이다. 소수점이 생긴다면 자르고 출력한다.(자료형)
		
		// 자료형 변환 : 앞에다가 (자료형)
		System.out.println((int)3.14);
		System.out.println(3.14);
		System.out.println(3);
		System.out.println((double)3);
	}
}
