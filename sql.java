package sqlpackage;
import java.sql.*;
import java.util.*;


public class sql {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/stu_sql";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
			
			
			//Entering the data
          Scanner scanner = new Scanner(System.in);
	
          
          System.out.println("enter id");
          Integer id = scanner.nextInt();
        		  
	        System.out.println("enter name");
	        String name = scanner.next();
	
	        System.out.println("enter roll no");
            Integer roll_no = scanner.nextInt();
	
	        System.out.println("enter class");
	        String cls = scanner.next();
	
	        // Inserting data using SQL query
	        String sql = "insert into Students values(" +id+",'" + name 
                + "'," + roll_no + ",'" + cls + "')";
	      System.out.println(sql);
	        Statement st = con.createStatement();
	        //
                    // Executing query
	                    int m = st.executeUpdate(sql);
                    if (m >=  1)
                        System.out.println(
	                                "inserted successfully : " + sql);
                    else
                        System.out.println("insertion failed");
	     
	                    // Closing the connections
                   con.close();
                   System.out.println("/////////////////////////");
                   System.out.println("SEARCH FROM TABLE STUDENT");
                   System.out.println("/////////////////////////");
                   System.out.println("PLZ ENTER NAME WHANT TO SEARCH");
		} else {
			System.out.println("Database Connection failed");
		}
	}	
	
		// TODO Auto-generated method stub

	

}
