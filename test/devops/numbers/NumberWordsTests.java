package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		//Assert.assertEquals( "First Test", "One", numberWords.toWords( 1 ) ) ;
		
		Assert.assertEquals( "First Test", "One", numberWords.convertToWords( "1" ) ) ;
		Assert.assertEquals( "Second Test", "Two", numberWords.convertToWords( "2" ) ) ;
		Assert.assertEquals( "Third Test", "Three", numberWords.convertToWords( "3" ) ) ;
		
	}

}
