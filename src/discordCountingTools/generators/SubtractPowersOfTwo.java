package discordCountingTools.generators;

import discordCountingTools.Generator;

public abstract class SubtractPowersOfTwo extends Generator {

	/**
	 * Generate a String equal to 2^n
	 */
	protected abstract String getPowerOfTwo(int n);

	@Override
	public String generate(int n) {
		int currentExponent = (int) Math.ceil(Math.log(n) / Math.log(2));

		String result = getPowerOfTwo(currentExponent);

		int offset = (int) Math.pow(2, currentExponent) - n;

		while (offset > 0) {
			currentExponent = (int) (Math.log(offset) / Math.log(2));
			offset -= Math.pow(2, currentExponent);

			result += "-" + getPowerOfTwo(currentExponent);
		}

		return result;
	}

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}
}
