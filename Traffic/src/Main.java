public class Main
{
	public static void main(String args[]) throws InterruptedException
	{

		SyncCount count= new SyncCount();
		System.out.println(count);
		Runnable r1= new Increase2(count, 5);
		Runnable r2= new Increase2(count, 5);
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		//System.out.println("t1"+t1);
		//System.out.println("t2"+t2);
		t1.start(); t2.start();
		t1.join(); 		
		System.out.println(count);
		t2.join();
		SyncCount count2=count;
		System.out.println(count2);
		count.moveToCarObject(5);
		
	}
}
