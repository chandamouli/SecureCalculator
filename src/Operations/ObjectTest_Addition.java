package Operations;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.Test;

class ObjectTest_Addition extends Addition{
	
	ICalculateOperation operation;
	
	@BeforeClass
	protected void setUp()
	{
		operation = new Addition();		
	}

	@Test
	//test to check addition - baseflow - ValidInputs
	void testAdditionWithValidInput() 
	{
		int[] operands = {2,3};
		assertEquals(5,operation.getResult(operands));				
	}
	
	@AfterClass
	protected void tearDown()
	{
		
	}

}
