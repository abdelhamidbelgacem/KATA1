	import org.junit.Assert; 
	import org.junit.Test;
	 
	public class testBizz {
		
		@testNumber3
		
		public void testNumberDividableBy3() {
			Assert.assertEquals("Fizz", fizzBuzz(3));
		 }
		
		@TestNumber5
		public void testNumberDividableBy5() 
		{ 
			
			Assert.assertEquals("Buzz", fizzBuzz(5));
		}
		
		@testNumber15
		
		public void testNumberDividableBy15()
		{ 
			Assert.assertEquals("FizzBuzz", fizzBuzz(15));
		 }
		@TestOtherNumber
		
		public void testOtherNumbers()
		{
			Assert.assertEquals("3", fizzBuzz(3));
			Assert.assertEquals("5", fizzBuzz(5));
			Assert.assertEquals("15", fizzBuzz(15));
			Assert.assertEquals("103", fizzBuzz(103));
			Assert.assertEquals("204", fizzBuzz(204));
			
		} 
	}



}
