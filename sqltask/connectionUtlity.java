package sqltask;

import java.sql.*;
import proexception.ProException;

public enum connectionUtlity {
	
	CONNECTION;
	
    String url="jdbc:mysql://localhost:3306/student";
    
    String user="root";
    
    String password="Root@123";
    
    
    public void closeConnection(Connection input) {
    	try
    	{
    	input.close();
    	}
    	catch(SQLException e)
    	{}
    	
    }
	
	public Connection createConnection()throws ProException
	{
		
		if(url ==null|| url.isEmpty() || user==null || user.isEmpty()|| password.isEmpty())
		{	
			if(url == null)
			{
			throw new ProException("url can't be null");
			}
			else if(url.isEmpty())
			{
				throw new ProException("url can't be empty");
			}
			else if(user == null)
			{
				throw new ProException("user can't be null");
			}
			else if(user.isEmpty())
			{
				throw new ProException("username can't be empty");
			}
			else if(password.isEmpty())
			{
				throw new ProException("password can't be empty");
			}
		
		}
		
		    try
		      {
		    	
		    	   
		    	   
		           Connection connector =DriverManager.getConnection( url,user,password);
		       
		            return connector;
		
		      }
		     catch(SQLException exception) 
		     {
			
			      throw new ProException(exception);
			
		      }
		    
		
		
	 
	}

}
