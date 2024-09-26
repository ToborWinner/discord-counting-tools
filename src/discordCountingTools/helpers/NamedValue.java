package discordCountingTools.helpers;

import java.util.HashMap;
import java.util.Random;

public class NamedValue {
	private String name;
	private double value;
	
	public NamedValue(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}
}