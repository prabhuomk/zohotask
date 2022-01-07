package sqltask;

public class SqlRunner {
	
	public static void main(String[] args) {
		
		SqlTask task = new SqlTask();
		
		try
		{
		task.createTable();
		
		System.out.println("table create successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
