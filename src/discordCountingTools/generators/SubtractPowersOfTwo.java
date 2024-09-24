package discordCountingTools.generators;

import discordCountingTools.Generator;

public abstract class SubtractPowersOfTwo extends Generator {

	/**
	 * Generate a String equal to 2^n
	 */
	protected abstract String getPowerOfTwo(int n);

	@Override
	public String generate(int n) {
		int logarithm = (int) Math.ceil(Math.log(n) / Math.log(2));

		String result = getPowerOfTwo(logarithm);

		int converted = (int) Math.pow(2, logarithm) - n;

		while (n > 0) {
			int currentExponent = (int) (Math.log(converted) / Math.log(2));
			converted -= Math.pow(2, currentExponent);

			result += "-" + getPowerOfTwo(currentExponent);
		}

		return result;
	}

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}
}
