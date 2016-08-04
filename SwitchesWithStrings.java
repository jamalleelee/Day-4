package dayFour;

import java.util.Scanner;

public class SwitchesWithStrings {

	public static void main(String[] args) {
		Scanner alien= new Scanner(System.in);
		System.out.println("How is your Day?");
		System.out.println("Great or Bad?");
		String theDayIs=alien.nextLine();
		
		switch (theDayIs.toLowerCase()) {
		case "great":
			System.out.println("Great to Hear!");			
			break;
		case "bad":
			System.out.println("I'm Sorry Bro");
			break;

		default:
			System.out.println("Que?");
			break;
		}
	}

}
