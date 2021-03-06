import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class FactorFactoryGenerateTest {
	private int number;
	private List<Integer> expected;

	public FactorFactoryGenerateTest(int number, List<Integer> expected) {
		this.number = number;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> primes() {
		return Arrays.asList(new Object[][] {
				{ 1, new ArrayList<Integer>() },
				{ 3, Arrays.asList(2) },
				{ 4, Arrays.asList(2, 3) },
				{ 6, Arrays.asList(2, 3, 5) },
				{ 8, Arrays.asList(2, 3, 5, 7) },
				{ 12, Arrays.asList(2, 3, 5, 7, 11) },
				{ 30, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29) },
				{ 100, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97) }
		});
	}
	
	@Test
	public void testPrimes() {
		List<Integer> actual = FactorFactory.generate(number);
		assertEquals(expected, actual);
	}
}
