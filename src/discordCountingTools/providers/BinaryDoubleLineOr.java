package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryDoubleLineOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~0"
				+ "<<-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~0"
						.repeat(n);
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
