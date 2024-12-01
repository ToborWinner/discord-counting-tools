package discordCountingTools.providers;

import java.text.DecimalFormat;

import discordCountingTools.generators.FiniteSeries;
import discordCountingTools.helpers.ExtraMath;

public class FiniteSeriesGamma extends FiniteSeries {

	double eps;
	
	// Approximates the derivative of the antiderivative of the gamma function for n.
	// The antiderivative is calculated using a Riemann sum
	public FiniteSeriesGamma() {
		startValue = 1;
		endValue = 16;
		eps = 0.01;
	}
	
	@Override
	protected double[] getFunctionValues(int n) {
		double inverseN = ExtraMath.inverseGamma(n);
		double m = Math.max(2, 2*Math.pow(inverseN, 1.62));
		return new double[]{
				inverseN,
			  	m / (endValue * 2)};
	}

	@Override
	protected String getSeriesElement(int k, double[] x) {
		String delta = round(k * x[1]);
		
		return "((" + delta + ")^(" + round(x[0] + eps - 1) + ")"
				+ "-(" + delta + ")^(" + round(x[0] - eps - 1) + "))"
					+ "/(ln(" + delta + ")*exp(" + delta + "))";
	}
	
	protected String getScalar(double[] x) {
		return "*" + round(x[1]) + "/" + round(eps * 2);
	}
	
	protected String round(double x) {
		DecimalFormat df = new DecimalFormat("#.######");
		return df.format(x);
	}
}
