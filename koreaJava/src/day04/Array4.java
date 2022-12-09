package day04;

import java.util.Scanner;

public class Array4 {
		public static void main(String[] args) {
			// 입력받은 나라의 수도를 알려주는 프로그램 만들기
			// 국가, 수도
			
			// 어느 나라의 수도가 궁금하신가요?
			// '미국'
			// 미국의 수도는 워싱턴 입니다.
			//위치기억하는 변수1 반복문으로 위치 백업
			Scanner sc = new Scanner(System.in);
			
					
			String nations[] = {"한국","대한민국","미국","중국","일본",};
			String cities[] = {"서울","서울","워싱턴","베이징","도쿄"};
			String in;				// 사용자로부터 입력받은 값을 저장할 변
			int idx;				// 입력받은 문자열의 값과 동일한 문자열의 위치르 백업해둘 변수
			
			System.out.println("어느 나라의 수도가 궁금하신가요?");
		
			for(int i=0; i<nations.length;i++) {
				if(nations.equals("한국")) {
					System.out.println("한국의 수도는 서울입니다");
				}
			}
			
			
			
			
			
			
			
			
		
			
					
					
		}
}
