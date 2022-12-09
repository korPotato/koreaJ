package day12;

public class Runnable1 {
	public static void main(String[] args) {
		// 스레드 추가 생성법1 : Thread 스레드를 상속한다
		
		// class My extends ex implements Runnable
		// 스레드 추가 생성법2 : Runnable을 상속하고 사용하는 곳에서 Thread를 객체화한다
		
		MyRunnable1 mr1 = new MyRunnable1(); 	//쓰레드상속이불가능하다면// 러너불로 만들고
		Thread t1 = new Thread(mr1);				// 쓰레드 객체화하고
		t1.start();									// 그 쓰레드에 스타트로 출력
		
		MyThread7 mt7 = new MyThread7();		// 보통 쓰레드 사용
		mt7.start();
	}
}

class ex1{}

// 자바 : 다중상속이 불가능, 이미 다른걸 상속받고 있으면 Thread 상속이 불가능
class MyRunnable1 extends ex1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i< 10; i++) {
			System.out.print(i+" ");
			try {Thread.sleep(10);} catch (Exception e) {}
		}
		
	}
	
}


class MyThread7 extends Thread{
	@Override
	public void run() {
		for(int i=0; i< 10; i++) {
			try {Thread.sleep(1100);} catch (Exception e) {}
			System.out.print(i+" ");
		}
	}
}
