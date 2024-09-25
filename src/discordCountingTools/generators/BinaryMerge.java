package discordCountingTools.generators;

import java.util.ArrayList;
import discordCountingTools.Generator;


public abstract class BinaryMerge extends Generator {

	/**
	 * Generate a String equal to 2^n
	 * @param n The power to achieve
	 */
	protected abstract String getPowerOfTwo(int n);

	/**
	 * Add the power of two to a string containing the rest of the powers.
	 */
	protected abstract String addPower(String a, String b);

	@Override
	public String generate(int n) {
		ArrayList<String> powers = new ArrayList<String>();
		
		int highestPower = (int) Math.floor(Math.log(n) / Math.log(2));

		int power = (int) Math.pow(2, highestPower);
		int current = n;

		// Convert to binary digits
		for (int i = highestPower; i >= 0; i--) {
			if (current < power) {
				power /= 2;
				continue;
			};
			// We know this bit is 1. Add the generated string to powers
			powers.add(getPowerOfTwo(i));
			
			// Subtract the power of two
			current -= power;

			// Go to the next power of two
			power /= 2;
		}

		// Merge the power strings
		String result = powers.get(0);

		for (int i = 1; i < powers.size(); i++) {
			result = addPower(result, powers.get(i));
		}

		return result;
	}

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}
}
