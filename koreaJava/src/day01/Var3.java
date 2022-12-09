package day01;

public class Var3 {
	public static void main(String[] args) {
		// 변수(variable) = 저장공간
		// 저장공간에도 종류가 많다.\
		// 숫자형, 소수점있는숫자형, 글자형,....
		
		String 변수1 = "저장공간1";
		//13-4;		// 컴퓨터는 얘가 13-4인지 9인지 모른다
		// 주소, 뺴기, 다른의미인지 컴퓨터는 알수없다, 혹은 개발자 실수인지 모르겠다.
		// 그래서 각 변수에 '형태'를 정한다.
		
		// 자료형(type)
		// 숫자를 저장하는 공간이라면
		int 뺼셈 = 13-4;
		// 글자를 저장하는 공간
		String 주소 = "13-4";
		String 휴대폰 = "010-000-0000";
		// 소수점있는 숫자
		double 파이 = 3.14;
		
		System.out.println(뺼셈);
		System.out.println(휴대폰);
		System.out.println(파이);
		
		// = : 같다는 의미가 아니다, 오른쪽에 있는 값을 왼쪽 공간에 넣는다는 의미
		// 변수(공간)을 처음 만들때는 자료형을 붙여줘야함
		// 이미 만들어진 변수에 다른 값을 넣거나 사용할땐
		// 자료형없이 적어줘야함
		
		휴대폰 = "010-6546-6544"; 		// 이미 있는 휴대폰이라는 공간에 값을 덮어씌움
		System.out.println(휴대폰);
		
		// 공간을 처음 만들땐
		String var1;		// 공간만 만듦 (선언)
		String var2 = "hi";		// 공간만들면서 값도 넣어줌 (초기화)
		var2 = "hello";			// 이미 잇는 공간에 값을 넣음 (대입)
		
		
		// 변수로 이름, 생년월일, 키를 저장해놓고 사용
		String name = "김병철";
//		String birth = "1992년 12월 13일";
		int year = 1992, month = 12, day = 13;
		double height = 174.6;
		System.out.println("이름 : "+name);
		System.out.println("생일 : "+year+"년 "+month+"월 "+day+"일");
		System.out.println("키 :"+height+"cm");
		
		
	}
}
