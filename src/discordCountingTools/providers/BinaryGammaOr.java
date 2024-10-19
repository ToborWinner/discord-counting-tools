package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;
import discordCountingTools.helpers.Constants;

public class BinaryGammaOr extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		return Constants.GAMMA.getName() + ("<<" + Constants.GAMMA.getName()).repeat(n);
	}

	@Override
	protected String addPower(String a, String b) {
		return a + "|" + b;
	}
}
