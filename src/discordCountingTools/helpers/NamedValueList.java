package discordCountingTools.helpers;

import java.util.HashMap;
import java.util.Random;

import discordCountingTools.helpers.NamedValue;

public class NamedValueList extends NamedValue {
	private HashMap<String, NamedValue> variants;
	
	public NamedValueList(String name, double value, HashMap<String, NamedValue> variants) {
		super(name, value);
		this.variants = variants;
	}
	
	public NamedValue getVariant(String key) {
		return variants.get(key);
	}
	
	public NamedValue getRandom() {
		String[] keyArray = variants.keySet().toArray(String[]::new);
		return variants.get(keyArray[new Random().nextInt(keyArray.length)]);	
	}
	
	// Returns a random NamedValue containing all of the words in filter.
	// Words may be supplied as a single String, separated by spaces.
	public NamedValue getRandom(String filterList) {
		String[] keyArray = variants.keySet().stream().filter(w -> {
			for (String filter : filterList.split(" ")) {
				if (!w.contains(filter)) {
					return false;
				}
			}
			return true;
		}).toArray(String[]::new);
		// Handle cases with no matches.
		if (keyArray.length == 0) {
			return null;
		}
		return variants.get(keyArray[new Random().nextInt(keyArray.length)]);
	}
}
