public class Main
{
	public static void main(String args[]) throws InterruptedException
	{
		  // long startTime = System.();
		  /*long totalSeconds=System.currentTimeMillis();
			System.out.println("s="+totalSeconds);
			/*for(int i=1;i<=9;i++)
			{
				time2=time2/60;
			}
			System.out.println("time= "+time2);
			int seconds = (int) (totalSeconds % 60);
			int minutes = (int) ((totalSeconds % 3600) / 60);
			int hours = (int) ((totalSeconds % 86400) / 3600);
			int days = (int) ((totalSeconds % (86400 * 30)) / 86400);
			System.out.println("days="+days);
			System.out.println("hours= "+hours);
			System.out.println("minutes= "+minutes);
			System.out.println("seconds= "+seconds);
		//System.out.println("s"+time2/60/60/60/60/60/60/60/60/60);
		//Node<String> n = new Node<String>("");
		//List<String> l= new List<String>();
		//l.enqeue("a");
		//l.enqeue("data");
		//System.out.println(l.toString());*/
		//List<String> list= new List<String>();

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