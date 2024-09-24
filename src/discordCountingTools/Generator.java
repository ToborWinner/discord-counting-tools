package discordCountingTools;

public abstract class Generator {
	/**
	 * Function to generate the final String for any number n that meets the requirements
	 */
	public abstract String generate(int n);
	
	/**
	 * Function to check whether the method can be used with the number n
	 */
	public abstract boolean meetsRequirements(int n);
}
