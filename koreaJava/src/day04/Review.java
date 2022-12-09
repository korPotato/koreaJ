package day04;

public class Review {
	public static void main(String[] args) {
		String name = "sung";		// 문자열 변수
		int age = 33;				// 정수 변수
		double height = 177.0;		// 실수 변수
		boolean marry = false;		// 불린 변수 (참거짓)
		// 변수 : 저장공간
		
		// 조건문 : if, switch 	(조건이 맞으면 {}를 실행)
		// if~else if~else
		// switch~case~break
		
		if(age >= 20) {
			// 20이상
			// 첫번쨰 조건문에서 해당하므로 다음으로 안넘어감, 
			System.out.println("성인");
		}else if(age >= 0) {
			// 20미만, 0이상
			System.out.println("미성년자");
		}else {
			// 0미만
			System.out.println("?");
		}
		// false == 0, true == 0이외의 숫자
		
		// switch : 소괄호에 있는 내용과 case 옆에 있는 내용이 같으면 해당 라인부터 시작, break만 종료
		
		switch(age/10) {
		case 0:
			System.out.println("어린이");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
			default:
				System.out.println("30대 이상");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
