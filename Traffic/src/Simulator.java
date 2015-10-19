public class Simulator//implements interface class 
{
	//static int SyncCount=20;
	//static String[] CararrayTest= new String[]{"4","6","8"};//[SyncCount];
	public static void main(String args[]) throws EmptyListException, InterruptedException
	{
		List<String> list= new List<String>();
		System.out.println("list== "+list.isEmpty());
		list.enqeue("44");
		System.out.println("list after adding 44= "+list.getString());
		list.enqeue("3");
		System.out.println("list after adding 3= "+list.getString());
		//traffic t= new traffic();
		//static String[] CararrayTest= new String[]{"4","6","8"};
		//t.introductionToNameRace2nd(CararrayTest, CararrayTest.length);
		System.out.println();
		list.deqeue();
		System.out.println("list after deleting first added number= "+list.getString());
	}
}