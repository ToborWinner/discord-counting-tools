package discordCountingTools.generators;

import discordCountingTools.helpers.NamedValue;
import discordCountingTools.Generator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class Exponentiation extends Generator {

	protected final double maxError = 0.499;

	/**
	 * Get a list of NamedValues that can be used in the exponentiation
	 */
	protected abstract List<NamedValue> getValues();

	/**
	 * Get an exponent limit.
	 */
	protected abstract int getExponentLimit();

	/**
	 * Get a suffix
	 */
	protected String getSuffix() {
		return "";
	}

	/**
	 * Get a prefix
	 */
	protected String getPrefix() {
		return "";
	}

	@Override
	public String generate(int n) {
		List<NamedValue> numbers = getValues();

		for (int exp = 1; exp < getExponentLimit(); exp += 2) {
			for (NamedValue starting : numbers) {
				String generated = generateRec(numbers, n, starting.getValue(), starting.getName(), exp);
				if (generated != null)
					return getPrefix() + generated + getSuffix();
			}
		}

		return null;
	}

	/**
	 * Recursively generate a working string.
	 */
	private String generateRec(List<NamedValue> numbers, double n, double current, String current_str, int amount) {
		for (NamedValue a : numbers) {
			double next = Math.pow(a.getValue(), current);
			if (amount == 0) {
				if (Math.abs(next - n) < maxError) {
					return a.getName() + "**" + current_str;
				}
				next = Math.pow(a.getValue(), -current);
				if (Math.abs(next - n) < maxError) {
					return a.getName() + "**-" + current_str;
				}
			} else {
				String generated = generateRec(numbers, n, next, a.getName() + "**" + current_str, amount - 1);
				if (generated != null)
					return generated;
				next = Math.pow(a.getValue(), -current);
				generated = generateRec(numbers, n, next, a.getName() + "**-" + current_str, amount - 1);
				if (generated != null)
					return generated;
			}
		}
		return null;
	}

	/**
	 * Test the highest number achievable with each exponent amount until maxAmount
	 */
	public void testLimit(int maxAmount) {
		List<NamedValue> numbers = getValues();

		for (int cur = 1; cur < maxAmount; cur += 2) {
			int num = 1;
			while (num < 10000000) {
				boolean dontBreak = false;
				for (NamedValue starting : numbers) {
					String generated = generateRec(numbers, num, starting.getValue(), starting.getName(), cur);
					if (generated != null) {
						dontBreak = true;
						break;
					}
				}
				if (!dontBreak) {
					break;
				}
				System.out.println("Passed num " + num + " with exponents " + (cur + 1));
				num++;
			}
			System.out.println("Limit for amount of exponents " + (cur + 1) + " is " + (num - 1) + ".");
		}
	}
}
