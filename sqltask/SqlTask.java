package sqltask;

import java.sql.*;
import proexception.ProException;

public class SqlTask {
	
	
	public void createTable()throws ProException
	{
		
		Connection connection=connectionUtlity.CONNECTION.createConnection();
		
		try(Statement statement = connection.createStatement())
		{
		
			
			String sql="CREATE TABLE ZOHO(id INTEGER not NULL,name VARCHAR(20),PRIMARY KEY(id))";
			
			statement.executeUpdate(sql);
			
		
		}
		catch(SQLException e)
		{
			throw new ProException(e);
			
		}
		
		
		
	}
	
	
	

}
