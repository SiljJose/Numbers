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
		Assert.assertEquals( "Invalid Test", "Invalid Number", numberWords.convertToWords( "-1" ) ) ;
		
	}
	@Test
	public void ConvertNumber1() {
		Assert.assertEquals( "First Test", "One", numberWords.toWords( 1 ) ) ;
		
	}
	
	@Test
	public void ConvertNumber2() {
		Assert.assertEquals( "Second Test", "Two", numberWords.convertToWords( "2" ) ) ;
		
	}

}
