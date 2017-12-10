package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		//while( true ) {
		String value = "";
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Invalid number" ) ;
			}
		//}
		String result = numberWords.convertToWords(value);
		System.out.println(result);
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
