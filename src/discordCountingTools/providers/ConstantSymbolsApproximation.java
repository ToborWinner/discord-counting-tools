package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Approximation;

public class ConstantSymbolsApproximation extends Approximation {

	@Override
	protected List<NamedValue> getValues() {
		return List.of(
			Constants.PI.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF"),
			Constants.TAU.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF"),
			Constants.PHI.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF")
		);
	}
}
