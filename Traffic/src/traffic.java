import java.util.Scanner;
public class traffic extends List//extends or implements node and/or list clases
{
	static int josh=0;
	static int newA = 0;
	static int verticalSteps=6;
	static int distance=0;
	static int i = 0,z=0;
	static int Carl=0, vplace, horizontalSteps, a2,jinplace, john1, Jake1;
	static String s, list;
	static int syncCount = 0;
	static String[] arrayList= new String[syncCount];
	static int theStoppingNumber = 0;
	static int carNumber = 1, counter=0, counterJohn = 6;
	static String name = "Car", userResponse; 
	public static void introductionToNameRace2nd(String[] arrayOfCars, int SyncCount) throws InterruptedException
	{
		syncCount = SyncCount;
		arrayList= arrayOfCars;
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to start moving the cars now?\nEnter: Yes or No.!!");
		userResponse = input.nextLine();
		while (userResponse.equalsIgnoreCase("yes")) {
			for ( carNumber = 0; carNumber < arrayOfCars.length; ){
				//userResponse = "yes";
				name = arrayOfCars[carNumber];
				do 
				{   	
					john1 = (int) ((Math.random() * 1) + 1);
					verticalSteps = verticalSteps + john1;
					System.out.println("verticalSteps="+verticalSteps);
					Jake1 = (int) ((Math.random() * 1) + 1);
					distance = distance + Jake1;
					System.out.println("distance="+distance);
					space();
					johnActualStop();

				}
				while (verticalSteps<15 || distance<15);// && Carl<=86);
			}
		}
	}
	public static void space() throws InterruptedException
	{
		//this makes the racers look like they are moving. z=0 z<distance-name z++ and if name<50 space else print|
		Thread.sleep(1000);
		for (int d = 0; d < 30; d++) //this loop prevents names from printing in the wrong places
			//by printing out 30 spaces in between each printed image
		{
			System.out.println();
		};
	}

