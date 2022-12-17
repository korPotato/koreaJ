package Myday;

import java.util.Scanner;

public class Meter1 {
	public static void main(String[] args) {
		// 연습문제1
		// meter를 입력받아 km와 m로 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거리를 입력하세요>>>");
		
		int i = Integer.parseInt(sc.nextLine());
		int k = 0;
		
		if(i<1000) {
			System.out.println(i+"m");
		}else {
			k = i/1000;
			System.out.println(k+"km");
		}
		
		
	}
}
