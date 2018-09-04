package CodingDemo;
import java.sql.*;
import java.util.Scanner;
public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system1", "system1");
          Statement st = con.createStatement();
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the Table Name  :" );
          String table_name = sc.next();
            //  "create table emp (ID number primary key, ename varchar2(20) NOT NULL)";
          String q1 ="create table "+table_name+" (id number primary key, ename varchar2(20) not null, esal varchar2(20) not null)";
          System.out.println(q1);
          st.executeUpdate(q1);
          System.out.println("Table is created : " +table_name);
          while(true) {
        	  System.out.println("Enter the Emp id");
        	  int id = sc.nextInt();
        	  System.out.println("Enter the Emp Name");
        	  String ename = sc.next();
        	  System.out.println("Enter the Emp Salary");
        	   float esal = sc.nextFloat();
        	   
        	   String q2 = "insert into "+table_name+" values  ("+id+",'"+ename+"',"+esal+")";
        	   System.out.println(q2);
        	   st.executeUpdate(q2);
        	   System.out.println("Data Stored Sucussfully");
        	   System.out.println("you are wants insert more data  = yes/no");
        	   if(sc.next().equals("no"))
        		   break;
        	   
          }
          Thread.sleep(15000);
          
          System.out.println("Drop the Table");
          String q3 =  "drop table "+sc.next()+"";
          System.out.println(q3);
          st.executeUpdate(q3);
          System.out.println("table is droped");
          sc.close();
          st.close();
          con.close();
	}
}
