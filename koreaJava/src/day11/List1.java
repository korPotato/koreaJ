package day11;

import java.util.ArrayList;

public class List1 {
	//현업에서는 뒤에 숫자 붙이는걸 안좋아함
	// 알아보기 쉽게 고민해서 이름을 지어라
	public static void main(String[] args) {
		// ArrayList, HashMap(HashSet(잘사용안함))\
		// 컬렉션 : List, Set, Map
		
		// List : 순서대로 추가
		// Map : 순서없이 추가, 중복허용 X
		// Set : 순서가 아닌 키워드로 추가
		
		ListClass1 lc1 = new ListClass1();
		lc1.go();
		
		
		
		
	}
}

class ListClass1{
	
	public void go() {
		// int ==> INteger
		// double ==> Double
		ArrayList<Integer> arr1 = new ArrayList<>();		// <Integer> : int 자료형을 보관하게끔 선언
		// 배열 
		int num[] = new int[10];		// int ==> Integer
		
		
		// 값 대입
		num[0] = 1;
		arr1.add(1);
		
		num[1] = 2;
		arr1.add(2);
		
		num[2] = 3;
		arr1.add(3);
		
		// 수정
		num[1] = 22;
		arr1.set(1, 22);
		
		// 삽입 1번방과 2번방 사이에 넣고싶다
		arr1.add(2, 123);
		for(int i=num.length;i<2;i--) {
			if(i != num.length-1) {
				num[i]= num[i-1];				
			}
		}
		num[2] = 123;
		
		
		
		// 1번방을 없애고 싶다.
		arr1.remove(1);			// ㅇarraylist면 리모브로 수정할수 있다.
		// 아니라면 밑에 처럼 복잡하고 힘들게 수정해야한다.		
		for(int i=1;i<num.length;i++) {
			if(i != num.length-1) {
				num[i] = num[i+1];				
			}
		}
		num[num.length-1] = 0;
		
		// 배열을 전체 보기 
		for(int i=0;i<num.length;i++) {
			if(num[i] !=0)
			System.out.println(num[i]);
		}
		// ArrayList 전체보기
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
		}
}
