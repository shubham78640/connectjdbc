
package hellojdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class demo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "Shubham@2807");

		Statement st = con.createStatement();
		
		String query = "create table employee (E_id int(3) primary key, Ename varchar(10), Esal float(5))";
		st.executeUpdate(query);
	System.out.println("Employee table created succesfully");
		
		//close the connection
		st.close();
		con.close();
	}

}
