package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Exponentiation;

public class EGammaExponentiation extends Exponentiation {

	@Override
	public boolean meetsRequirements(int n) {
		return n <= 2128;
	}

	@Override
	public boolean useNegativePowers() {
		return false;
	}

	@Override
	public int getExponentLimit() {
		return 24;
	}

	@Override
	protected List<NamedValue> getValues() {
		return List.of(Constants.E.getVariant("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS"),
				Constants.GAMMA.getVariant("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS"));
	}
}
