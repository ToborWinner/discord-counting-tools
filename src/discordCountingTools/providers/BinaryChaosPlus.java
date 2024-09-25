package discordCountingTools.providers;

import discordCountingTools.generators.BinaryMerge;

public class BinaryChaosPlus extends BinaryMerge {

	@Override
	protected String getPowerOfTwo(int n) {
		String result = "("+getRandomOne();

		for (int i = 0; i < n; i++) {
			result += "×"+getRandomTwo();
		}

		result += ")";
		return result;
	}

	@Override
	protected String addPower(String a, String b) {
		return a+"+"+b;
	}

	@Override
	protected String getPrefix() {
		return "~~";
	}

	@Override
	protected String getSuffix() {
		return "-0\\-~~1";
	}

	private String getRandomOne() {
		return "(𝟉**"+getRandomInner()+"⊻"+getRandomInner()+"**𝞟)";
	}

	private String getRandomTwo() {
		return "("+getRandomOne()+"+"+getRandomOne()+")";
	}

	private String getRandomInner() {
		return getRandomRoot()+"("+getRandomFraction()+")"+getRandomExponent()+getRandomExponent();
	}

	private String getRandomFraction() {
		String[] fractions = new String[]{"½","⅓","⅕","⅙","⅛","⅔","⅖","⅚","⅜","¾","⅗","⅝","⅞","⅘","¼","⅐","⅑","⅒"};
		return getRandomElement(fractions);
	}

	private String getRandomExponent() {
		//String[] exponents = new String[]{"⁰","¹","²","³","⁴","⁵","⁶","⁷","⁸","⁹"};
		String[] exponents = new String[]{"³","⁴","⁵","⁶"};
		return getRandomElement(exponents);
	}


	private String getRandomRoot() {
		String[] roots = new String[]{"√","∛","∜"};
		return getRandomElement(roots);
	}

	/**
	 * Return a random element of the input array
	 * @param The input array
	 */
	private <T> T getRandomElement(T[] array) {
		return array[(int) Math.floor(Math.random() * array.length)];
	}
}
