package day01;

public class Oper2 {
	public static void main(String[] args) {
		String 글자1 = "Hello";
		String 글자2 = "Java";
		String 글자 = 글자1 + 글자2 ;
		
		
		System.out.println(글자);
		
		// 1. 칸띄우기 \t
		System.out.println("일\t이");  // 칸 띄우기
		// 칸 띄우기 = 역슬래시+t ' \t '
		
		// 2. 한줄 띄우기 \n
		System.out.println("안녕\n하세요");
		
		// 3. 문자열에서 ""큰따옴표를 사용 : \"
		System.out.println("아무개는 말했다. \"반가워!\".");
	}
}
