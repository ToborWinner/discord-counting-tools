package discordCountingTools;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import discordCountingTools.providers.*;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0 || args.length > 2) {
			// TODO: Save somewhere in memory the current number and increment by 2 each
			// time so you can count without inserting number.
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

		Generator gen;

		if (mode.equals("rand")) {
			gen = getRandomGenerator(generators, num, null);
		} else if (mode.equals("classic")) {
			gen = getRandomGenerator(generators, num, "x v e l rs");
		} else {
			gen = getGeneratorFromKey(generators, mode);
		}

		if (gen == null) {
			System.out.println("Generator not found.");
			System.exit(1);
		}

		if (!gen.meetsRequirements(num)) {
			System.out.println("Number not supported for this generator.");
			System.exit(1);
			return;
		}

		String result = null;
		int failsafe = 0;
		while (result == null || result.length() >= 2000) {
			result = gen.generate(num);
			failsafe++;
			if (failsafe > 100) {
				System.out.println("Too many attempts.");
				System.exit(1);
			}
		}

		System.out.println(result);
	}

	private static HashMap<String[], Generator> getAvailableGenerators() {
		HashMap<String[], Generator> generators = new HashMap<String[], Generator>();
		// TODO: Maybe automatically read providers folder.

		generators.put(new String[] { "1" }, new BinaryOneOr());
		generators.put(new String[] { "div", "d" }, new BinaryDivOr());
		generators.put(new String[] { "n" }, new BinaryDoubleLineOr());
		generators.put(new String[] { "0" }, new ZeroToZero());
		generators.put(new String[] { "01", "c" }, new ComplementZeroOne());
		generators.put(new String[] { "phi", "p" }, new BinaryPhiOr());
		generators.put(new String[] { "tau", "t" }, new BinaryTOr());
		generators.put(new String[] { "rs" }, new BinaryESubscriptXor());
		generators.put(new String[] { "r" }, new BinaryEXor());
		generators.put(new String[] { "s", "sa" }, new ConstantSymbolsApproximation());
		generators.put(new String[] { "e", "ee" }, new EApproximation());
		generators.put(new String[] { "v", "va" }, new VariableSymbolsApproximation());
		generators.put(new String[] { "x", "chaos" }, new BinaryChaosPlus());
		generators.put(new String[] { "l", "language" }, new LanguageNumbersPrefixed());

		return generators;
	}

	private static Generator getRandomGenerator(HashMap<String[], Generator> generators, int n, String filter) {
		if (generators.isEmpty()) {
			return null;
		}

		List<Generator> validGenerators = generators.entrySet()
				.stream()
				.filter(entry -> entry.getValue().meetsRequirements(n)
						&& (filter == null || !hasIt(entry.getKey(), filter)))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());

		return validGenerators.get((int) Math.floor(Math.random() * validGenerators.size()));
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

	private static boolean hasIt(String[] keys, String filter) {
		List<String> keyList = Arrays.asList(keys);
		for (String element : filter.split(" ")) {
			if (keyList.contains(element))
				return true;
		}
		return false;
	}
}
