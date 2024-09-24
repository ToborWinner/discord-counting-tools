package discordCountingTools.providers;

import discordCountingTools.interfaces.PowerOfTwo;

public class ZeroToZero implements PowerOfTwo {
	public String getPowerOfTwo(int n) {
		return "(" + getNumber(2) + ")^(" + getNumber(n) + ")";
	}
	
	private String getNumber(int n) {
		return "(" + "(0^0)-".repeat(n+1) + "(0^0))\\-(0^0)";
	}
}
