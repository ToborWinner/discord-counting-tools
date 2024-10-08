package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Approximation;

public class VariableSymbolsApproximation extends Approximation {

	@Override
	protected List<NamedValue> getValues() {
		return List.of(
				Constants.PI.getRandomizedNamedValue(),
				Constants.TAU.getRandomizedNamedValue(),
				Constants.PHI.getRandomizedNamedValue());
	}
}
