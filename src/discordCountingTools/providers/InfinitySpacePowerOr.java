package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class InfinitySpacePowerOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return "'        INFINITY        '**'        INFINITY        '**-'        INFINITY        '"
				+ "<<'        INFINITY        '**'        INFINITY        '**-'        INFINITY        '"
						.repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "|" + b;
	}

	@Override
	public boolean meetsRequirements(int n) {
		return n > 1 && n <= 64;
	}
}
