import java.util.ArrayList;
import java.util.List;


public class FactorFactory {

	public static List<Integer> getFactors(int i) {
		List<Integer> factors = new ArrayList<Integer>();

		switch(i) {
		case 2:
			factors.add(2);
			break;
		case 3:
			factors.add(3);
			break;
		}

		return factors;
	}

}
