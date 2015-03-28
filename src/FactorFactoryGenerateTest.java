import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class FactorFactoryGenerateTest {

	@Test
	public void testPrimesBelowOne() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = FactorFactory.generate(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testPrimesBelowThree() {
		List<Integer> expected = Arrays.asList(2);
		List<Integer> actual = FactorFactory.generate(3);
		assertEquals(expected, actual);	
	}
}
