package discordCountingTools;

import discordCountingTools.generators.ZeroToZero;
import discordCountingTools.Generator;

public class Main {

	public static void main(String[] args) {
		Generator test = new ZeroToZero();
		int num = 6;

		if (!test.meetsRequirements(num)) {
			System.out.println("Number not supported");
			return;
		}

		System.out.println(test.generate(num));
	}
}
