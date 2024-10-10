package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;
import discordCountingTools.helpers.Constants;

public class BinaryESubscriptXor extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		String subscript = Constants.E.getVariant("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS").getName();
		String three = "-~" + subscript;
		if (n % 2 == 1) {
			return subscript + ("<<" + subscript).repeat((n - 1) / 2);
		}

		if (n == 0) {
			return subscript + "<<" + three + ">>" + subscript + ">>" + subscript;
		}

		int actual = n - 1;
		int amount = (int) Math.floor(actual / 3);
		// Amount of +3 = actual - 2*amount
		// Amount of -2 = actual - 3*amount
		return subscript + ("<<" + three).repeat(actual - 2 * amount) + (">>" + subscript).repeat(actual - 3 * amount);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "⊻" + b;
	}
}
