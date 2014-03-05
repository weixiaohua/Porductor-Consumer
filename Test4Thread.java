package wei.hua.concurreny;


public class Test4Thread
{
	
	public static void main(String[] args) throws Exception
	{
		BlockingQueueTest bqt = new BlockingQueueTest();
		Thread f = new Thread(new Productor(bqt));
		Thread a = new Thread(new Consumer(bqt));
		Thread a1 = new Thread(new Consumer(bqt));
		Thread a2 = new Thread(new Consumer(bqt));
		f.setName("Productor");
		a.setName("consumer 1");
		a1.setName("consumer 2");
		a2.setName("consumer 3");
		f.start();
		a.start();
		a1.start();
		a2.start();
	}
}
