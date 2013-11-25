import java.util.ArrayList;
import java.util.Date;


public class threadplex extends Thread
{
	//threadplex management values 
	private static ArrayList<Thread> threads;
	private static boolean running=false;
	
	/*
	 * Constructor. The only one the user should use.
	 */
	public threadplex()throws Exception
	{		
		threads = new ArrayList<Thread>();
		this.start();
	}
	
	/*
	 * 
	 */
	public void add(Thread thread)throws Exception
	{
		if(thread == null)
			throw new Exception("ERROR: threadplex add method received null pointer");
		
		threads.add(thread);
	}
	
	/*
	 * 
	 */
	public void scheduleJob(long threadID, Date scheduledTime) throws Exception
	{
		
	}
	
	/*
	 * Run threadplex as a seperate thread, which manages other threads.
	 */
	public void run()
	{
		running=true;
		while(running)
		{
			//TODO
		}
	}
	
	/*
	 * Stop threadplex and all threads are returned back to user to handle.
	 */
	public void quit()
	{
		running=false;
	}
}
