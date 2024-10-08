package discordCountingTools.generators;

import discordCountingTools.helpers.NamedValue;
import discordCountingTools.Generator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.ArrayList;

public abstract class Approximation extends Generator {

	protected final int populationStepLength = 1000;
	protected final double maxError = 0.499;

	/**
	 * Get a list of NamedValues that can be used in the approximation
	 */
	protected abstract List<NamedValue> getValues();

	@Override
	public String generate(int n) {
		// Initiate values and operations
		ArrayList<NamedValue> baseValues = new ArrayList<NamedValue>(getValues());
		baseValues.sort((a, b) -> Double.compare(a.getValue(), b.getValue())); // Ascending, useful for later
		ArrayList<NamedValue> values = new ArrayList<NamedValue>(baseValues);
		String[] operations = new String[]{"+", "-", "*", "/"};

		// Populate the values ArrayList
		NamedValue currentVal = getRandomElement(values);
		for (int i = 0; i < populationStepLength; i++) {
			String operation = getRandomElement(operations);
			NamedValue val = getRandomElement(values);
			currentVal = executeOperation(currentVal, val, operation);
			values.add(currentVal);

			if (Math.random() < 0.9) {
				currentVal = getRandomElement(values);
			}
		}

		ArrayList<NamedValue> temp = new ArrayList<NamedValue>(values);

		// Filter out values that are the same
		values = new ArrayList<NamedValue>(values.stream().filter(e -> temp.stream().noneMatch(a ->
                    Math.round(e.getValue() * 1000) == Math.round(a.getValue() * 1000) &&
                    a != e &&
                    a.getName().length() <= e.getName().length()
                ) && e.getValue() > 0).collect(Collectors.toList()));

		// Sort them
		values.sort((a, b) -> Double.compare(b.getValue(), a.getValue())); // Descending

		// Ensure the error is smaller than maxError

		NamedValue current = new NamedValue("", 0);
		boolean first = true;

		while (Math.abs(current.getValue() - n) > maxError) {
			boolean found = false;
			for (NamedValue val : values) {
				// Multiplication
				if ((val.getValue()*current.getValue() <= n+maxError) && !first) {
					current = new NamedValue("("+current.getName()+")*"+val.getName(), current.getValue() * val.getValue());
					found = true;
					break;
				}
				if (val.getValue()+current.getValue() > n+maxError) continue;
				if (first) {
					current = val;
				} else {
					current = new NamedValue(
						"("+current.getName()+")+"+val.getName(),
						current.getValue()+val.getValue()
					);
				}
				found = true;
				break;
			}

			if (current.getName().length() > 2000) {
				break;
			}

			if (found) {
				first = false;
				continue;
			}

			// Generate a new smaller value
			for (NamedValue val : values) {
				for (NamedValue baseVal : baseValues) {
					if (val.getValue() / baseVal.getValue() < values.getLast().getValue()) {
						values.add(new NamedValue(
							"("+val.getValue()+")/"+baseVal.getName(),
							val.getValue() / baseVal.getValue()
						));
						break;
					}
				}
			}

			if (values.size() > 10000) {
				break;
			}
		}

		// Simplify the string by removing some unnecessary parenthesis.
		String result = current.getName();

		for (NamedValue baseVal : baseValues) {
			result = result.replaceAll(Pattern.quote("("+baseVal.getName()+")"), baseVal.getName());
		}

		return result;
	}

	@Override
	public boolean meetsRequirements(int n) {
		return true;
	}

	/**
	 * Return a random element of the input list
	 * @param The input array
	 */
	private <T> T getRandomElement(List<T> array) {
		return array.get((int) Math.floor(Math.random() * array.size()));
	}

	/**
	 * Return a random element of the input array
	 * @param The input array
	 */
	private <T> T getRandomElement(T[] array) {
		return array[(int) Math.floor(Math.random() * array.length)];
	}

	/**
	 * Create a NamedValue showing the operation between a and b.
	 * @param a The first value
	 * @param b The second value
	 * @param operation The operation to apply
	 */
	private NamedValue executeOperation(NamedValue a, NamedValue b, String operation) {
		String newString = "("+a.getName()+")"+operation+"("+b.getName()+")";
		switch (operation) {
			case "+":
				return new NamedValue(newString, a.getValue() + b.getValue());
			case "-":
				return new NamedValue(newString, a.getValue() - b.getValue());
			case "*":
				return new NamedValue(newString, a.getValue() * b.getValue());
			case "/":
				return new NamedValue(newString, a.getValue() / b.getValue());
		}
		return null;
	}
}
