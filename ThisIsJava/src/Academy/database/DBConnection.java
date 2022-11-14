package Academy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 연동 시작. db접속 클래스를 만들자.
public class DBConnection {
	
	// db에 접속하기 위해선 db의 스키마, 아이디, 비밀번호를 필수로 알아야 하고 url과 port넘버도 반드시 알아야한다.
	// [1] 드라이버 로딩
	// [2] 접속정보 입력
	// [3] sql 쿼리문으로 데이터 입출력
	// [4] 드라이버를 닫고 나와야함.
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/acadamy_scott?serverTimezone=Asia/Seoul&useSSL=false";
			String user = "scott";
			String pass = "tiger";
			
			//1. mySQL 드라이버를 로딩해야한다.
			Class.forName("com.mysql.cj.jdbc.Driver"); // mySQL Driver를 로딩한다.
			
			//2. DB에 접속한다.
			conn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("DB접속 성공시 뜨는 문구.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB접속 실패." + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB접속 실패." + sqle.toString());
		} catch (Exception e){
			System.out.println("알 수 없는 오류." + e.toString());
		}
		
		return conn;
	}

}
