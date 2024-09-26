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
		return getRandom("");
	}
	
	// Returns a random NamedValue containing all of the words in filter.
	// Words may be supplied as a single String, separated by spaces.
	public NamedValue getRandom(String filterList) {
		String[] keyArray = getFilteredKeyArray(filterList);
		if (keyArray.length == 0) {
			return null;
		}
		return variants.get(keyArray[new Random().nextInt(keyArray.length)]);
	}
	
	public RandomizedNamedValue getRandomizedNamedValue() {
		return getRandomizedNamedValue("");
	}
	
	// Returns a RandomizedNamedValue object, which on a getName()
	// call returns a random name matching the filters.
	public RandomizedNamedValue getRandomizedNamedValue(String filter) {
		String[] keyArray = getFilteredKeyArray(filter);
		String[] nameArray = new String[keyArray.length];
		
		for (int i = 0; i < keyArray.length; i++) {
			nameArray[i] = getVariant(keyArray[i]).getName();
		}
		
		return new RandomizedNamedValue(nameArray, getValue());
	}
	
	private String[] getFilteredKeyArray(String filterList) {
		return variants.keySet().stream().filter(w -> {
			for (String filter : filterList.split(" ")) {
				if (!w.contains(filter)) {
					return false;
				}
			}
			return true;
		}).toArray(String[]::new);
	}
}
