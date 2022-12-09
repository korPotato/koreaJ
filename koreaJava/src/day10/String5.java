package day10;

public class String5 {
	public static void main(String[] args) {
		MyString5 ms5 = new MyString5();
		ms5.go();
	}
}

class MyString5{
	// 어떤 기계들의 프로그램끼리 메시지를 주고받을 때
	// Ex) 카페 에서 키오스크 혹은 포스기 등에서 주고 받을 경우
	// 가겨, 제품명, 수량  ==> 한번에 (하나의 문자열) ==> 패킷화
	
	private String packet1 = "SAname=A01price=003000num=001ED";		// 아메리카노 1잔 3000원
	private String packet2 = "SAname=A02price=003500num=002ED";		// 카페라뗴 2잔 3500원
	private String packet3 = "SAname=A03price=004000num=004ED";		// 카페모카 4잔 4000원
	
	int price, num, menu_num, price_sum;
	String name;
	
	public void go() {
		parsing(packet1);
		parsing(packet2);
		parsing(packet3);
		
	}
	

	public void parsing(String packet) {
		// packet1 ==> 주문내용 : 아메리카노 1잔, 300원
		//if(packet1.charAt(7))
		switch(packet1.charAt(7)) {
		case 'A':				// 커피메뉴
			menu_num = Integer.parseInt(packet.substring(8, 10));
			num = Integer.parseInt(packet.substring(26,29));
			price = Integer.parseInt(packet.substring(16, 22));
			if(menu_num == 1){name = "아메리카노";}
			else if(menu_num == 2) {name = "카페라떼";}
			else if(menu_num == 3) {name = "카페모카";}
			else if(menu_num == 4) {name = "에스프레소";}
			break;
		case 'B':				// 디저트 메뉴
			break;
		case 'C':				// 기타메누
			break;
			default:
				System.out.println("해킹");
		}
		price_sum = num*price;
		
		System.out.println("주문내용 : "+name+" "+num+"잔, "+price_sum+"원");
	}
	
	
	public void parsing2() {
		// packet2 ==> 주문내용 : 카페라떼 2잔, 7000원
		
	}
	
	public void parsing3() {
		// packet3 ==> 주문내용 : 카페라떼 4잔, 16000원
	
	}

}