package Academy.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Iterator;
import java.util.Scanner;

public class ScottManager {
	// 쿼리문을 입력받을 스캐너 객체 생성.
	static Scanner keyboard = new Scanner(System.in);

	// db 연결객체 생성.
	static Connection conn = null;

	// 쿼리문을 저장할 객체
	static String sql = "";

	// SQL문을 입력받아 보낼 객체 생성.
	static PreparedStatement pstmt = null;

	// 쿼리문의 결과를 담을 객체 생성
	static ResultSet rs = null;

	// 테이블의 메타 데이터를 사용할 객체.
	static ResultSetMetaData rsmd = null;

	// 테이블의 컬럼을 저장할 배열변수 선언.
	static String[] fromTable = { "EMP", "DEPT", "SALGRADE" };

	// [1] 테이블 선택
	public static void showMenu1() {
		System.out.println("작업하고자 하는 테이블을 선택하세요.");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. EMP 테이블 조회");
		System.out.println("2. DEPT 테이블 조회");
		System.out.println("3. SALGRADE 테이블 조회");
		System.out.print("선택 : ");

	}

	// [2] 작업선택 (조회,입력,수정,삭제)
	public static void showMenu2() {
		System.out.println("하시고자 하는 작업을 선택하세요.");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("1. 조회");
		System.out.println("2. 입력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.print("선택 : ");
	}

	// [2-1]테이블을 선택한 후 테이블에서 할 수 있는 작업을 선택하는 메뉴
	public static void subMenu(int choice1) {
		int choice2; // 조회 입력 수정 삭제를 선택한 값을 저장할 변수.
		while (true) {
			showMenu2(); // 작업을 선택할 메뉴를 보여준다.

			// 작업을 선택한다.
			choice2 = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice2) {
			case 0:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			case 1:
				selectTable(choice1);
				break;
			case 2:
				insertTable(choice1);
				break;
			case 3:
				updateTable(choice1);
				break;
			case 4:
				deleteTable(choice1);
				break;
			default:
				System.out.println("괜히 이상한거 누르지 마세여");
				break;
			}
		}
	}

