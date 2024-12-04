package discordCountingTools.helpers;

public class ExtraMath {
	// Returns an approximation of (x-1)! using an extended Stirling's approximation.
	// The value of the approximation is evaluated on the interval [3, 4) due to the
	// error being the smallest in that interval, then shifted to the correct value
	// using standard rules for the gamma function.
	// As such, error is smallest for x in [3, 4) and goes up with distance to the interval.
	// This implementation is based on G. Nemes, Asymptotic Expansions for Integrals.
	
	// To improve accuracy beyond this point, adding more stirling coefficients is sufficient.
	// However, it is probably a good idea to switch this over to bigdecimal at that point.
	private static final double[] stirlingCoefficients = {1, 1.0/12, 1.0/288, -139.0/51840, -571.0/2488320};
	public static double gamma(double x) {
		double difference = Math.floor(x-3);
		x -= difference;
		double value;
		
		if (x == 3) {
			value = 2;
		} else {
			value = Math.sqrt(2 * Math.PI) * Math.pow(x, x-0.5) * Math.exp(-x);
			double coefficientSum = 0;
			for (int k = 0; k < stirlingCoefficients.length; k++) {
				coefficientSum += stirlingCoefficients[k] / Math.pow(x, k);
			}
			value *= coefficientSum;
		}
		
		x += difference;
		
		// Readjust solution according to difference
		while (difference < 0) {
			value /= (x - difference - 1);
			difference++;
		}
		while (difference > 0) {
			value *= (x - difference);
			difference--;
		}
		return value;
	}
	
	// Returns an approximation of the digamma function
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
		double gammaY;
		for (int i = 1; i < stepCount + 4; i++) {
			gammaY = gamma(y);
			y -= (gammaY-x) / (gammaY*digamma(y));
		}
		return y;
	}
}