package day02;

public class Oper7 {
	public static void main(String[] args) {
		// 삼항연산자 : 조건에 따라서 프로그램 동작을 다르게 한다
		int num = 3;
		String result = (num > 2) ? "맞다" : "틀리다";
		// ? 기준으로 앞에는 조건을 적고 맞다면 첫번째를 실행 틀리면 뒤에것을 실행
		System.out.println(result);
		// 자바는 이렇게  잘 실행을 하지 않는다
	}
}
