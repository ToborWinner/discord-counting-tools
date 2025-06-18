package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class InfinityPowerOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "\"inf\"**\"inf\"**-\"inf\"" + "<<\"inf\"**\"inf\"**-\"inf\"".repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "|" + b;
	}
}
