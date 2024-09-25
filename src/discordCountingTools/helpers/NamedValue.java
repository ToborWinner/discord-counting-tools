package discordCountingTools.helpers;

public class NamedValue {
	private String name;
	private double value;

	public static NamedValue PI_SYMBOL = new NamedValue("π", Math.PI);
	public static NamedValue PI = new NamedValue("pi", Math.PI);
	public static NamedValue PI_SYMBOL_UPPERCASE = new NamedValue("Π", Math.PI);
	public static NamedValue TAU_SYMBOL = new NamedValue("τ", Math.PI * 2);
	public static NamedValue TAU = new NamedValue("tau", Math.PI * 2);
	public static NamedValue TAU_SYMBOL_UPPERCASE = new NamedValue("Τ", Math.PI * 2);
	public static NamedValue E = new NamedValue("e", Math.E);
	public static NamedValue PHI_SYMBOL = new NamedValue("Φ", (1 + Math.sqrt(5)) / 2);
	public static NamedValue PHI = new NamedValue("phi", (1 + Math.sqrt(5)) / 2);
	
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
