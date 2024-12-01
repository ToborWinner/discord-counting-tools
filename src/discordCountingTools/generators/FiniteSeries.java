package discordCountingTools.generators;

import discordCountingTools.Generator;

public abstract class FiniteSeries extends Generator {

	// Returns a sum of f(k, x), where k goes from startValue to endValue
	// and x can be a vector of any amount of fixed elements.
	// A good example of this is approximating a Riemann-Integral.
	// There is also the option to provide a scalar, which gets
	// added to the end of the summation, effectively multiplying
	// the whole result by a number. This can be used to decrease
	// string length significantly.
	
	protected int startValue;
	protected int endValue;
	
	@Override
	public String generate(int n) {
		double[] x = getFunctionValues(n);
		
		String stringFragment = "(";
		String scalar = getScalar(x);
		for (int k = startValue; k < endValue; k++) {
			stringFragment += "(" + getSeriesElement(k, x) + ")+";
		}
		stringFragment += "(" + getSeriesElement(endValue, x) + "))";
		if (scalar != "") {
			stringFragment += scalar;
		}
		return stringFragment;
	}
	
	protected abstract double[] getFunctionValues(int n);
	
	protected String getScalar(double[] x) {
		return "";
	}
	
	protected abstract String getSeriesElement(int k, double[] x);

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}
}
