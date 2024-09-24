package discordCountingTools;

import discordCountingTools.Generator;
import discordCountingTools.providers.ComplementZeroOne;
import discordCountingTools.providers.ZeroToZero;

public class Main {

	public static void main(String[] args) {
		Generator test = new ComplementZeroOne();
		int num = 6;

		if (!test.meetsRequirements(num)) {
			System.out.println("Number not supported");
			return;
		}

		System.out.println(test.generate(num));
	}
}
