package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Runnable2 {
	public static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) {
		// 입력을 다 받고 나서 전체 조회 수행
		
		MyClass1 mc1 = new MyClass1();		// Thread
		Myclass2 mc2 = new Myclass2();		// Runnable
		Thread t2 = new Thread(mc2);
		
		mc1.start();
		try {mc1.join();} catch (Exception e) {e.printStackTrace();}
		t2.start();
	}
}

class MyClass1 extends Thread{
	// scanner로 입력을 받는 문자열을 ArrayList에 추가
	// 추가할 문자열을 입력하세요(0을 입력하면 종료)>>>
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		while(true) {
			System.out.println("추가할 문자열을 입력하세요(0을 입력하면 종료)>>>");
			String str = sc.nextLine();
			if(str.equals("0")) {
				return;			// 함수 종료
			}else {
				Runnable2.arr.add(str);
			}
		}
	}
}

class Myclass2 implements Runnable{
	// 전체 조회
	@Override
	public void run() {
		for(int i=0; i<Runnable2.arr.size();i++) {
			System.out.println(Runnable2.arr.get(i));
		}
	}
}
