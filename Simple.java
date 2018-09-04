package CodingDemo;
import java.sql.*;
class Simple {
    public static void main(String []argh) throws SQLException, ClassNotFoundException {
    	       Class.forName("oracle.jdbc.driver.OracleDriver");
    	       Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system1", "system1");
    	       Statement statement = connection.createStatement();
    	    //   String s = "create table emp (ID number primary key, ename varchar2(20) NOT NULL)";
    	       String s = "insert into emp values (102,'shivani')";
    	       String s1 = "insert into emp values (103,'yogesh')";
    	       String s2 = "insert into emp values (104,'yogendra')";
    	       String s3 = "insert into emp values (105,'mamta')";
    	       String s4 ="select * from Emp";
    	       statement.executeUpdate(s);
    	       statement.executeUpdate(s1);
    	       statement.executeUpdate(s2);
    	       statement.executeUpdate(s3);
    	       System.out.println("Update  sucuessfully");
    	       ResultSet set = statement.executeQuery(s4);
    	       while(set.next())
    	      System.out.println(set.getInt(1)+"----"+set.getString(2));
    	       statement.close();
    	       connection.close();    	
    }
}
