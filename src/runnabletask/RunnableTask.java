package runnabletask;

public class RunnableTask implements Runnable {
	
	public void run() 
	{

		/*System.out.println("The current thread name is "+" "+Thread.currentThread().getName());
		
		// Thread.currentThread -Returns a reference to the currently executing thread object.
		// reference.getname();
		
		System.out.println("The current thread name is "+" "+Thread.currentThread().getPriority());
		
		System.out.println("The current thread name is "+" "+Thread.currentThread().getState());*/
		
		System.out.println("Going to sleep:"+Thread.currentThread().getName());
		
		try {
		
		Thread.sleep(45000);
		}
		catch(Exception e)
		{
			//
		}
		
		System.out.println("After sleep:"+Thread.currentThread().getName());
		
	}

}
