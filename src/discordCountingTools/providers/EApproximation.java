package discordCountingTools.providers;

import discordCountingTools.helpers.Constants;
import discordCountingTools.helpers.NamedValue;
import java.util.List;
import discordCountingTools.generators.Approximation;

public class EApproximation extends Approximation {

	@Override
	protected List<NamedValue> getValues() {
		return List.of(
				Constants.E.getVariant("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS"));
	}

	@Override
	protected String getPrefix() {
		return "__";
	}

	@Override
	protected String getSuffix() {
		return "__";
	}
}
