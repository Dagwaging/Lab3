import java.util.ArrayList;
import java.util.List;

public class FactorFactory {

	public static List<Integer> getFactors(int i) {
		List<Integer> factors = new ArrayList<Integer>();

		for (int factor = 2; i > 1; factor++) {
			for (; i % factor == 0; i /= factor) {
				factors.add(factor);
			}
		}

		return factors;
	}

	public static ArrayList<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if(i > 2) {
			primes.add(2);
		}
		
		return primes;
	}

}
