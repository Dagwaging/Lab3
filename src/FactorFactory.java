import java.util.ArrayList;
import java.util.List;


public class FactorFactory {

	public static List<Integer> getFactors(int i) {
		List<Integer> factors = new ArrayList<Integer>();

		if(i == 2) {
			factors.add(2);
		}

		return factors;
	}

}
