package day10;

public class String3 {
	public static void main(String[] args) {
		// 객체화
		MyString3 ms3 = new MyString3();
		ms3.go();
	}
}

class MyString3{
	private String str = "123";			// null
	private int num;			// 0
	private double dNum;		// 0.0
	
	public void go() {
		 // 기본 자료형끼리의 형변환 ()
		dNum = (double)num;
		num = (int)dNum;
		
		// String 클래스의 형변환
		num = Integer.parseInt(str); 		// String -> int 로 변환한다.
		dNum = Double.parseDouble(str);   	// String -> double로 변환한다.
		
		str = Integer.toString(num); 		// int -> String으로 변환
		str = Double.toString(dNum);		// double -> String으로 변환
		
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(str);
		
	}
}
