import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class FactorFactoryTest {

	@Test
	public void testEmpty() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = FactorFactory.getFactors(1);
		assertEquals(expected, actual);
	}

}
