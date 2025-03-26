import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestDAO {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url ="jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "scott";
	private String passwd = "tiger";
	
	public TestDAO() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			ps = con.prepareStatement("select * from test");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int n = rs.getInt("num");
				String name = rs.getString("username");
				String addr = rs.getString("address");

				list.add(new TestDTO(n, name, addr));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (ps != null) {
					rs.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public void insert(int num, String name, String address) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into test(num, username, address) value(?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, address);
			
			conn.setAutoCommit(false);
			int n = ps.executeUpdate();
			int x = 5 / 0;
			
			if (n == 1) {
				conn.commit();
			}
		} catch (Exception e) {
			try {
				System.out.println("Rollback");
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (ps != null ) {
					ps.close();
				}
				
				if (conn != null) {
					conn.setAutoCommit(true);
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}
