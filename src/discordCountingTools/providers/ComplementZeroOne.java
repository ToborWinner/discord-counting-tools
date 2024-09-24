package discordCountingTools.providers;

import discordCountingTools.generators.SubtractPowersOfTwo;

public class ComplementZeroOne extends SubtractPowersOfTwo {
	@Override
	protected String getPowerOfTwo(int n) {
		return "1\\-(~~~0" + "\\-~~~1".repeat(n) + ")";
	}
}
