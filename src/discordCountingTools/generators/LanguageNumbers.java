package discordCountingTools.generators;

import discordCountingTools.Generator;

public abstract class LanguageNumbers extends Generator {

	/**
	 * Get a digit
	 */
	protected abstract String getDigit(int n);

	/**
	 * Get a prefix
	 */
	protected String getPrefix() {
		return "";
	}

	/**
	 * Get a suffix
	 */
	protected String getSuffix() {
		return "";
	}

	@Override
	public String generate(int n) {
		StringBuilder builder = new StringBuilder();

		int current = n;
		while (current > 0) {
			int digit = current % 10;
			builder.append(getDigit(digit));
			current /= 10;
		}

		String result = builder.reverse().toString();
		return getPrefix() + result + getSuffix();
	}

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}
}
