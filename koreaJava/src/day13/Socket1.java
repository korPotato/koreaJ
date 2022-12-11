package day13;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Socket1 {
	public static void main(String[] args) {
		// 한쪽이 접속이 안되는 경우 방화벽 문제인 경우도 있다.
		// 소켓 : 프로그램 간 메시지 주고받기
		//MyServer ms = new MyServer();
		MyClient mc = new MyClient();
				
		// 소켓통신을 하려면 같은 네트워크를 사용해야함
		// 여러군데서 접속을 하게 하려면 클라우드 또는 웹 호스팅을 해야함(월드와일드웹에 등록을 해야함)
		// ipconfig
		// ip : 192.168.3.13
		//ms.go(19000);
		mc.go("192.168.3.20", 21000);		
	}
}
//소켓이라는 라이브러리를 통해서
//TCP/ IP통신을 Socket으로 진행
class MyServer {
	// 들어오는 메시지 (수신)
	InputStream is = null;
	ObjectInputStream ois;
	// 나가는 메시지 (송신)
	OutputStream os;
	ObjectOutputStream oos;
	// 서버로 설정
	ServerSocket serverSocket;
	// 메시지를 직접적으로 처리할 소켓을 추가생성 한다.
	Socket socket;
	String msg;
	public void go(int port) {		
		// 서버는 컴퓨터의 IP와 설정한 PORT로 연결을 시작
		// IP는 주소 port는 사람
		
		// 문을 연다
		try {
			serverSocket = new ServerSocket(port);			// 서버를 열었다
			// 수신 대기
			while(true) {		
				System.out.println("수신 대기 중..");
				socket = serverSocket.accept();			// 누군가 들어올 때까지 대기상태
				System.out.println("접속IP: "+socket.getInetAddress());
				
				// 누군가 접속해서 메시지를 보내면
				is = socket.getInputStream();
				ois = new ObjectInputStream(is);
				
				os = socket.getOutputStream();
				oos = new ObjectOutputStream(os);
				
				// 메시지 수신 완료
				msg = (String)ois.readObject();
				System.out.println("클라이언트 : "+msg);
				
				String respon = "서버가 준 메시지 : "+msg;
				oos.writeObject(respon);  		// 클라이언트로 백
				
				socket.close();	 				// 연결을 종료한다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}			
		
		
	}
	
	
	
}

class MyClient{
	// 들어오는 메시지 (수신)
	InputStream is = null;
	ObjectInputStream ois;
	// 나가는 메시지 (송신)
	OutputStream os;
	ObjectOutputStream oos;

	// 메시지를 직접적으로 처리할 소켓을 추가생성 한다.
	Socket socket;
	String msg;
	Scanner sc = new Scanner(System.in);			// 콘솔 입력을 위해(임시_)
	
	// 어느 주소의 어느 사람에게 갈것인지.
	public void go(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			// 메시지를 내보낼 준비(송신준비)
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			// 받을 준비 (수신준비)
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			
			// 소켓 통신
			System.out.println("보낼 메시지>>>");
			msg = sc.next();
			oos.writeObject(msg); 		// 메시지 송신
			
			String respon = (String)ois.readObject();			// 메시지 수신 완료
			System.out.println("서버 응답: "+respon);				
			
			socket.close(); 		// 소켓 연결을 끊는다
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}