package discordCountingTools.providers;

import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Approximation;

public class ConstantSymbolsApproximation extends Approximation {

	@Override
	protected List<NamedValue> getValues() {
		return List.of(
			NamedValue.PI.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF"),
			NamedValue.TAU.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF"),
			NamedValue.PHI.getVariant("REGULAR ROMAN LIGHT LOWERCASE SERIF")
		);
	}
}
