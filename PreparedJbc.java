package CodingDemo;
import java.sql.*;
public class PreparedJbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system1",  "system1");
		     PreparedStatement pre = con.prepareStatement("insert into employee values (?,?,?)");
		     pre.setInt(1,103);
		     pre.setString(2," kunal");
		     pre.setFloat(3, 60000);
		     pre.executeUpdate();
		     System.out.println("data inserted");
	}

}
