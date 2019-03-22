import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestShop {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
           Connection connection = getConnection();
           
           Statement statement = connection.createStatement();
           
           String sql = "insert into T_Users (Login, Password) values('brown','music');";
           statement.executeQuery(sql);
	}
    
	public static Connection getConnection() {
    	try {
    		String driver = "org.mariadb.jdbc.Driver";
    		String url = "jdbc:mariadb://localhost:3306/Shop";
    		String username = "root";
    		String password = "";
    		
    		Class.forName (driver);
    		
    		return (DriverManager.getConnection(url,username,password));	
    	}
    	catch ( Exception e) 
    	{
    		e.printStackTrace();
    		System.out.println(e);
    	}
    	return null;
    }
}
    	
    	
    	
           
    
            
            
            
            