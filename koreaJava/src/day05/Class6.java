package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
	
		홍길동.name = "홍길동";
		홍길동.age = 90;
		홍길동.gender = "남성";
		홍길동.height = 180;
		이순신.name = "이순신";
		이순신.age = 60;
		이순신.gender = "남성";
		이순신.height = 182;
		
		
		홍길동.정보보기();
		홍길동.인사하기();
		
		
		이순신.정보보기();
		이순신.인사하기();
	}
}

class Person{
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	int height;
	// 정보보기 (이름, 나이, 성별, 키 출력)
	// getInfo
	public void 정보보기() {
		System.out.println("이름: "+name+", 성별: "+gender+", 나이: "+age+", 키: "+height+"cm");
	}
	
	
	// 인사하기 (홍길동이 인사합니다)
	// setInfo
	public void 인사하기() {
		System.out.println(name+"이 인사합니다.");
		
	}
	
	
}