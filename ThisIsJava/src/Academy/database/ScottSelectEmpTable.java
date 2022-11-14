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
				int empno = rs.getInt("EMPNO"); // 컬럼명
				String ename = rs.getString("ENAME"); // 몇번째 컬럼인지.
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
