import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class AccountDaoImpl implements AccountDao {
   	
    //This Object refecrnece take jdbc connects form applicationContext_Dao.xml
	private DataSource dataSource;
	       
	        
	public AccountDaoImpl() {
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; //driverclass ,url ,username,pass
	}
	@Override
	public void save(Account account) {
		  System.out.println("AccountDaoImpl  save()");
		// Declare resources
		Connection con = null;
		PreparedStatement pstmt = null;
		try { // Get connection.
			con = dataSource.getConnection();
			// Create statement.
			pstmt = con.prepareStatement("INSERT INTO account VALUES(?,?,?,?)");
			// Set parameters.
			pstmt.setInt(1, account.getAccno());
			pstmt.setString(2, account.getAccName());
			pstmt.setString(3, account.getAccType());
			pstmt.setDouble(4, account.getBal());
			// Execute statement.
			pstmt.execute();
			// Handle Exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Clean up resources to avoid memory leaks problems.
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Account get(int accno) {
		 //System.out.println("AccountDaoImpl  get()");
		// Declare resources.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Account avo = null;
		try {
			// Get connection.
			con = dataSource.getConnection();
			// Create statement object.
			stmt = con.createStatement();
			// Prepare query.
			String query = "SELECT * FROM account WHERE ACC_NO=" + accno;
			// Execute query.
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				avo = new Account();
				avo.setAccno(rs.getInt(1));
				avo.setAccName(rs.getString(2));
				avo.setAccType(rs.getString(3));
				avo.setBal(rs.getDouble(4));
			}
			// Handle exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Release resources to avoid memory leaks.
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return avo;
	}

	@Override
	public void remove(int accno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Account accout) {
		// TODO Auto-generated method stub

	}

}
