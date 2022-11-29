
import java.sql.*;  

public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false","root","Jamui@123");  
			  
			Statement stmt=((java.sql.Connection) con).createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			((java.sql.Connection) con).close();  
			}
		    catch(Exception e){ System.out.println(e);}

	}

	

}
