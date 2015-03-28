import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class FactorFactoryGenerateTest {

	@Test
	public void testPrimesBelowOne() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = FactorFactory.generate(1);
		assertEquals(expected, actual);
	}

}
