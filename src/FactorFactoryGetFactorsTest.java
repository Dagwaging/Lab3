import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorFactoryGetFactorsTest {

	@Test
	public void testThatOneHasNoPrimeFactors() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = FactorFactory.getFactors(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatTwoHasOnlyItselfAsPrimeFactor() {
		List<Integer> expected = Arrays.asList(2);
		List<Integer> actual = FactorFactory.getFactors(2);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatThreeHasOnlyItselfAsPrimeFactor() {
		List<Integer> expected = Arrays.asList(3);
		List<Integer> actual = FactorFactory.getFactors(3);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatFourHasTwoAndTwoAsPrimeFactors() {
		List<Integer> expected = Arrays.asList(2, 2);
		List<Integer> actual = FactorFactory.getFactors(4);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatSixHasTwoAndThreeAsPrimeFactors() {
		List<Integer> expected = Arrays.asList(2, 3);
		List<Integer> actual = FactorFactory.getFactors(6);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatEightHasTwoTwoAndTwoAsPrimeFactors() {
		List<Integer> expected = Arrays.asList(2, 2, 2);
		List<Integer> actual = FactorFactory.getFactors(8);
		assertEquals(expected, actual);
	}

	@Test
	public void testThatNineHasThreeAndThreeAsPrimeFactors() {
		List<Integer> expected = Arrays.asList(3, 3);
		List<Integer> actual = FactorFactory.getFactors(9);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFinalPrimeFactors() {
		List<Integer> expected = Arrays.asList(5, 7, 7, 1327);
		List<Integer> actual = FactorFactory.getFactors(325115);
		assertEquals(expected, actual);	
	}
}
