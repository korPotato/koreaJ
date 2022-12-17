package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn1 {
	public static void main(String[] args) {
		// 데이터베이스 라이브러리 추가하기
		// 프로젝트 우클릭 -> properties -> java build path -> classpath -> add external jars... -> mysql-connector-j-8.0.xx.jar (혹은 ojdbc6.jar 같은 다른 db)
		// MySQL 설치 경로 : C:\\Program Files (x86)\\MySQL\\Connector J.8.0
		
		
		MyDB1 db = new MyDB1();
		
//		db.connect();
//		db.insert();
		
//		db.connect();
//		db.update();
		
//		db.connect();
//		db.delete();
		
		db.connect();
		db.select();
		
	}
}
// DB 라이브러리 실행
class MyDB1{
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	
	public MyDB1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");				// Mysql 8버전 (5버전 이라면 cj 뺴야한다)
		} catch (ClassNotFoundException e) {e.printStackTrace();
		}
		// DB접속
	}
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	// CRUD : Create, Read, Update, Delete - 추가하고, 읽고, 수정하고, 삭제하고
	// insert(추가), select(읽기), update(수정), delete(삭제)
	
	// select : 검색		Read에 해당
	public void select() {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM worker"; 		// select All 
			rs = stmt.executeQuery(sql); 		// sql 문장
			while(rs.next()) {
				int id = rs.getInt(1); 		// 1번째 열 값을 가져오겠다
				String name = rs.getString(2);		// 2번쨰 열 값을 가져오겠다
				String gender = rs.getString(3);		// 3번쨰 열 값을 가져오겠다
				
				System.out.println(id+" "+name+" "+" "+gender); 		// 한 행씩 실행 할 때 마다 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	//insert : 입력
	public void insert() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO worker (name, gender) VALUES ('green','man')";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// update : 수정
	public void update() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "UPDATE worker SET gender='woman' WHERE id='6'";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// delete : 삭제
	public void delete() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "DELETE FROM worker WHERE id='6'";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}