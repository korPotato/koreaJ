package day04;

public class Flow2 {
		public static void main(String[] args) {
			// 제어문 : 조건문, 반복문, 기타 제어문
			// 조건문 : if, switch
			// 반복문 : while, for
			// 기타 제어문 : break, continue, goto
			
			// break : 반복문을 강제 종료 (switch로도 가능함)
			// continue : 반복문 1회성 취소 (for과 같이 많이 사용한다고함)
			for(int i=1;i<6;i++) {
				if(i == 3) {
					break;				// i가 3과 같다면 반복문 종료
				}
				System.out.println(i+"번");
			}
			System.out.println("프로그램 종료");	//3과 같아지는 순간 종료이므로 2번 까지만 출력
			
			
			for(int i=1;i<6;i++) {
				if(i ==3) {
					continue;			// i가 3과 같다면 밑에 있는 코드는 실행하지 않고 위로 올라감(1회성 취소)
				}
				System.out.println(i+"회");
			}
			System.out.println("프로그램 종료2");
		}
}
