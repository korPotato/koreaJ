package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 조건문 (예제)
		// 국어, 영어, 수학
		// 각각 40점 이상이고
		// 총합ㅇ 150 이상이면
		// 합격
		// 그 외에는 불합격
		
		
		int 국어, 영어, 수학, 총점;
		Scanner sc =new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요>>>");
		국어 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요>>>");
		영어 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요>>>");
		수학 = sc.nextInt();
		총점 = 국어 + 영어 + 수학;
		
		
//		if(국어 >= 40 && 영어 >= 40 && 수학 >=40 && 총점 >= 150) {
//			System.out.println("총점 : "+총점+"점"+" 합격입니다.");
//		}else {
//			System.out.println("총점 : "+총점+"점"+" 불합격입니다.");
//			
//		}
		
		if (총점 >= 150) {
			if(국어 >= 40 && 영어 >= 40 && 수학 >=40) {
				System.out.println("합격");
			}else {
				System.out.println("과락");
			}
		}else {
			System.out.println("불합격");
		}
	}
}
