package day10;

public class Enum1 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(0);
		Student1 st2 = new Student1(2);
		
//		Student2 st3 = new Student2(SchoolType.초등학교);
//		Student2 st4 = new Student2(SchoolType.대학교);
		st1.go();
		st2.go();
//		st3.go();
//		st4.go();
		
		MyType[] type = MyType.values();		// 각 방에 하나씩 넣음 [타입1][타입2][타입3][타입4]
		// c 언어 처럼 사용 하는 for문
		for(int i=0;i<type.length;i++) {
			System.out.println(type[i]+", 번호는"+type[i].ordinal());
		}
		
		// 빠른 for문
		// 파이썬 처름 사용 하는 for문
		for(MyType t : type) {
			// t == type[i]
			System.out.println(t+", 번호는"+t.ordinal());
		}
	}
	
}

// 숫자로 쓰면 나중에 보기 힘드니까 이름을 부여함.
enum MyType{
	// 클래스 밖에도 만들수 있다.
	타입1, 타입2, 타입3, 타입4
}

class Student1{
	
	private int SchoolType;
	
	public Student1(int num){
		SchoolType = num;
	}
	
	public void go() {
		if(SchoolType==0) {System.out.println("초등학생");}
		else if(SchoolType == 1) {System.out.println("중학생");}
		else if(SchoolType == 2) {System.out.println("고등학생");}
		else if(SchoolType == 3) {System.out.println("대학생");}
		
	}
}

class Student2{
	enum SchoolType{
		초등학교, 중학교, 고등학교, 대학교
		// 초등학교 = 0, 중학교 == 1, 고등학교 == 2, 대학교 == 3
	}
	
	SchoolType school;
	public Student2(SchoolType school) {
		this.school = school;
	}
	
	public void go() {
		if(school == SchoolType.초등학교) {System.out.println();}
//		else if(school == SchoolType.1) {System.out.println("중학생");}
//		else if(school == SchoolType.2) {System.out.println("고등학생");}
//		else if(school == SchoolType.3) {System.out.println("대학생");}
		
	}
}