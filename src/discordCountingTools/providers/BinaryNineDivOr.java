package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;
import discordCountingTools.helpers.Constants;

public class BinaryNineDivOr extends BinaryMerge {

	private final String CHAR = Constants.DIGITS.getVariant("MALAYALAM LEFT-TO-RIGHT MISSING WRONG 9").getName();

	@Override
	protected String getPowerOfTwo(int n) {
		return CHAR + "÷" + CHAR + ("<<" + CHAR + "÷" + CHAR).repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "|" + b;
	}

	@Override
	protected String getPrefix() {
		return "__";
	}

	@Override
	protected String getSuffix() {
		return "__";
	}
}
