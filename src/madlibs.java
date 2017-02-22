import java.util.Scanner;


public class madlibs {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner (System.in);
		
		//declare variables
		String object;
		String place;
		String time;
		String verbEndingInE;
		String feeling;
		String time2;
		String email;
		
		System.out.println("Mad Libs - Version 1.3 beta (Released on July 9, 2014, at 11:17am. Created by o355.");
		System.out.println("");
		
		System.out.println("");
		System.out.println("Give me an object.");
		object=scan.nextLine();
		
		
		System.out.println("");
		System.out.println("Give me a place!");
		place=scan.nextLine();
	
		
		System.out.println("");
		System.out.println("Give me a time");
		time=scan.nextLine();
		
		System.out.println("");
		System.out.println("Give me a verb ending in ed (Stopped, etc.)");
		verbEndingInE=scan.nextLine();
		
		System.out.println("");
		System.out.println("Give me another time!");
		time2=scan.nextLine();
		
		System.out.println("");
		System.out.println("Give me a message you would find in an email!");
		email=scan.nextLine();
		
		System.out.println("");
		System.out.println("Give me a feeling!");
		feeling=scan.nextLine();
		
		System.out.println("");
		System.out.println("Today, I went with my pet " + object + " and went to " + place + ". Once it was " + time + ", we went to " + place + ". All of a sudden, we got " + verbEndingInE + " out. Oh well, I felt " + feeling + " afterwards! I should probably go to bed soon, maybe around " + time2 + ". The next morning, I recevied an email saying... " + email + ". Yikes.");
		System.out.println("");
		System.out.println("Thanks for using Mad Libs by o355! I will be adding more to the project never (what's java)!");
		
	}

}
