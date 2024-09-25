package discordCountingTools;

import discordCountingTools.providers.BinaryOneOr;
import discordCountingTools.providers.BinaryPhiOr;
import discordCountingTools.providers.BinaryTOr;
import discordCountingTools.providers.ComplementZeroOne;
import discordCountingTools.providers.ZeroToZero;
import java.util.HashMap;
import discordCountingTools.providers.BinaryDivOr;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0 || args.length > 2) {
			// TODO: Save somewhere in memory the current number and increment by 2 each time so you can count without inserting number.
			System.out.println("Please specify an argument. Usage: [mode] <num>");
			System.exit(1);
		}

		String numberString = args[0];
		String mode = args[0];

		if (args.length == 1) {
			mode = "rand";
		} else {
			numberString = args[1];
		}

		HashMap<String[], Generator> generators = getAvailableGenerators();

		if (generators.isEmpty()) {
			System.out.println("No generators found.");
			System.exit(1);
		}

		Generator gen;

		if (mode == "rand") {
			gen = getRandomGenerator(generators);
		} else {
			gen = getGeneratorFromKey(generators, mode);
		}

		if (gen == null) {
			System.out.println("Generator not found.");
			System.exit(1);
		}

		int num = -1;

		// Parse the number
		try {
			num = Integer.parseInt(numberString);
		} catch (NumberFormatException e) {
			System.out.println("Please provide a valid natural number.");
			System.exit(1);
        }

		if (num < 1) {
			System.out.println("Please provide a valid natural number.");
			System.exit(1);
		}

		if (!gen.meetsRequirements(num)) {
			System.out.println("Number not supported for this generator.");
			System.exit(1);
			return;
		}

		String result = gen.generate(num);
		System.out.println(result);
	}

	private static HashMap<String[], Generator> getAvailableGenerators() {
		HashMap<String[], Generator> generators = new HashMap<String[], Generator>();
		// TODO: Maybe automatically read providers folder.

		generators.put(new String[]{"1"}, new BinaryOneOr());
		generators.put(new String[]{"div","d"}, new BinaryDivOr());
		generators.put(new String[]{"0"}, new ZeroToZero());
		generators.put(new String[]{"01","c"}, new ComplementZeroOne());
		generators.put(new String[]{"phi","p"}, new BinaryPhiOr());
		generators.put(new String[]{"tau","t"}, new BinaryTOr());

		return generators;
	}

	private static Generator getRandomGenerator(HashMap<String[], Generator> generators) {
		if (generators.isEmpty()) {
			return null;
		}
		Object[] values = generators.values().toArray();
		return (Generator) values[(int) Math.floor(Math.random() * values.length)];
	}

	private static Generator getGeneratorFromKey(HashMap<String[], Generator> generators, String mode) {
		for (HashMap.Entry<String[], Generator> entry : generators.entrySet()) {
			String[] key = entry.getKey();
			for (String str : key) {
				if (str.equals(mode)) {
					return entry.getValue(); // Return the associated value
				}
			}
		}
		return null; // Return null if no match is found
	}
}
