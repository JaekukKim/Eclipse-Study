package Academy.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

// Scott Schema에 있는 EMP테이블의 정보를 가져오는 클래스.
public class ScottSelectEmpTable {
	public static void main(String[] args) {
		
		Connection conn = null; // DB에 연결된 상태(세션)를 담을 객체.
		PreparedStatement pstmt = null; // SQL문을 나타내는 객체
		ResultSet rs = null; // SQL Query문을 실행한 결과를 담을 객체.
		
		try {
			String sql = "SELECT * FROM emp order by empno";
			// 드라이버를 먼저 로딩해야한다. 그리고 DB에 접속한다.
			conn =DBConnection.getConnection();
			// 연결된곳에 질문할 준비를 한다.
			pstmt = conn.prepareStatement(sql);
			// 질문을 받았으면 그걸 실행하고 결과를 출력해야한다, select문을 제외하고는 executeQuery 메소드로 결과를 실행한다.
			rs = pstmt.executeQuery();
			
			//찾아온 데이터를 화면에 보여준다.
			System.out.println("EMPNO\tENAME\tJOB\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
			System.out.println();
			
			while (rs.next()) {
				// while문으로 데이터를 하나씩 가져온다. 데이터는 eof까지 도달하면 while문을 빠져나온다.
				// 데이터를 가져올때는 워크벤치나 커맨드라인에서 꼭 use 스키마명 -> desc 불러올테이블명 을 하여 각 컬럼의 타입이 무엇인지 보고 맞춰주어야한다.
				// 데이터를 가져오는 방식은 조금 특이하다. get기본타입(or클래스)로 가져오는데. 괄호 안에 문자열로 들어가있다...?
				// 자바는 외부의 데이터를 "문자열"로 인식한다. 그래서 매개변수(컬럼명(키))를 문자열로 넣어주었다.
				// 만약 "몇번째"인지 정확히 기억을 한다면 안에 그냥 숫자만 넣어서 몇번째를 가져올건지, (ex getInt(1);)이런식으로다가 가능하다.
				int empno = rs.getInt("EMPNO"); // 컬럼명
				String ename = rs.getString(2); // 몇번째 컬럼인지(이 줄은 ENAME). (안에 순서(정수타입으로)도 가능하다)
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				Date hiredate = rs.getDate("HIREDATE");
				double sal = rs.getDouble("SAL");
				double comm = rs.getDouble("COMM");
				int deptno = rs.getInt("DEPTNO");
				
				String result = empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" + hiredate + "\t" + sal
						+ "\t" + comm + "\t" + deptno;
				
				System.out.println(result);
			}
			
		} catch (SQLException e) {
			System.out.println("SELECT문에서 예외가 발생했습니다." + e.toString());
		} finally {
			// DB연결을 종료하기 전에 열려져 있는 자원을 반드시 닫아야한다. 닫을때는 역순으로 닫아야한다.
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				throw new RuntimeException(e2.getMessage());
			}
			
		}
		
	}
}
