package wei.hua.concurreny;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest
{
	private BlockingQueue<Integer> bq;
	private int M=100;
	public BlockingQueueTest()
	{
		bq = new LinkedBlockingQueue<>(M);
	}
	public boolean putIn(int n)
	{
		if(bq.size()<M)
		{
			bq.add(n);
			return true;
		}else{
			return false;
		}
	}
	public int getOut()
	{
		if(bq.size()>0)
		{
			return bq.poll();
			
		}else{
			return -1;
		}
	}
}
