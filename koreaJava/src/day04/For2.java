package day04;

public class For2 {
	public static void main(String[] args) {
		
		//for 안에서 만든 int(공간)은 없어진다.
		// 밖에서 만든 공간은 남아있어서 다른 조건에서 다시 사용 가능
		//for (;;)로도 만들수 있다, 무한반복을 한다
		for(int i=0; i<10; i++) {
			System.out.println(i+"번");
		}
		
		
	}
}
