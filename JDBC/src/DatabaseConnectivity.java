import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity 
{
	

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("Jdbc:mysql:///demo","root","12345");
			
					Statement stmt = con.createStatement();
			
			/* String query = "create table list(id int, name varchar(20))";
			   String query = "insert into list value(1,'Arnav'),(2,'Gunjan'),(3,'Darshan'),(4,'Shreyas')";
			   int i=stmt.executeUpdate(query);
			    if(i>0)
			    	
			   {
			    	
			    	System.out.println("Record is inserted");
			   }*/
			   
			   //RESULT SET FOR EXTRACTING DATA FROM DATABASE
			     String query = "select * from list";
			     ResultSet rs = stmt.executeQuery(query);
			     while(rs.next())
			     {
			    	 System.out.println("Id is "+rs.getInt(1)+"  Name is  "+rs.getString(2));
			    
		}
		}
		catch(Exception e)
		
		{
			System.out.println("Exception has occured"+e);
		}
		
	}
	}

