
public class Sample implements Runnable {

	private Thread t; 
	private String threadName;
	Sample(String threadName)
	{
		this.threadName= threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println(threadName);
		}
		
		
	}
	public void  start()
	{
		if(t==null)
		{
			t= new Thread(this,threadName);
			t.start();
		}
	}
	

}
