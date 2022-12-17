package Myday;

import java.util.Scanner;

public class BoxSize2 {
	public static void main(String[] args) {
		
//		정사각형: 변이 네 개인 도형, 모든 변의 길이가 같고 네 각이 모두 직각이다(90도).		밑변 * 높이
//		직사각형: 변이 네 개이며 마주 보는 변의 길이가 같고 네 각이 모두 직각이다.			한변 * 한변
//		마름모: 변이 네 개이며 마주 보는 변의 길이가 같다. 이 도형은 모든 각도가 직각이 아니어도 된다. 대신 마주 보는 각도가 같아야 한다.    
// 			넓이 = 한 대각선의 길이 x 다른 대각선의 길이/2 또는 A = (d1 × d2)/2
		
		//정사각형 : 넓이 = 한변의 길이 * 한변의 길이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변의 길이를 입력하세요>>>");
		double i = Integer.parseInt(sc.nextLine());
		i *= i;
		System.out.println("정사각형의 넓이 : "+i);
	}
}
