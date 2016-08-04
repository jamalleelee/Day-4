package dayFour;

public class FizzBuzzBangMethods {

	public static void main(String[] args) {

		for (int i = 1; i <= 110; i++) {

			if (divisableByAllThree(i)) {
				System.out.println("FizzBuzzBang");

			} else if (divisableByThreeAndFive(i)) {
				System.out.println("FizzBuzz");
			} else if (divisableByFiveAndSeven(i)) {
				System.out.println("BuzzBang");

			} else if (divisableByThreeAndSeven(i)) {
				System.out.println("FizzBang");
			} else if (divisableOnlyByThree(i)) {
				System.out.println("Fizz");

			} else if (divisableOnlyByFive(i)) {
				System.out.println("Buzz");
			} else if (divisableOnlyBySeven(i)) {
				System.out.println("Bang");

			} else {
				System.out.println(i);
			}
		}
	}

	private static boolean divisableOnlyBySeven(int fromTheForLoop) {
		boolean howsThisMethod = false;
		if (((fromTheForLoop % 7) == 0)) {
			howsThisMethod = true;

		}
		return howsThisMethod;
	}

	public static boolean divisableByAllThree(int fromTheForLoop) {

		boolean howsThisMethod = false;

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) {

			howsThisMethod = true;

		}

		return howsThisMethod;
	}

	public static boolean divisableByThreeAndFive(int fromTheForLoop) {
		boolean howIsThisForThreeAndFive = false;
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0)) {
			howIsThisForThreeAndFive = true;

		}
		return howIsThisForThreeAndFive;
	}

	public static boolean divisableByFiveAndSeven(int fromTheForLoop) {
		boolean howIsThisForFiveAndSeven = false;
		if (((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) {

			howIsThisForFiveAndSeven = true;
		}
		return howIsThisForFiveAndSeven;
	}

	public static boolean divisableByThreeAndSeven(int fromTheForLoop) {
		boolean howIsThisForFiveAndSeven = false;
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 7) == 0)) {
			howIsThisForFiveAndSeven = true;
		}
		return howIsThisForFiveAndSeven;
	}

	public static boolean divisableOnlyByThree(int fromTheForLoop) {
		boolean howIsThisForThree = false;
		if (((fromTheForLoop % 3) == 0)) {
			howIsThisForThree = true;
		}
		return howIsThisForThree;

	}

	public static boolean divisableOnlyByFive(int fromTheForLoop) {
		boolean howIsThisForFive = false;
		if (((fromTheForLoop % 5) == 0)) {
			howIsThisForFive = true;
		}
		return howIsThisForFive;
	}
}
