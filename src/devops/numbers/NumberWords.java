package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "";
		if (number == 1) {
			result = "One";
		}
		return result.trim() ;
	}

}
