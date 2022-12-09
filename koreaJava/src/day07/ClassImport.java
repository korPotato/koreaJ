package day07;

public class ClassImport {
	// 접근권한제어자 --> 캡슐화
	// 멤버변수는 private, 메서드는 public	
	// 변수를 직접 적으로 쓰지 말고 함수를 만들어서 써라
	private String str;
	private int num;
	// 생성자 : 객체화 할 때 사용되는 메서드
	// 클래스를 사용 하기 전에 사전에 필요한 작업들을 생선자를 통해 하겠다
	// 사용하는 사람이 객체화를 하는 순간에 이 생성자가 사용 한다
	// 생성자의 이름은 클래스명과 같다
	ClassImport(){
		System.out.println("객체화 성공!");
	}
	// 프라이빗으로 변수를 만들면 퍼블릭 get,set를 자동으로 만들수 있다
	// private 변수 - > 마우스 우클릭 -> Source -> Generate Getters and Setters
	// alt+shift+s (Source) -> Generate Get and Set
	
	public String getStr() {	// get :변수로 직접 사용하지 말고 이 메서드를 사용해라
		return str;
	}

	public void setStr(String str) {	// set : 변수에 값을 대입할 떄 이 메서드를 통해서 해라
		this.str = str;
	}
	// getter와 setter를 직접 만들기
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
