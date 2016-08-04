package dayFour;

public class WorkingWithCharArrays {

	public static void main(String[] args) {
		StringBuilder stuffNThings= new StringBuilder("Hi Jason");
		
		
		char[] sayHiClass= {'H','i','C','L','A','S','S'};
		String sayingHiClass = new String(sayHiClass);
		System.out.println(sayingHiClass);
		
		String stuff="Hi all";
				System.out.println(stuffNThings.deleteCharAt(0));
	}

}
