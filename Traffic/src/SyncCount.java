public class SyncCount
{
	List<String> list= new List<String>();
	private int count, i=0;
	public SyncCount()
	{
		count=0;
	}
	public synchronized void increment()
	{
		count++;
		list.enqeue("car"+count);
	}
	public String toString()
	{
		System.out.println(list.getString());
		return "(synccount)Count is:\t" + count;
	}
	public void moveToCarObject(int size) throws InterruptedException
	{
		Car car= new Car(list.getString());
	}
}