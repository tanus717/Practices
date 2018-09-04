package CodingDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
		
 class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		   FileInputStream f = new FileInputStream("abc2.properties");
		   Properties p = new Properties();
		   p.load(f);
				  Class.forName("oracle.jdbc.driver.OracleDriver");
				  Connection con = DriverManager.getConnection(p.getProperty("url"),p.getProperty("u"),p.getProperty("p"));
		          Statement st = con.createStatement();
		        ResultSet r =   st.executeQuery(" select * from STUDENT ");
		        int count=0;
		        while(r.next()) {
		        	  System.out.println(r.getInt(1)+"  "+r.getString(2)+"  "+r.getString(3));
		        	  count++;
		        }
		        System.out.println("Count : "+count);
		        r.close();
		        st.close();
		        con.close();
	}
	

}
