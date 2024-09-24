package discordCountingTools.generators;

import discordCountingTools.Generator;

public class SubtractPowersOfTwo extends Generator {
	String getString(int n) {
		int m = (int) Math.ceil((Math.log(n) / Math.log(2)));
		
		String result = getPowerOfTwo(m);
		
		n = (int) Math.pow(2, m) - n;
		
		while (n > 0) {
			int currentExponent = (int) (Math.log(n) / Math.log(2));
			n -= Math.pow(2, currentExponent);
			
			result += "-" + getPowerOfTwo(currentExponent);
			
		}
		return result;
	}
}
