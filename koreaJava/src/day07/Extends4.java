package day07;

public class Extends4 {
	public static void main(String[] args) {
//		Human hm = new Human();
//		Member mb = new Member();
//		hm.setStr("홍길동");
//		hm.setNum(24);
//		mb.setNum2(22458);	
//		mb.print("운동선수입니다.");
		
		Human human = new Human("휴먼", 12);
		// 사람 정보를 출력
		System.out.println("이름: "+human.getName()+", 나이: "+human.getAge());
		
		
		Member member = new Member("멤버", 13, 111);
		// 회원 정보를 출력
		member.memberInfo();
		
		
		
	}
}

// 사람 Human
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터세터
class Human{
	private String name;
	private int age;
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

/*
 		내가 시도 해 본것.
  class Human{
 
	protected String str;
	protected int num;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		System.out.println("이름 : "+str);
		this.str = str;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		System.out.println("나이 : "+num);
		this.num = num;
	}
}*/




// 회원 Member
// +회원번호
// 생성자를 통해서 정보를 입력
// 회원번호 게터세터
// +회원소개
class Member extends Human {
	private int memNo;
	public Member(String name, int age, int memNo) {
		super(name, age);			// 부모의 생성자를 사용
		this.memNo = memNo;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public void memberInfo() {
		 System.out.println("이름: "+this.getName()+", 나이: "+this.getAge()+", 회원번호: "+this.getMemNo());
		 
	}
}



/*
 		내가 시도해 본것. 
   class Member extends Human{
	protected int num2;

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		System.out.println("회원번호 : "+num2);
		this.num2 = num2;
	}
	
	public void print(String str1) {
		System.out.println("소개 : "+str1);
	}
	
	
}*/

