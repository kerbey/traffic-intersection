import java.util.Scanner;
public class Car extends SyncCount
{
	traffic t=new traffic();
	String car="", carpart="";
	int x=0;
	Scanner input = new Scanner(System.in);
	@SuppressWarnings("static-access")
	public  Car(String carlist) throws InterruptedException
	{	
		System.out.println("what was the syncCount number?");
		int SyncCount=input.nextInt();
		String[] arrayOfCars= new String[SyncCount];

		for(int i = 0;i < carlist.length() ;i++)
		{
			car = carlist.substring(i, i+1);
		//	System.out.println(" car character ="+car);
			//System.out.println("list = "+list);
			if(car.contains(","))
			{
				arrayOfCars[x]=carpart;
				carpart="";
				//System.out.println("car #= "+arrayOfCars[x]);
				//car="";
				x++;
			}
			else
			{
				carpart=carpart+car;
				//System.out.println("carpart= "+carpart);
			}
		}
		t.introductionToNameRace2nd(arrayOfCars, SyncCount);	
	}
}