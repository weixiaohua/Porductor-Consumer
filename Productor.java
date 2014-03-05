package wei.hua.concurreny;


public class Productor implements Runnable
{
	private BlockingQueueTest bqt;

	public Productor(BlockingQueueTest bqt)
	{
		this.bqt = bqt;
	}
	
	@Override
	public void run()
	{

		while (true)
		{
			
			for (int i=0; i<100000;i++)//AtomicInteger i = 0; i. < 100000; i++)
			{
				if (bqt.putIn(i))
				{
					 dataOut(Thread.currentThread().getName()+" put:"+i);
					 
				} else
				{
					 dataOut("Queue is full ! Sleep for 1s");
					
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
	}
	
	public synchronized void dataOut(String s)
	{
		System.out.println(s);
	}
}
