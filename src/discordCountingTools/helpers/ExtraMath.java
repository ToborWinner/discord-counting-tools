package discordCountingTools.helpers;

public class ExtraMath {
	// Returns an approximation of (x-1)! using Stirling's approximation
	// The error becomes < 0.01 at about x = 1.5
	// gamma(x) < (x-1)! for all valid x
	public static double gamma(double x) {
		x--;
		if (x % 1 == 0) {	
			double result = 1;
			while (x > 1) {
				result = result * x;
				x--;
			}
			return result;
		}
		return Math.sqrt(2 * Math.PI * x) * Math.pow((x / Math.E), x) * Math.exp(1 / (12 * x) - 1 / (360 * Math.pow(x, 3))) ;
	}
	
	// Returns an approximation of the digamma function
	// Since this relies on the accuracy of gamma,
	// its error only becomes < 0.01 at about x = 1.8
	public static double digamma(double x) {
		return (gamma(x+0.01) - gamma(x-0.01)) / (0.02 * gamma(x));
	}
	
	// Uses the Euler method to return a number y so that gamma(y) = x
	// This method has a linearly increasing error of < 10^-9 for x < 100,000
	// assuming that both gamma() and digamma() are accurate
	public static double inverseGamma(double x) {
		double y = 1;
		double x2 = x;
		while (x2 > 1) {
			y = y + 1;
			x2 = x2 / y;
		}
		int stepCount = (int) y;
		
		if (x2 == 1) {
			return y+1;
		}
		
		for (int i = 1; i < stepCount + 4; i++) {
			y -= (gamma(y)-x) / (gamma(y)*digamma(y));
		}
		return y;
	}
}