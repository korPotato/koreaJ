package day12;

public class Thread1 {
	public static void main(String[] args) {
		
		// 자바 문제 시
		// 배열 사용법	- 방 5개를 만들면 4번방까지만 있다 
		// ( 방5개를 만들고 5번방을 사용 하는건 잘못, 0~4 까지 5개 이므로 4번방이 끝)
		
		// 오버로딩과 오버라이딩의 차이
		// 오버로딩 - 함수이름 같지만 매게 변수 다른거로 여러게 만들수 잇다
		// 오버라이딩 - 상속에서만 사용되고, 부모의 있는것을 내가 재 정의(수정)한다.
		
		// 컬렉션 List, Set, Map의 차이
		// List : 삭제 및 삽입이 쉽고 순서를 갖고 있음
		// Set : 중복 안됨, 순서가 없음, Iterator
		// Map : 키와 값으로 이루어짐, 순서가 아닌 키로 관리
		
		
		// 프로세스와 쓰레드의 차이
		
		// 프로그램 : 운영체제에 설치된 (개발자가 만든 파일 (.exe))명령문의 집합체
		// 컴퓨터에게 주어지는 처리 방법과 순서를 기술한 일련의 명령문(코드)의 집합체
		
		// 프로세스 : 실행 중인 프로그램 (프로그램이 프로세스에 등록됨
		// 컴퓨터에서 연속적으로 실행되고 있는 컴퓨터 프로그램
		// 쓰레드 : 프로세스 내에서 실제로 작업을 수행하는 주체
		
		// main() : 주쓰레드
		// 쓰레드를 추가하고 다루는 방법
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);			// 1000ms 동안 쓰레드 중지시켜라
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
		}
	}
}

class MyThread1{
	// 뭘 만들던 main만 실행됨
	String str;
	int num;
	double dNum;
	public void go() {
		
	}
	public int numnum(int num) {
		this.num = num;
		System.out.println(num);
		return num;
	}
}
