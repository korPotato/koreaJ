package Myday;

import java.util.Scanner;

public class BoxSize1 {
	public static void main(String[] args) {
		
//		정사각형: 변이 네 개인 도형, 모든 변의 길이가 같고 네 각이 모두 직각이다(90도).
//		직사각형: 변이 네 개이며 마주 보는 변의 길이가 같고 네 각이 모두 직각이다.		
//		마름모: 변이 네 개이며 마주 보는 변의 길이가 같다. 이 도형은 모든 각도가 직각이 아니어도 된다. 대신 마주 보는 각도가 같아야 한다.
		
		
		// 1. 직사각형 : 넓이 = 밑변 * 높이
			Scanner sc = new Scanner(System.in);
			
			System.out.println("사격형의 밑변 : ");
			int bott = Integer.parseInt(sc.nextLine());
			System.out.println("사각형의 높이 : ");
			int hei = Integer.parseInt(sc.nextLine());
			
			int sq = bott * hei;
			System.out.println("사각형의 넓이 : "+sq+"cm제곱");
	}
}
