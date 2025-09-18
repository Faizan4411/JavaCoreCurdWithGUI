
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
	
	private static Connection con;
	
	public static Connection getConnection() throws Exception {
        
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected...");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techfira1","root","");
			System.out.println("Database Connected Successfully...");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return con;
    }
	
	
}