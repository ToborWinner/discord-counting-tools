package discordCountingTools;

import discordCountingTools.providers.BinaryOneOr;
import discordCountingTools.Generator;

public class Main {

	public static void main(String[] args) {
		Generator test = new BinaryOneOr();
		int num = 6;

		if (!test.meetsRequirements(num)) {
			System.out.println("Number not supported");
			return;
		}

		System.out.println(test.generate(num));
	}
}
