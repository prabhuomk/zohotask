package threadrunner;

import threadtask.ThreadTask;
import runnabletask.RunnableTask;
import myscanner.MyScanner;
import proexception.ProException;


public class ThreadRunner {

    ThreadTask tasks = new ThreadTask();

    RunnableTask runThread = new RunnableTask();

    Thread thread = new Thread(runThread);

    MyScanner input = new MyScanner();

    private void threadTask()
   {
	
	
    System.out.println("The current thread name = "+" "+Thread.currentThread().getName());
	
	System.out.println("The current thread priority = "+" "+Thread.currentThread().getPriority());
	
	System.out.println("The current thread state = "+" "+Thread.currentThread().getState());
	
	tasks.start();
	
     System.out.println("The current thread name ="+" "+Thread.currentThread().getName());
	
	System.out.println(" The current thread priority ="+" "+Thread.currentThread().getPriority());
	
	System.out.println("The current thread state ="+" "+Thread.currentThread().getState());


  }

    private void runTask()
    {
	
    System.out.println("The current thread name = "+" "+Thread.currentThread().getName());
	
	System.out.println("The current thread priority = "+" "+Thread.currentThread().getPriority());
	
	System.out.println("The current thread state = "+" "+Thread.currentThread().getState());
	
	thread.start();
	
    System.out.println("The current thread name ="+" "+Thread.currentThread().getName());
	
	System.out.println(" The current thread priority ="+" "+Thread.currentThread().getPriority());
	
	System.out.println("The current thread state ="+" "+Thread.currentThread().getState());

    }

    private void nameSet()
    {
	
	
	  try
	  {
	     String nameOfThread =input.getInput("Enter the name of the thread you want to create");
	     
	     tasks.setName(nameOfThread);
	 	
	     String nameOfThreadRunnable =input.getInput("Enter the name of the thread you want to create");
	 	
	     thread.setName(nameOfThreadRunnable);
	    
	     threadTask();
	
	     runTask();
	  
	  }
	  catch(ProException e)
	
	  {
		System.out.println(e.getMessage());

	  }
	}

    private void useSleep() 
    {
    	
    	
    	for(int i=0;i<5;i++)
    	{
    		 ThreadTask threads = new ThreadTask();
        	
        	 threads.setName("Extended Thread"+i);
        	
        	 threads.start();
        	 
        	 Thread runThreads = new Thread(runThread,"Runnable Thread"+i);
             
             runThreads.start();
    		
    	}
    	
    }
	
    public static void main(String[] args)
   {
	
	MyScanner input = new MyScanner();
	
	ThreadRunner run = new ThreadRunner();
	
	int caseNumber=input.getInputNumber("Enter the task number");
		
	  switch(caseNumber)
	  {
	
	   case 1:run.threadTask();
	   break;

	   case 2:run.runTask();
	   break;
	
	   case 3:run.nameSet();
	   break;
	
	   case 4:run.useSleep();
	   break;
		
	  }
	
	}

}
