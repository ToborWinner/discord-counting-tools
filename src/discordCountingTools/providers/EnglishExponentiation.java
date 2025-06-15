package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Exponentiation;

public class EnglishExponentiation extends Exponentiation {

	@Override
	public boolean meetsRequirements(int n) {
		return n <= 5071; // Highest number I tested with 8 exponents.
	}

	@Override
	protected List<NamedValue> getValues() {
		return List.of(Constants.PI, Constants.TAU, Constants.PHI, Constants.E);
	}
}
