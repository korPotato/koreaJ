package Myday;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		//연습문제 3
		/*
		 주급계산기
		 근무신간과 시간당 급여액을 입력받아 주급을 계산하는 프로그램을 작성하시오
		 
		 바꿔서 급여 계산기로 만들었슴
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하루 근무시간 : ");
		int time = Integer.parseInt(sc.nextLine());
		System.out.println("시급 : ");
		int time_pay = Integer.parseInt(sc.nextLine());
		
		System.out.println("며칠 일 하였습니까 >>");
		int day = Integer.parseInt(sc.nextLine());
		
		int week = (time * time_pay) * day;
		System.out.println("급여 : "+week+"원");
		
		
	}
}
