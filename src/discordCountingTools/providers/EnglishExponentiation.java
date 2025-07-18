package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Exponentiation;

public class EnglishExponentiation extends Exponentiation {

	@Override
	public boolean meetsRequirements(int n) {
		return n <= 8221;
	}

	@Override
	public int getExponentLimit() {
		return 8;
	}

	@Override
	protected List<NamedValue> getValues() {
		return List.of(Constants.PI, Constants.TAU, Constants.PHI, Constants.E);
	}
}
