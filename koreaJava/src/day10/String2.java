package day10;

public class String2 {
	public static void main(String[] args) {
		MyString2 ms2 = new MyString2(); 
		ms2.go();
	}
}

class MyString2{
	private String str;
	// private는 멤버 변수나 함수를 위해서만 사용한다.
	// 지역변수 등등에서는 사용하지 않는다.
	public void go() {
		String str1 = "Hello World";
		System.out.println(str);		// String의 기본값 == null
		
		// String 클래스에서 지원해주는 메서드
		System.out.println(str1.equals(str)); 		// false | frue
		System.out.println(str1.charAt(6));	  		// str1안의 문자열 6번쨰를 출력한다. 
		System.out.println(str1.indexOf("Wor")); 	// Wor의 첫번쨰 글자의 방번호를 변환(알려줌)
		System.out.println(str1.length()); 			// 문자열의 길이를 알려준다.
		System.out.println(str1.startsWith("Hello")); 		// Hello로 시작하는 문자열인지 조사 true | false
		System.out.println(str1.contains("world"));			// world 문자열을 "포함" 하고 있는지 조사 한다 true | false
		System.out.println(str1.substring(6,10+1));			// 6번방 ~ 10번방 의 문자열을 잘라내서 출력해준다. (World)
		System.out.println(str1.replace("Hello","Hi"));    	// Hell 문자열을 찾아서 "Hi"로 '교체'
		
	}
}

