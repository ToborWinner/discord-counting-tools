package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryOneOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "1"+"<<1".repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a+"|"+b;
	}
}
