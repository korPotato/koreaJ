package day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		
		//#3
		//수도맞추기
		//무한반복 -> 입력 -> 맞추면 break'정답'띄워주고 종료
		// 틀리면 '틀렸습니다' 하고 다시 입력
		Scanner sc = new Scanner(System.in);
		String answer = null;
		while(true) {
			System.out.println("대한민국의 수도는?");
			answer = sc.next();
			// 서울
			// answer.equals("서울")
			
			 if(answer.equals("서울")) 					// String문자열이 == 사용이 불가 -> .equals
			 {
				System.out.println("정답");
				break;
			 }else {
				 System.out.println("틀렸습니다.");
				 continue;
			 }
			
		}
		
		
	}
}
