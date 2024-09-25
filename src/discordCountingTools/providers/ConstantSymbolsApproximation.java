package discordCountingTools.providers;

import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Approximation;

public class ConstantSymbolsApproximation extends Approximation {

	@Override
	protected List<NamedValue> getValues() {
		return List.of(
			NamedValue.PI_SYMBOL,
			NamedValue.TAU_SYMBOL,
			NamedValue.PHI_SYMBOL
		);
	}
}
