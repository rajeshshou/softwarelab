package softwareLab;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitTestCase {

	jUnitTest jst = new jUnitTest();
	@Test
	public void test() {
		//fail("Not yet implemented");
		int result = jst.sum(2,3);
	//	System.out.println(result);
		//assertEquals(6, result);
		assertEquals(5, result);
		
		
	}

	@Test
	public void testmult()
	{
		int product = jst.mult(2, 3);
		assertEquals(7, product);
	}
	
}
