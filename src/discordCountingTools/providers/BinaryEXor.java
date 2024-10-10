package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;
import discordCountingTools.helpers.Constants;

public class BinaryEXor extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		String e = Constants.E.getName();
		String three = "-~" + e;
		if (n % 2 == 1) {
			return e + ("<<" + e).repeat((n - 1) / 2);
		}

		if (n == 0) {
			return e + "<<" + three + ">>" + e + ">>" + e;
		}

		int actual = n - 1;
		int amount = (int) Math.floor(actual / 3);
		// Amount of +3 = actual - 2*amount
		// Amount of -2 = actual - 3*amount
		return e + ("<<" + three).repeat(actual - 2 * amount) + (">>" + e).repeat(actual - 3 * amount);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "⊻" + b;
	}
}
