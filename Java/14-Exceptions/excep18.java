

//Write a program to generate SQLException



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class excep18
{
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String dburl = "jdbc:mysql://localhost/STOREDB";	   
	   static final String dbuser = "root";
	   static final String dbpass = "root";
	   
public static void main(String[] args) throws SQLException
{
	Connection con = null;
	Statement stmt = null;
	
	try 
	{
	    
	    con = DriverManager.getConnection(dburl, dbuser, dbpass);	    
	    
	    stmt=con.createStatement();
	    
	    String query="SELECT * FROM ITEM";
	    
	    
	    ResultSet rset = stmt.executeQuery(query);
	    while(rset.next())
	    {
	    	System.out.print("ID: " + rset.getInt(1));
	    	System.out.print(" Product : "+rset.getString(2));
	    	System.out.println(" Price : "+rset.getString(3));
	    }
	} 
	
	catch (SQLException e) 
	{
	    System.err.println("Cannot connect ! ");
	    e.printStackTrace();
	}
	
	finally {
	    System.out.println("Closing the connection.");
	    if (con != null) 
	    		try 
	    		{ 
	    		con.close();
	    		} 
		    	catch (SQLException ignore)
		    	{	}
	}
	
}
}