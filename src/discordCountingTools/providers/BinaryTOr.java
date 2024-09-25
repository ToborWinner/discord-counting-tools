package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryTOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "Τ÷Τ"+"<<Τ÷Τ".repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a+"|"+b;
	}
}
