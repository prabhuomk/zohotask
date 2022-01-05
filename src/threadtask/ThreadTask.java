package threadtask;

public class ThreadTask extends Thread 
{
	    

	
		public void run() 
		{
			/*System.out.println("The current thread name = "+" "+Thread.currentThread().getName());
			
			System.out.println("The current thread priority = "+" "+Thread.currentThread().getPriority());
			
			System.out.println("The current thread state = "+" "+Thread.currentThread().getState());*/
			
			System.out.println("Going to sleep:"+Thread.currentThread().getName());
			
			try {
			
			Thread.sleep(60000);
			}
			catch(Exception e)
			{
				//
			}
			
			System.out.println("After sleep:"+Thread.currentThread().getName());
			
		}

	


}
