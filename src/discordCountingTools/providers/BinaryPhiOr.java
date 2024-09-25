package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryPhiOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "Φ"+"<<Φ".repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a+"|"+b;
	}
}