	public static void jake()
	{
		System.out.println("\n-----------------------------------      --------------------------------------------------");
		System.out.println("normal traffic");

		for (horizontalSteps= 0; horizontalSteps < distance; horizontalSteps++){

			if (verticalSteps <=14 && horizontalSteps >= 7 && horizontalSteps<=8)
			{
				//Create the Stop here---------------------------car1
				jakeActualStop();
			}


			else{
			System.out.print("    ");
			}
		};
		System.out.print(arrayList[0] /*+" "+ distance*/);
//		System.out.print(arrayList[0] +" "+ distance);
		//System.out.print(arrayList[z]+"="+Jake+" ");
		//----------------------------------------------------------------------	
		//System.out.println();
		for (int otherSteps = 2; otherSteps < distance; otherSteps++){
			if (otherSteps==2)
			{
				System.out.print("");
			}
			//Create the Stop here--------------------------- car2
			/*if (jakeSteps>=7 && jakeSteps <= 9 && otherSteps>= 6 && otherSteps<=7) //second name stops moving at certain steps 
				//when the first name stops at its certain steps
			{
				/*for(int v=2;v<otherSteps-4;v++)
				{
					System.out.print("    ");
				}*/
			/*if (otherSteps==6)
					System.out.print("");

				if (otherSteps==7)
					System.out.print("");*/
		}
		/*if (otherSteps == 10){
				System.out.println("");
			}
			else
			{*/
		System.out.print("    ");
		//}
		//}
		System.out.print(arrayList[1] /*+" "+ distance*/);
		//System.out.print(arrayList[1] +" "+ distance);
		//----------------------------------------------------------------------car3	
		for (int thirdSteps = 2; thirdSteps < distance; thirdSteps++){
			if (thirdSteps==2)
			{
				System.out.print("");
			}

			//Create the Stop here---------------------------car3
			/*if (jakeSteps>=7 && jakeSteps <= 9 && otherSteps>= 6 && otherSteps<=7) //second name stops moving at certain steps 
						//when the first name stops at its certain steps
					{
						/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");*/
		}
		/*if (otherSteps == 10){
						System.out.println("");
					}
					else
					{*/
		System.out.print("    ");
		//}
		//}

		System.out.print(arrayList[2] /*+" "+ distance*/);
		//System.out.print(arrayList[2] +" "+ distance);
		//System.out.println();
		for (int fourthSteps = 2; fourthSteps < distance; fourthSteps++){
			if (fourthSteps==2)
			{
				System.out.print("");
			}
			//Create the Stop here---------------------------car4
			/*if (jakeSteps>=7 && jakeSteps <= 9 && otherSteps>= 6 && otherSteps<=7) //second name stops moving at certain steps 
						//when the first name stops at its certain steps
					{
						/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");*/
		}
		/*if (otherSteps == 10){
						System.out.println("");
					}
					else
					{*/
		System.out.print("    ");
		//}
		//}
		System.out.print(arrayList[3] /*+" "+ distance*/);
		//System.out.print(arrayList[3] +" "+ distance);
		for (int fifthSteps = 2; fifthSteps < distance; fifthSteps++){
			if (fifthSteps==2)
			{
				System.out.print("");
			}

			//Create the Stop here---------------------------car5
			/*if (jakeSteps>=7 && jakeSteps <= 9 && otherSteps>= 6 && otherSteps<=7) //second name stops moving at certain steps 
						//when the first name stops at its certain steps
					{
						/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");*/
		}
		/*if (otherSteps == 10){
						System.out.println("");
					}
					else
					{*/
		System.out.print("    ");
		//}
		//}
		System.out.print(arrayList[4] /*+" "+ distance*/);
		//System.out.print(arrayList[4] +" "+ distance);
		System.out.println("\n-----------------------------------      --------------------------------------------------");
	}
	public static void johnActualStop(){

		if (horizontalSteps == 3 && verticalSteps ==9  )
		{//and if the cars arrive at these steps the stopping number is set to ten
			theStoppingNumber = 10;
		}
		for (vplace = 0; vplace < 30; ){

			if(vplace==16){//this prints the road vertically and every time the forloop number and the random number generator are incremented
				// the name prints or else it prints the road
				if(verticalSteps==vplace){
					System.out.print("\n                                  |"+arrayList[6]/*+"  "+ verticalSteps+"|"*/);
					//System.out.print("\n                                  |"+arrayList[6]+"  "+ verticalSteps+"|");
					jake();
				}
				else
				{
					System.out.print("\n                                  |      |");
					jake();
				}
				if(verticalSteps-1==vplace-1){
					//System.out.print("\n                                  |"+arrayList[7]+"  "+ verticalSteps+"|");
					System.out.print("\n                                  |"+arrayList[7]/*+"  "+ verticalSteps+"|"*/);
				}
				if(verticalSteps-2==vplace-2){
					System.out.print("\n                                  |"+arrayList[8]/*+"  "+ verticalSteps+"|"*/);
					//System.out.print("\n                                  |"+arrayList[8]+"  "+ verticalSteps+"|");
}
				if(verticalSteps-3==vplace-3){
					System.out.print("\n                                  |"+arrayList[9]/*+"  "+ verticalSteps+"|"*/);
					//System.out.print("\n                                  |"+arrayList[9]+"  "+ verticalSteps+"|");
					}
				if(verticalSteps-4==vplace-4){
					System.out.print("\n                                  |"+arrayList[10]/*+"  "+ verticalSteps+"|"*/);
					//System.out.print("\n                                  |"+arrayList[10]+"  "+ verticalSteps+"|");
					}
				else
				{
					System.out.print("\n                                  |      |");
				}
			}
			else if (verticalSteps-1 == vplace-1)
			{
				System.out.print("\n                                  |"+arrayList[7]/*+"  "+ verticalSteps*/+"  |");
				//System.out.print("\n                                  |"+arrayList[7]+"  "+ verticalSteps+"|");
				if(verticalSteps==vplace){
					System.out.print("\n                                  |"+arrayList[6]/*+"  "+ verticalSteps*/+"  |");
					//System.out.print("\n                                  |"+arrayList[6]+"  "+ verticalSteps+"|");
					}
				if(verticalSteps-2==vplace-2){
					System.out.print("\n                                  |"+arrayList[8]/*+"  "+ verticalSteps*/+"  |");
					//System.out.print("\n                                  |"+arrayList[8]+"  "+ verticalSteps+"|");
					}
				if(verticalSteps-3==vplace-3){
					//System.out.print("\n                                  |"+arrayList[9]+"  "+ verticalSteps+"|");
					System.out.print("\n                                  |"+arrayList[9]/*+"  "+ verticalSteps*/+"  |");
					}
				if(verticalSteps-4==vplace-4){
					System.out.print("\n                                  |"+arrayList[10]/*+"  "+ verticalSteps+*/+"  |");
					//System.out.print("\n                                  |"+arrayList[10]+"  "+ verticalSteps+"|");
					}

			}
			else		
				//This is where the actual Stop of the cars is done...!! they stop when they are
				//right before the 16th row before the second method is called and the horixontal road passes through it.
				if(vplace >= theStoppingNumber  &&  vplace <= theStoppingNumber + 5){
					System.out.print("");
				}
				else
				{
					System.out.print("\n                                  |      |");
				}	
			vplace++;
		}
	}

	public static void jakeActualStop()
	{	
		if (horizontalSteps == 7 || horizontalSteps == 8){
			if (horizontalSteps == 7){
				System.out.print("");
			}

			if (horizontalSteps == 8){
				System.out.print("    ");
			}
		}
	}
}