public class Increase2 implements Runnable
{
	private SyncCount count;
	private int number;
	public Increase2(SyncCount count2, int number)
	{
		this.count=count2;
		this.number=number;
		run();
	}
	public String toString()
	{
		return "(increase2)Count is:\t" + count;
	}
	@Override
	public void run()
	{
		for (int i = 1; i <= number; i++)
			this.count.increment();
	}
	
}
