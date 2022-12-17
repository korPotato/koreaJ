package Myday;

import java.util.Scanner;

public class Won1 {
	public static void main(String[] args) {
		// 연습문제2
		/* 10만원 짜리 수표가 들어가는 자판기를 만들려고 합니다.
		 	자판기에 수표를 입력하면 거스름 돈을 계산하여 정확하게 필요한 화폐들의 개수를
		 	계산하여야 합니다. 이를 계산하는 프로그램을 작성하시오.
		 	예시)
		 	얼마를 넣으시겠습니까>>>
		 	50000원 지폐 0개
		 	10000원 지폐 0개
		 	5000원 지폐 0개
		 	1000원 지폐 0개
		 	500원 동전 0개
		 	100원 동전 0개
		 	50원 동전 0개
		 	10원 동전 0개
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("얼마를 넣으시겠습니까?>>>");
		
		int i = Integer.parseInt(sc.nextLine());
		
		System.out.println("50000원 지폐"+(i/50000)+"개");
		i=i%50000;
		System.out.println("10000원 지폐"+(i/10000)+"개");
		i=i%10000;
		System.out.println("5000원 지폐"+(i/5000)+"개");
		i=i%5000;
		System.out.println("1000원 지폐"+(i/1000)+"개");
		i=i%1000;
		System.out.println("500원 동전"+(i/500)+"개");
		i=i%500;
		System.out.println("100원 동전"+(i/100)+"개");
		i=i%100;
		System.out.println("50원 동전"+(i/50)+"개");
		i=i%50;
		System.out.println("10원 지폐"+(i/10)+"개");
		i=i%10;
		
	}
}
