package day13;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : ArrayList(자바에서 만든 배열), HashMap(순서->키), Set(중복X, 순서X)
		// 쓰레드 : Thread, Runnable	( 둘다 상속을 받아서 사용해야 한다.)
		MyThread t1 = new MyThread();
				
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1);
				
		t1.start();				// 쓰레드 시작
		try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}		// join 외에 다른 쓰레드는 대기
		t2.start();			 	// 쓰레드 시작
	}
}

class MyThread extends Thread{
	@Override
	public void run() {			// 쓰레드 구현
		System.out.println("여기있는 코드가 실행");
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {			// 쓰레드 구현
		System.out.println("인터페이스 재정의");
	}
	
}