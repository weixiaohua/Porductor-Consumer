package wei.hua.concurreny;

public class Consumer implements Runnable
{
	private BlockingQueueTest bqt;
	public Consumer(Box box)
	{
		this.box = box;
	}
	public Consumer(BlockingQueueTest bqt)
	{
		this.bqt = bqt;
	}
	@Override
	public void run()
	{
		while (true)
		{
			int i = bqt.getOut();
			if(i!=-1)
			{
				dataOut(Thread.currentThread().getName() + " get  " + i);
			}else{
				dataOut(Thread.currentThread().getName() +": Queue is empty! Sleep for 1s");
				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	public void dataOut(String s)
	{
		System.out.println(s);
	}
	
}
