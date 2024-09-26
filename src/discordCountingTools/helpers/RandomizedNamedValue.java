package discordCountingTools.helpers;

import java.util.Random;

public class RandomizedNamedValue extends NamedValue {
	String[] names;
	Random random;
	
	public RandomizedNamedValue(String[] names, double value) {
		super("", value);
		this.names = names;
		this.random = new Random();
	}
	
	public String getName() {
		return names[random.nextInt(names.length)];
	}
}
