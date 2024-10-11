package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.generators.LanguageNumbers;

public class LanguageNumbersPrefixed extends LanguageNumbers {

	@Override
	protected String getDigit(int n) {
		return Constants.DIGITS.getRandom(n + " " + "LEFT-TO-RIGHT").getName();
	}

	@Override
	protected String getPrefix() {
		int randLength = (int) Math.floor(Math.random() * 30);
		String prefix = "";

		for (int i = 0; i < randLength; i++) {
			prefix += Constants.DIGITS.getRandom("0 LEFT-TO-RIGHT").getName();
		}

		return prefix;
	}
}
