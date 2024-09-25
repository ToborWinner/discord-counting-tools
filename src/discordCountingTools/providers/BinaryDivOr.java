package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryDivOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "Π÷Π"+"<<Π÷Π".repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a+"|"+b;
	}
}