	// 선택한 테이블의 모든 정보를 보여주자.
	public static void selectTable(int selectTB) {
		System.out.println("선택한 테이블 : " + fromTable[selectTB - 1]);

		try {
			sql = ""; // sql문을 일단 초기화를 해준다.
			sql = "SELECT * FROM " + fromTable[selectTB - 1]; // from 뒤에 띄어쓰기는 반드시.

			// 이제 DB를 연결시켜주고 실행시켜주면 된다.
			conn = DBConnection.getConnection();
			ScottManager.pstmt = conn.prepareStatement(sql); // 쿼리문을 준비
			ScottManager.rs = pstmt.executeQuery(); // 쿼리문을 실행하고 결과를 저장
			ScottManager.rsmd = rs.getMetaData(); // 저장된 결과 들을 가져오는 메소드.

			System.out.println(fromTable[selectTB - 1] + " 테이블의 정보");
			int cols = rsmd.getColumnCount(); // 선택한 테이블의 컬럼의 갯수를 알려준다.
			for (int i = 1; i <= cols; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t"); // 이제 컬럼 명을 차례대로 출력한다.

			}
			System.out.println();

			// 이제 컬럼이 아닌 데이터들을 출력해야한다.
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					System.out.print(rs.getString(i) + "\t");

				}
				System.out.println(); // 1건의 데이터를 출력하고 나면 줄바꿈을 한다.
			}

		} catch (SQLException e) {
			System.out.println("SELECT문을 실행하는데 오류가 발생했습니다." + e);
		} finally {
			// 성공하든 실패하든 DB는 닫아주어야 한다.
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

	// 데이터를 테이블에 등록하는 메소드 생성
	public static void insertTable(int selectTB) {
		System.out.println("선택한 테이블 : " + fromTable[selectTB - 1]);
		try {
			sql = ""; // sql문 초기화

			// 이제 DB를 연결시켜주고 실행시켜주면 된다.
			conn = DBConnection.getConnection();

			// 선택한 테이블이 무엇이냐에 따라 컬럼이 달라지므로 알맞게 코딩을 해 주어야 한다.
			if (selectTB == 1) { // emp table
				System.out.print("EMPNO : ");
				int empno = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("ENAME : ");
				String ename = keyboard.nextLine();

				System.out.print("JOB : ");
				String job = keyboard.nextLine();

				System.out.print("MGR : ");
				int mgr = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("SAL : ");
				int sal = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("COMM : ");
				int comm = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("DEPTNO : ");
				int deptno = keyboard.nextInt();
				keyboard.nextLine();

				sql = "INSERT INTO " + fromTable[selectTB - 1] + " VALUES(?,?,?,?, +NOW(),?,?,?)";

				// 커넥션을 맺은 곳에 쿼리문을 넘긴다.
				pstmt = conn.prepareStatement(sql);
				// 아래 키로 주어진 순서값은 위 쿼리문의 ? 순서이다. 5번째인 hiredate는 now()로 정해져 있으므로
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setInt(1, empno);
				pstmt.setString(2, ename);
				pstmt.setString(3, job);
				pstmt.setInt(4, mgr);
				pstmt.setInt(5, sal);
				pstmt.setInt(6, comm);
				pstmt.setInt(7, deptno);

			} else if (selectTB == 2) { // dept table

				System.out.print("deptno : ");
				int deptno = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("DNAME : ");
				String dname = keyboard.nextLine();

				System.out.print("LOC : ");
				String loc = keyboard.nextLine();

				sql = "INSERT INTO " + fromTable[selectTB - 1] + " VALUES(?,?,?)";

				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, deptno);
				pstmt.setString(2, dname);
				pstmt.setString(3, loc);

			} else if (selectTB == 3) { // salgrade table

				System.out.print("GRADE : ");
				int grade = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("LOSAL : ");
				int losal = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("HISAL : ");
				int hisal = keyboard.nextInt();
				keyboard.nextLine();

				sql = "INSERT INTO " + fromTable[selectTB - 1] + " VALUES(?,?,?)";

				pstmt = conn.prepareStatement(sql);
				// 아래 키로 주어진 순서값은 위 쿼리문의 ? 순서이다. 5번째인 hiredate는 now()로 정해져 있으므로
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setInt(1, grade);
				pstmt.setInt(2, losal);
				pstmt.setInt(3, hisal);
			}

			// if문 안에서 준비된 쿼리문을 실행하면 된다. 실행부분은 공통적이므로 if문밖에 써도 된다.
			int resultCount = pstmt.executeUpdate(); // SELECT문을 제외한 나머지는 excuteUpdate를 사용한다.
			if (resultCount > 0) {
				System.out.println(resultCount + "건이 입력 되었습니다.");
			} else {
				System.out.println("데이터 입력에 실패하였습니다.");
			}

		} catch (SQLException e) {
			System.out.println("INSERT문 실행하는데 오류 발생." + e);
			e.printStackTrace();

		} finally {
			// 성공하든 실패하든 DB는 닫아주어야 한다.
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
	
	// [3]사원번호에 해당하는 사원의 이름을 수정하는 메소드.
	public static void updateTable(int selectTB) {
		System.out.println("선택한 테이블 : " + fromTable[selectTB - 1]);
		try {
			sql = ""; // sql문 초기화

			// 이제 DB를 연결시켜주고 실행시켜주면 된다.
			conn = DBConnection.getConnection();

			// 선택한 테이블이 무엇이냐에 따라 컬럼이 달라지므로 알맞게 코딩을 해 주어야 한다.
			if (selectTB == 1) { // emp table
				System.out.println("수정하고 싶은사원의 번호를 입력해주세요.");
				System.out.print("EMPNO : ");
				int empno = keyboard.nextInt();
				keyboard.nextLine();
				
				System.out.print("ENAME : ");
				String ename = keyboard.nextLine();
				
				sql = "UPDATE " + fromTable[selectTB - 1] + " SET ENAME = ? WHERE EMPNO = ?";

				// 커넥션을 맺은 곳에 쿼리문을 넘긴다.
				pstmt = conn.prepareStatement(sql);
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setString(1, ename);
				pstmt.setInt(2, empno);

			} else if (selectTB == 2) { // dept table
				
				System.out.println("지역과 부서이름을 수정하고 싶은 부서번호를 입력해주세요.");
				System.out.print("deptno : ");
				int deptno = keyboard.nextInt();
				keyboard.nextLine();
				
				System.out.print("DNAME : ");
				String dname = keyboard.nextLine();
				
				System.out.print("LOC : ");
				String loc = keyboard.nextLine();
				
				sql = "UPDATE " + fromTable[selectTB - 1] + " SET DNAME = ?, LOC = ? WHERE DEPTNO = ?";

				pstmt = conn.prepareStatement(sql);

				pstmt.setString(1, dname);
				pstmt.setString(2, loc);
				pstmt.setInt(3, deptno);

			} else if (selectTB == 3) { // salgrade table
				System.out.println("수정을 원하시는 GRADE를 입력해주세요.");
				System.out.print("GRADE : ");
				int grade = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("LOSAL : ");
				int losal = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("HISAL : ");
				int hisal = keyboard.nextInt();
				keyboard.nextLine();

				sql = "UPDATE " + fromTable[selectTB - 1] + " SET LOSAL = ?, HISAL = ? WHERE GRADE = ?";

				pstmt = conn.prepareStatement(sql);
				// 아래 키로 주어진 순서값은 위 쿼리문의 ? 순서이다. 5번째인 hiredate는 now()로 정해져 있으므로
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setInt(1, losal);
				pstmt.setInt(2, hisal);
				pstmt.setInt(3, grade);
			}

			// if문 안에서 준비된 쿼리문을 실행하면 된다. 실행부분은 공통적이므로 if문밖에 써도 된다.
			int resultCount = pstmt.executeUpdate(); // SELECT문을 제외한 나머지는 excuteUpdate를 사용한다.
			if (resultCount > 0) {
				System.out.println(resultCount + "건이 수정 되었습니다.");
			} else {
				System.out.println("데이터 수정에 실패하였습니다.");
			}

		} catch (SQLException e) {
			System.out.println("UPDATE문 실행하는데 오류 발생." + e);
			e.printStackTrace();

		} finally {
			// 성공하든 실패하든 DB는 닫아주어야 한다.
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
	
	// [4]사원의 정보를 삭제하는 메소드
	public static void deleteTable(int selectTB) {
		System.out.println("선택한 테이블 : " + fromTable[selectTB - 1]);
		try {
			sql = ""; // sql문 초기화

			// 이제 DB를 연결시켜주고 실행시켜주면 된다.
			conn = DBConnection.getConnection();

			// 선택한 테이블이 무엇이냐에 따라 컬럼이 달라지므로 알맞게 코딩을 해 주어야 한다.
			if (selectTB == 1) { // emp table
				
				System.out.println("삭제하고 싶은사원의 번호를 입력해주세요.\n삭제는 한번에 되므로 신중하게 선택하셔야합니다.");
				System.out.print("EMPNO : ");
				int empno = keyboard.nextInt();
				keyboard.nextLine();

				sql = "DELETE FROM " + fromTable[selectTB - 1] + " WHERE EMPNO = ?";

				// 커넥션을 맺은 곳에 쿼리문을 넘긴다.
				pstmt = conn.prepareStatement(sql);
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setInt(1, empno);

			} else if (selectTB == 2) { // dept table
				
				System.out.println("삭제를 원하시는 부서번호를 입력해주세요.\n단 부서번호 삭제는 다른 자료에 영향을 미치므로 신중하게 선택하셔야 합니다.");
				System.out.print("deptno : ");
				int deptno = keyboard.nextInt();
				keyboard.nextLine();

				sql = "DELETE FROM " + fromTable[selectTB - 1] + " WHERE DEPTNO = ?";

				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, deptno);

			} else if (selectTB == 3) { // salgrade table
				
				System.out.println("삭제를 원하시는 GRADE를 입력해주세요.\n단 삭제는 한번에 되므로 신중하게 생각하고 실행해주십시오.");
				System.out.print("GRADE : ");
				int grade = keyboard.nextInt();
				keyboard.nextLine();

				sql = "DELETE INTO " + fromTable[selectTB - 1] + " WHERE GRADE = ?";

				pstmt = conn.prepareStatement(sql);
				// 아래 키로 주어진 순서값은 위 쿼리문의 ? 순서이다. 5번째인 hiredate는 now()로 정해져 있으므로
				// 넘긴다음 순서를 매겨도 된다.
				pstmt.setInt(1, grade);

			}

			// if문 안에서 준비된 쿼리문을 실행하면 된다. 실행부분은 공통적이므로 if문밖에 써도 된다.
			int resultCount = pstmt.executeUpdate(); // SELECT문을 제외한 나머지는 excuteUpdate를 사용한다.
			if (resultCount > 0) {
				System.out.println(resultCount + "건이 삭제 되었습니다.");
			} else {
				System.out.println("데이터 입력에 실패하였습니다.");
			}

		} catch (SQLException e) {
			System.out.println("DELETE문 실행하는데 오류 발생." + e);
			e.printStackTrace();

		} finally {
			// 성공하든 실패하든 DB는 닫아주어야 한다.
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
