package discordCountingTools.helpers;

import java.util.HashMap;
import java.util.Random;

public class NamedValue {
	private String name;
	private double value;
	private HashMap<String, NamedValue> variants;

	/*
	 * Symbols are described in the following order:
	 * TEXT - REGULAR - MATHEMATICAL - SUBSCRIPT - SUPERSCRIPT
	 * ROMAN - ITALIC
	 * LIGHT - BOLD - DOUBLE
	 * UPPERCASE - LOWERCASE - MIXEDCASE
	 * SANS - SERIF
	 * 
	 * For symbols that consist of only regular ASCII characters,
	 * only TEXT and the case are given.
	 * 
	 * Symbols are assumed to be REGULAR, if Unicode does not
	 * call them MATHEMATICAL.
	 * 
	 * DOUBLE refers to letters written double-struck, also
	 * called "blackboard bold".
	 * 
	 * MIXEDCASE refers to Unicode characters described as "symbols".
	 */
	
	public static NamedValue PI = new NamedValue("pi", Math.PI, new HashMap<String, NamedValue>() {{
		put("TEXT UPPERCASE",                            new NamedValue("PI", Math.PI));
		put("TEXT LOWERCASE",                            new NamedValue("pi", Math.PI));
		put("TEXT MIXEDCASE",                            new NamedValue("Pi", Math.PI));
		put("REGULAR ROMAN LIGHT UPPERCASE SERIF",       new NamedValue("Π", Math.PI));
		put("REGULAR ROMAN LIGHT LOWERCASE SERIF",       new NamedValue("π", Math.PI));
		put("REGULAR ROMAN LIGHT MIXEDCASE SERIF",       new NamedValue("ϖ", Math.PI));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF",   new NamedValue("𝚷", Math.PI));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF",   new NamedValue("𝛑", Math.PI));
		put("MATHEMATICAL ROMAN BOLD MIXEDCASE SERIF",   new NamedValue("𝛡", Math.PI));
		put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛱", Math.PI));
		put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜋", Math.PI));
		put("MATHEMATICAL ITALIC LIGHT MIXEDCASE SERIF", new NamedValue("𝜛", Math.PI));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF",  new NamedValue("𝜫", Math.PI));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF",  new NamedValue("𝝅", Math.PI));
		put("MATHEMATICAL ITALIC BOLD MIXEDCASE SERIF",  new NamedValue("𝝕", Math.PI));
		put("MATHEMATICAL ROMAN DOUBLE UPPERCASE SANS",  new NamedValue("ℿ", Math.PI));
		put("MATHEMATICAL ROMAN DOUBLE LOWERCASE SANS",  new NamedValue("ℼ", Math.PI));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS",    new NamedValue("𝝥", Math.PI));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS",    new NamedValue("𝝿", Math.PI));
		put("MATHEMATICAL ROMAN BOLD MIXEDCASE SANS",    new NamedValue("𝞏", Math.PI));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS",   new NamedValue("𝞟", Math.PI));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS",   new NamedValue("𝞹", Math.PI));
		put("MATHEMATICAL ITALIC BOLD MIXEDCASE SANS",   new NamedValue("𝟉", Math.PI));
		}});
	
	public static NamedValue TAU = new NamedValue("tau", Math.TAU, new HashMap<String, NamedValue>() {{
		put("TEXT UPPERCASE",                            new NamedValue("TAU", Math.TAU));
		put("TEXT LOWERCASE",                            new NamedValue("tau", Math.TAU));
		put("TEXT MIXEDCASE",                            new NamedValue("Tau", Math.TAU));
		put("REGULAR ROMAN LIGHT UPPERCASE SERIF",       new NamedValue("Τ", Math.TAU));
		put("REGULAR ROMAN LIGHT LOWERCASE SERIF",       new NamedValue("τ", Math.TAU));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF",   new NamedValue("𝚻", Math.TAU));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF",   new NamedValue("𝛕", Math.TAU));
		put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛵", Math.TAU));
		put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜏", Math.TAU));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF",  new NamedValue("𝜯", Math.TAU));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF",  new NamedValue("𝝉", Math.TAU));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS",    new NamedValue("𝝩", Math.TAU));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS",    new NamedValue("𝞃", Math.TAU));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS",   new NamedValue("𝞣", Math.TAU));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS",   new NamedValue("𝞽", Math.TAU));	
	}});
	
	public static NamedValue GAMMA = new NamedValue("γ", 0.577215664901532, new HashMap<String, NamedValue>() {{
		put("REGULAR ROMAN LIGHT UPPERCASE SERIF",       new NamedValue("Γ", 0.577215664901532));
		put("REGULAR ROMAN LIGHT LOWERCASE SERIF",       new NamedValue("γ", 0.577215664901532));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF",   new NamedValue("𝚪", 0.577215664901532));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF",   new NamedValue("𝛄", 0.577215664901532));
		put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛤", 0.577215664901532));
		put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝛾", 0.577215664901532));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF",  new NamedValue("𝜞", 0.577215664901532));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF",  new NamedValue("𝜸", 0.577215664901532));
		put("REGULAR ROMAN DOUBLE UPPERCASE SANS",       new NamedValue("ℾ", 0.577215664901532));
		put("REGULAR ROMAN DOUBLE LOWERCASE SANS",       new NamedValue("ℽ", 0.577215664901532));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS",    new NamedValue("𝝘", 0.577215664901532));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS",    new NamedValue("𝝲", 0.577215664901532));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS",   new NamedValue("𝞒", 0.577215664901532));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS",   new NamedValue("𝞬", 0.577215664901532));
		put("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS",      new NamedValue("ᵧ", 0.577215664901532));
	}});
		
	public static NamedValue PHI = new NamedValue("phi", 1.618033988749895, new HashMap<String, NamedValue>() {{
		put("TEXT UPPERCASE",                            new NamedValue("PHI", 1.618033988749895));
		put("TEXT LOWERCASE",                            new NamedValue("phi", 1.618033988749895));
		put("TEXT MIXEDCASE",                            new NamedValue("Phi", 1.618033988749895));
		put("REGULAR ROMAN LIGHT UPPERCASE SERIF",       new NamedValue("Φ", 1.618033988749895));
		put("REGULAR ROMAN LIGHT LOWERCASE SERIF",       new NamedValue("φ", 1.618033988749895)); // these two characters are not identical,
		put("REGULAR ROMAN LIGHT MIXEDCASE SERIF",       new NamedValue("ϕ", 1.618033988749895)); // despite many fonts showing them as such
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF",   new NamedValue("𝚽", 1.618033988749895));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF",   new NamedValue("𝛗", 1.618033988749895));
		put("MATHEMATICAL ROMAN BOLD MIXEDCASE SERIF",   new NamedValue("𝛟", 1.618033988749895));
		put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛷", 1.618033988749895));
		put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜑", 1.618033988749895));
		put("MATHEMATICAL ITALIC LIGHT MIXEDCASE SERIF", new NamedValue("𝜙", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF",  new NamedValue("𝜱", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF",  new NamedValue("𝝋", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD MIXEDCASE SERIF",  new NamedValue("𝝓", 1.618033988749895));
		put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS",    new NamedValue("𝝫", 1.618033988749895));
		put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS",    new NamedValue("𝞅", 1.618033988749895));
		put("MATHEMATICAL ROMAN BOLD MIXEDCASE SANS",    new NamedValue("𝞍", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS",   new NamedValue("𝞥", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS",   new NamedValue("𝞿", 1.618033988749895));
		put("MATHEMATICAL ITALIC BOLD MIXEDCASE SANS",   new NamedValue("𝟇", 1.618033988749895));
	}});
		
	public static NamedValue E = new NamedValue("e", Math.E, new HashMap<String, NamedValue>() {{
		put("TEXT UPPCASE", new NamedValue("E", Math.E));
		put("TEXT LOWERCASE", new NamedValue("e", Math.E));
		put("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS", new NamedValue("ₑ", Math.E));
	}});

	public NamedValue(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public NamedValue(String name, double value, HashMap<String, NamedValue> variants) {
		this(name, value);
		this.variants = variants;
	}

	public NamedValue getVariant(String key) {
		return variants.get(key);
	}
	
	public NamedValue getRandom() {
		String[] keyArray = variants.keySet().toArray(String[]::new);
		return variants.get(keyArray[new Random().nextInt(keyArray.length)]);	
	}
	
	// returns a random NamedValue containing filter in its description
	public NamedValue getRandom(String filter) {
		String[] keyArray = variants.keySet().stream().filter(w -> w.contains(filter)).toArray(String[]::new);
		// handle cases with no matches
		if (keyArray.length == 0) {
			return null;
		}
		return variants.get(keyArray[new Random().nextInt(keyArray.length)]);
	}
	
	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}
}