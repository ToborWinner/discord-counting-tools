package discordCountingTools.helpers;

import java.util.HashMap;

import discordCountingTools.helpers.NamedValue;
import discordCountingTools.helpers.NamedValueList;

final public class Constants {
	private Constants() {
		// Prevents creating instances.
	}

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

	public static NamedValueList PI = new NamedValueList("pi", Math.PI, new HashMap<String, NamedValue>() {
		{
			put("TEXT UPPERCASE", new NamedValue("PI", Math.PI));
			put("TEXT LOWERCASE", new NamedValue("pi", Math.PI));
			put("TEXT MIXEDCASE", new NamedValue("Pi", Math.PI));
			put("REGULAR ROMAN LIGHT UPPERCASE SERIF", new NamedValue("Π", Math.PI));
			put("REGULAR ROMAN LIGHT LOWERCASE SERIF", new NamedValue("π", Math.PI));
			put("REGULAR ROMAN LIGHT MIXEDCASE SERIF", new NamedValue("ϖ", Math.PI));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF", new NamedValue("𝚷", Math.PI));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF", new NamedValue("𝛑", Math.PI));
			put("MATHEMATICAL ROMAN BOLD MIXEDCASE SERIF", new NamedValue("𝛡", Math.PI));
			put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛱", Math.PI));
			put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜋", Math.PI));
			put("MATHEMATICAL ITALIC LIGHT MIXEDCASE SERIF", new NamedValue("𝜛", Math.PI));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF", new NamedValue("𝜫", Math.PI));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF", new NamedValue("𝝅", Math.PI));
			put("MATHEMATICAL ITALIC BOLD MIXEDCASE SERIF", new NamedValue("𝝕", Math.PI));
			put("MATHEMATICAL ROMAN DOUBLE UPPERCASE SANS", new NamedValue("ℿ", Math.PI));
			put("MATHEMATICAL ROMAN DOUBLE LOWERCASE SANS", new NamedValue("ℼ", Math.PI));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS", new NamedValue("𝝥", Math.PI));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS", new NamedValue("𝝿", Math.PI));
			put("MATHEMATICAL ROMAN BOLD MIXEDCASE SANS", new NamedValue("𝞏", Math.PI));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS", new NamedValue("𝞟", Math.PI));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS", new NamedValue("𝞹", Math.PI));
			put("MATHEMATICAL ITALIC BOLD MIXEDCASE SANS", new NamedValue("𝟉", Math.PI));
		}
	});

	public static NamedValueList TAU = new NamedValueList("tau", Math.TAU, new HashMap<String, NamedValue>() {
		{
			put("TEXT UPPERCASE", new NamedValue("TAU", Math.TAU));
			put("TEXT LOWERCASE", new NamedValue("tau", Math.TAU));
			put("TEXT MIXEDCASE", new NamedValue("Tau", Math.TAU));
			put("REGULAR ROMAN LIGHT UPPERCASE SERIF", new NamedValue("Τ", Math.TAU));
			put("REGULAR ROMAN LIGHT LOWERCASE SERIF", new NamedValue("τ", Math.TAU));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF", new NamedValue("𝚻", Math.TAU));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF", new NamedValue("𝛕", Math.TAU));
			put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛵", Math.TAU));
			put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜏", Math.TAU));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF", new NamedValue("𝜯", Math.TAU));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF", new NamedValue("𝝉", Math.TAU));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS", new NamedValue("𝝩", Math.TAU));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS", new NamedValue("𝞃", Math.TAU));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS", new NamedValue("𝞣", Math.TAU));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS", new NamedValue("𝞽", Math.TAU));
		}
	});

	public static NamedValueList GAMMA = new NamedValueList("γ", 0.577215664901532, new HashMap<String, NamedValue>() {
		{
			put("REGULAR ROMAN LIGHT UPPERCASE SERIF", new NamedValue("Γ", 0.577215664901532));
			put("REGULAR ROMAN LIGHT LOWERCASE SERIF", new NamedValue("γ", 0.577215664901532));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF", new NamedValue("𝚪", 0.577215664901532));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF", new NamedValue("𝛄", 0.577215664901532));
			put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛤", 0.577215664901532));
			put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝛾", 0.577215664901532));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF", new NamedValue("𝜞", 0.577215664901532));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF", new NamedValue("𝜸", 0.577215664901532));
			put("REGULAR ROMAN DOUBLE UPPERCASE SANS", new NamedValue("ℾ", 0.577215664901532));
			put("REGULAR ROMAN DOUBLE LOWERCASE SANS", new NamedValue("ℽ", 0.577215664901532));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS", new NamedValue("𝝘", 0.577215664901532));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS", new NamedValue("𝝲", 0.577215664901532));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS", new NamedValue("𝞒", 0.577215664901532));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS", new NamedValue("𝞬", 0.577215664901532));
			put("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS", new NamedValue("ᵧ", 0.577215664901532));
		}
	});

	public static NamedValueList PHI = new NamedValueList("phi", 1.618033988749895, new HashMap<String, NamedValue>() {
		{
			put("TEXT UPPERCASE", new NamedValue("PHI", 1.618033988749895));
			put("TEXT LOWERCASE", new NamedValue("phi", 1.618033988749895));
			put("TEXT MIXEDCASE", new NamedValue("Phi", 1.618033988749895));
			put("REGULAR ROMAN LIGHT UPPERCASE SERIF", new NamedValue("Φ", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD MIXEDCASE SERIF", new NamedValue("𝝓", 1.618033988749895));
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SANS", new NamedValue("𝝫", 1.618033988749895));
			put("REGULAR ROMAN LIGHT LOWERCASE SERIF", new NamedValue("φ", 1.618033988749895)); // these two characters
																								// are not identical,
			put("REGULAR ROMAN LIGHT MIXEDCASE SERIF", new NamedValue("ϕ", 1.618033988749895)); // despite many fonts
																								// showing them as such
			put("MATHEMATICAL ROMAN BOLD UPPERCASE SERIF", new NamedValue("𝚽", 1.618033988749895));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SERIF", new NamedValue("𝛗", 1.618033988749895));
			put("MATHEMATICAL ROMAN BOLD MIXEDCASE SERIF", new NamedValue("𝛟", 1.618033988749895));
			put("MATHEMATICAL ITALIC LIGHT UPPERCASE SERIF", new NamedValue("𝛷", 1.618033988749895));
			put("MATHEMATICAL ITALIC LIGHT LOWERCASE SERIF", new NamedValue("𝜑", 1.618033988749895));
			put("MATHEMATICAL ITALIC LIGHT MIXEDCASE SERIF", new NamedValue("𝜙", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SERIF", new NamedValue("𝜱", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SERIF", new NamedValue("𝝋", 1.618033988749895));
			put("MATHEMATICAL ROMAN BOLD LOWERCASE SANS", new NamedValue("𝞅", 1.618033988749895));
			put("MATHEMATICAL ROMAN BOLD MIXEDCASE SANS", new NamedValue("𝞍", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD UPPERCASE SANS", new NamedValue("𝞥", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD LOWERCASE SANS", new NamedValue("𝞿", 1.618033988749895));
			put("MATHEMATICAL ITALIC BOLD MIXEDCASE SANS", new NamedValue("𝟇", 1.618033988749895));
		}
	});

	public static NamedValueList E = new NamedValueList("e", Math.E, new HashMap<String, NamedValue>() {
		{
			put("TEXT UPPCASE", new NamedValue("E", Math.E));
			put("TEXT LOWERCASE", new NamedValue("e", Math.E));
			put("SUBSCRIPT ROMAN LIGHT LOWERCASE SANS", new NamedValue("ₑ", Math.E));
		}
	});

	/*
	 * Digits are defined in the following way using tags.
	 * NAME => Signifies the name of the language/numerals
	 * LEFT-TO-RIGHT - RIGHT-TO-LEFT => Whether they are usually read left to right
	 * or right to left
	 * FULL - MISSING => Whether all digits are present or not
	 * WRONG => Signifies that the number is incorrectly implemented
	 * [0..9] => Signifies the digit
	 */

	public static NamedValueList DIGITS = new NamedValueList("0", 0, new HashMap<String, NamedValue>() {
		{
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 0", new NamedValue("0", 0));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 1", new NamedValue("1", 1));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 2", new NamedValue("2", 2));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 3", new NamedValue("3", 3));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 4", new NamedValue("4", 4));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 5", new NamedValue("5", 5));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 6", new NamedValue("6", 6));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 7", new NamedValue("7", 7));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 8", new NamedValue("8", 8));
			put("WESTERN-ARABIC LEFT-TO-RIGHT FULL 9", new NamedValue("9", 9));

			put("THAI LEFT-TO-RIGHT FULL 0", new NamedValue("๐", 0));
			put("THAI LEFT-TO-RIGHT FULL 1", new NamedValue("๑", 1));
			put("THAI LEFT-TO-RIGHT FULL 2", new NamedValue("๒", 2));
			put("THAI LEFT-TO-RIGHT FULL 3", new NamedValue("๓", 3));
			put("THAI LEFT-TO-RIGHT FULL 4", new NamedValue("๔", 4));
			put("THAI LEFT-TO-RIGHT FULL 5", new NamedValue("๕", 5));
			put("THAI LEFT-TO-RIGHT FULL 6", new NamedValue("๖", 6));
			put("THAI LEFT-TO-RIGHT FULL 7", new NamedValue("๗", 7));
			put("THAI LEFT-TO-RIGHT FULL 8", new NamedValue("๘", 8));
			put("THAI LEFT-TO-RIGHT FULL 9", new NamedValue("๙", 9));

			put("KHMER LEFT-TO-RIGHT FULL 0", new NamedValue("០", 0));
			put("KHMER LEFT-TO-RIGHT FULL 1", new NamedValue("១", 1));
			put("KHMER LEFT-TO-RIGHT FULL 2", new NamedValue("២", 2));
			put("KHMER LEFT-TO-RIGHT FULL 3", new NamedValue("៣", 3));
			put("KHMER LEFT-TO-RIGHT FULL 4", new NamedValue("៤", 4));
			put("KHMER LEFT-TO-RIGHT FULL 5", new NamedValue("៥", 5));
			put("KHMER LEFT-TO-RIGHT FULL 6", new NamedValue("៦", 6));
			put("KHMER LEFT-TO-RIGHT FULL 7", new NamedValue("៧", 7));
			put("KHMER LEFT-TO-RIGHT FULL 8", new NamedValue("៨", 8));
			put("KHMER LEFT-TO-RIGHT FULL 9", new NamedValue("៩", 9));

			put("LAO LEFT-TO-RIGHT FULL 0", new NamedValue("໐", 0));
			put("LAO LEFT-TO-RIGHT FULL 1", new NamedValue("໑", 1));
			put("LAO LEFT-TO-RIGHT FULL 2", new NamedValue("໒", 2));
			put("LAO LEFT-TO-RIGHT FULL 3", new NamedValue("໓", 3));
			put("LAO LEFT-TO-RIGHT FULL 4", new NamedValue("໔", 4));
			put("LAO LEFT-TO-RIGHT FULL 5", new NamedValue("໕", 5));
			put("LAO LEFT-TO-RIGHT FULL 6", new NamedValue("໖", 6));
			put("LAO LEFT-TO-RIGHT FULL 7", new NamedValue("໗", 7));
			put("LAO LEFT-TO-RIGHT FULL 8", new NamedValue("໘", 8));
			put("LAO LEFT-TO-RIGHT FULL 9", new NamedValue("໙", 9));

			put("DEVANAGARI LEFT-TO-RIGHT FULL 0", new NamedValue("०", 0));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 1", new NamedValue("१", 1));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 2", new NamedValue("२", 2));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 3", new NamedValue("३", 3));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 4", new NamedValue("४", 4));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 5", new NamedValue("५", 5));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 6", new NamedValue("६", 6));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 7", new NamedValue("७", 7));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 8", new NamedValue("८", 8));
			put("DEVANAGARI LEFT-TO-RIGHT FULL 9", new NamedValue("९", 9));

			put("GUJARATI LEFT-TO-RIGHT FULL 0", new NamedValue("૦", 0));
			put("GUJARATI LEFT-TO-RIGHT FULL 1", new NamedValue("૧", 1));
			put("GUJARATI LEFT-TO-RIGHT FULL 2", new NamedValue("૨", 2));
			put("GUJARATI LEFT-TO-RIGHT FULL 3", new NamedValue("૩", 3));
			put("GUJARATI LEFT-TO-RIGHT FULL 4", new NamedValue("૪", 4));
			put("GUJARATI LEFT-TO-RIGHT FULL 5", new NamedValue("૫", 5));
			put("GUJARATI LEFT-TO-RIGHT FULL 6", new NamedValue("૬", 6));
			put("GUJARATI LEFT-TO-RIGHT FULL 7", new NamedValue("૭", 7));
			put("GUJARATI LEFT-TO-RIGHT FULL 8", new NamedValue("૮", 8));
			put("GUJARATI LEFT-TO-RIGHT FULL 9", new NamedValue("૯", 9));

			put("KANNADA LEFT-TO-RIGHT FULL 0", new NamedValue("೦", 0));
			put("KANNADA LEFT-TO-RIGHT FULL 1", new NamedValue("೧", 1));
			put("KANNADA LEFT-TO-RIGHT FULL 2", new NamedValue("೨", 2));
			put("KANNADA LEFT-TO-RIGHT FULL 3", new NamedValue("೩", 3));
			put("KANNADA LEFT-TO-RIGHT FULL 4", new NamedValue("೪", 4));
			put("KANNADA LEFT-TO-RIGHT FULL 5", new NamedValue("೫", 5));
			put("KANNADA LEFT-TO-RIGHT FULL 6", new NamedValue("೬", 6));
			put("KANNADA LEFT-TO-RIGHT FULL 7", new NamedValue("೭", 7));
			put("KANNADA LEFT-TO-RIGHT FULL 8", new NamedValue("೮", 8));
			put("KANNADA LEFT-TO-RIGHT FULL 9", new NamedValue("೯", 9));

			put("TAMIL LEFT-TO-RIGHT FULL 0", new NamedValue("௦", 0));
			put("TAMIL LEFT-TO-RIGHT FULL 1", new NamedValue("௧", 1));
			put("TAMIL LEFT-TO-RIGHT FULL 2", new NamedValue("௨", 2));
			put("TAMIL LEFT-TO-RIGHT FULL 3", new NamedValue("௩", 3));
			put("TAMIL LEFT-TO-RIGHT FULL 4", new NamedValue("௪", 4));
			put("TAMIL LEFT-TO-RIGHT FULL 5", new NamedValue("௫", 5));
			put("TAMIL LEFT-TO-RIGHT FULL 6", new NamedValue("௬", 6));
			put("TAMIL LEFT-TO-RIGHT FULL 7", new NamedValue("௭", 7));
			put("TAMIL LEFT-TO-RIGHT FULL 8", new NamedValue("௮", 8));
			put("TAMIL LEFT-TO-RIGHT FULL 9", new NamedValue("௯", 9));

			put("TELUGU LEFT-TO-RIGHT FULL 0", new NamedValue("౦", 0));
			put("TELUGU LEFT-TO-RIGHT FULL 1", new NamedValue("౧", 1));
			put("TELUGU LEFT-TO-RIGHT FULL 2", new NamedValue("౨", 2));
			put("TELUGU LEFT-TO-RIGHT FULL 3", new NamedValue("౩", 3));
			put("TELUGU LEFT-TO-RIGHT FULL 4", new NamedValue("౪", 4));
			put("TELUGU LEFT-TO-RIGHT FULL 5", new NamedValue("౫", 5));
			put("TELUGU LEFT-TO-RIGHT FULL 6", new NamedValue("౬", 6));
			put("TELUGU LEFT-TO-RIGHT FULL 7", new NamedValue("౭", 7));
			put("TELUGU LEFT-TO-RIGHT FULL 8", new NamedValue("౮", 8));
			put("TELUGU LEFT-TO-RIGHT FULL 9", new NamedValue("౯", 9));

			put("TIBETAN LEFT-TO-RIGHT FULL 0", new NamedValue("༠", 0));
			put("TIBETAN LEFT-TO-RIGHT FULL 1", new NamedValue("༡", 1));
			put("TIBETAN LEFT-TO-RIGHT FULL 2", new NamedValue("༢", 2));
			put("TIBETAN LEFT-TO-RIGHT FULL 3", new NamedValue("༣", 3));
			put("TIBETAN LEFT-TO-RIGHT FULL 4", new NamedValue("༤", 4));
			put("TIBETAN LEFT-TO-RIGHT FULL 5", new NamedValue("༥", 5));
			put("TIBETAN LEFT-TO-RIGHT FULL 6", new NamedValue("༦", 6));
			put("TIBETAN LEFT-TO-RIGHT FULL 7", new NamedValue("༧", 7));
			put("TIBETAN LEFT-TO-RIGHT FULL 8", new NamedValue("༨", 8));
			put("TIBETAN LEFT-TO-RIGHT FULL 9", new NamedValue("༩", 9));

			put("URDU RIGHT-TO-LEFT FULL 0", new NamedValue("۰", 0));
			put("URDU RIGHT-TO-LEFT FULL 1", new NamedValue("۱", 1));
			put("URDU RIGHT-TO-LEFT FULL 2", new NamedValue("۲", 2));
			put("URDU RIGHT-TO-LEFT FULL 3", new NamedValue("۳", 3));
			put("URDU RIGHT-TO-LEFT FULL 4", new NamedValue("۴", 4));
			put("URDU RIGHT-TO-LEFT FULL 5", new NamedValue("۵", 5));
			put("URDU RIGHT-TO-LEFT FULL 6", new NamedValue("۶", 6));
			put("URDU RIGHT-TO-LEFT FULL 7", new NamedValue("۷", 7));
			put("URDU RIGHT-TO-LEFT FULL 8", new NamedValue("۸", 8));
			put("URDU RIGHT-TO-LEFT FULL 9", new NamedValue("۹", 9));

			put("KHMER LEFT-TO-RIGHT FULL 0", new NamedValue("០", 0));
			put("KHMER LEFT-TO-RIGHT FULL 1", new NamedValue("១", 1));
			put("KHMER LEFT-TO-RIGHT FULL 2", new NamedValue("២", 2));
			put("KHMER LEFT-TO-RIGHT FULL 3", new NamedValue("៣", 3));
			put("KHMER LEFT-TO-RIGHT FULL 4", new NamedValue("៤", 4));
			put("KHMER LEFT-TO-RIGHT FULL 5", new NamedValue("៥", 5));
			put("KHMER LEFT-TO-RIGHT FULL 6", new NamedValue("៦", 6));
			put("KHMER LEFT-TO-RIGHT FULL 7", new NamedValue("៧", 7));
			put("KHMER LEFT-TO-RIGHT FULL 8", new NamedValue("៨", 8));
			put("KHMER LEFT-TO-RIGHT FULL 9", new NamedValue("៩", 9));

			put("BURMESE LEFT-TO-RIGHT FULL 0", new NamedValue("၀", 0));
			put("BURMESE LEFT-TO-RIGHT FULL 1", new NamedValue("၁", 1));
			put("BURMESE LEFT-TO-RIGHT FULL 2", new NamedValue("၂", 2));
			put("BURMESE LEFT-TO-RIGHT FULL 3", new NamedValue("၃", 3));
			put("BURMESE LEFT-TO-RIGHT FULL 4", new NamedValue("၄", 4));
			put("BURMESE LEFT-TO-RIGHT FULL 5", new NamedValue("၅", 5));
			put("BURMESE LEFT-TO-RIGHT FULL 6", new NamedValue("၆", 6));
			put("BURMESE LEFT-TO-RIGHT FULL 7", new NamedValue("၇", 7));
			put("BURMESE LEFT-TO-RIGHT FULL 8", new NamedValue("၈", 8));
			put("BURMESE LEFT-TO-RIGHT FULL 9", new NamedValue("၉", 9));

			put("SINHALA LEFT-TO-RIGHT FULL 0", new NamedValue("෦", 0));
			put("SINHALA LEFT-TO-RIGHT FULL 1", new NamedValue("෧", 1));
			put("SINHALA LEFT-TO-RIGHT FULL 2", new NamedValue("෨", 2));
			put("SINHALA LEFT-TO-RIGHT FULL 3", new NamedValue("෩", 3));
			put("SINHALA LEFT-TO-RIGHT FULL 4", new NamedValue("෪", 4));
			put("SINHALA LEFT-TO-RIGHT FULL 5", new NamedValue("෫", 5));
			put("SINHALA LEFT-TO-RIGHT FULL 6", new NamedValue("෬", 6));
			put("SINHALA LEFT-TO-RIGHT FULL 7", new NamedValue("෭", 7));
			put("SINHALA LEFT-TO-RIGHT FULL 8", new NamedValue("෮", 8));
			put("SINHALA LEFT-TO-RIGHT FULL 9", new NamedValue("෯", 9));

			put("VAI LEFT-TO-RIGHT FULL 0", new NamedValue("꘠", 0));
			put("VAI LEFT-TO-RIGHT FULL 1", new NamedValue("꘡", 1));
			put("VAI LEFT-TO-RIGHT FULL 2", new NamedValue("꘢", 2));
			put("VAI LEFT-TO-RIGHT FULL 3", new NamedValue("꘣", 3));
			put("VAI LEFT-TO-RIGHT FULL 4", new NamedValue("꘤", 4));
			put("VAI LEFT-TO-RIGHT FULL 5", new NamedValue("꘥", 5));
			put("VAI LEFT-TO-RIGHT FULL 6", new NamedValue("꘦", 6));
			put("VAI LEFT-TO-RIGHT FULL 7", new NamedValue("꘧", 7));
			put("VAI LEFT-TO-RIGHT FULL 8", new NamedValue("꘨", 8));
			put("VAI LEFT-TO-RIGHT FULL 9", new NamedValue("꘩", 9));

			put("OSMANYA LEFT-TO-RIGHT FULL 0", new NamedValue("𐒠", 0));
			put("OSMANYA LEFT-TO-RIGHT FULL 1", new NamedValue("𐒡", 1));
			put("OSMANYA LEFT-TO-RIGHT FULL 2", new NamedValue("𐒢", 2));
			put("OSMANYA LEFT-TO-RIGHT FULL 3", new NamedValue("𐒣", 3));
			put("OSMANYA LEFT-TO-RIGHT FULL 4", new NamedValue("𐒤", 4));
			put("OSMANYA LEFT-TO-RIGHT FULL 5", new NamedValue("𐒥", 5));
			put("OSMANYA LEFT-TO-RIGHT FULL 6", new NamedValue("𐒦", 6));
			put("OSMANYA LEFT-TO-RIGHT FULL 7", new NamedValue("𐒧", 7));
			put("OSMANYA LEFT-TO-RIGHT FULL 8", new NamedValue("𐒨", 8));
			put("OSMANYA LEFT-TO-RIGHT FULL 9", new NamedValue("𐒩", 9));

			put("HMONG LEFT-TO-RIGHT FULL 0", new NamedValue("𖭐", 0));
			put("HMONG LEFT-TO-RIGHT FULL 1", new NamedValue("𖭑", 1));
			put("HMONG LEFT-TO-RIGHT FULL 2", new NamedValue("𖭒", 2));
			put("HMONG LEFT-TO-RIGHT FULL 3", new NamedValue("𖭓", 3));
			put("HMONG LEFT-TO-RIGHT FULL 4", new NamedValue("𖭔", 4));
			put("HMONG LEFT-TO-RIGHT FULL 5", new NamedValue("𖭕", 5));
			put("HMONG LEFT-TO-RIGHT FULL 6", new NamedValue("𖭖", 6));
			put("HMONG LEFT-TO-RIGHT FULL 7", new NamedValue("𖭗", 7));
			put("HMONG LEFT-TO-RIGHT FULL 8", new NamedValue("𖭘", 8));
			put("HMONG LEFT-TO-RIGHT FULL 9", new NamedValue("𖭙", 9));

			put("SUNDANESE LEFT-TO-RIGHT FULL 0", new NamedValue("᮰", 0));
			put("SUNDANESE LEFT-TO-RIGHT FULL 1", new NamedValue("᮱", 1));
			put("SUNDANESE LEFT-TO-RIGHT FULL 2", new NamedValue("᮲", 2));
			put("SUNDANESE LEFT-TO-RIGHT FULL 3", new NamedValue("᮳", 3));
			put("SUNDANESE LEFT-TO-RIGHT FULL 4", new NamedValue("᮴", 4));
			put("SUNDANESE LEFT-TO-RIGHT FULL 5", new NamedValue("᮵", 5));
			put("SUNDANESE LEFT-TO-RIGHT FULL 6", new NamedValue("᮶", 6));
			put("SUNDANESE LEFT-TO-RIGHT FULL 7", new NamedValue("᮷", 7));
			put("SUNDANESE LEFT-TO-RIGHT FULL 8", new NamedValue("᮸", 8));
			put("SUNDANESE LEFT-TO-RIGHT FULL 9", new NamedValue("᮹", 9));

			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 0", new NamedValue("০", 0));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 1", new NamedValue("১", 1));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 2", new NamedValue("২", 2));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 3", new NamedValue("৩", 3));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING WRONG 8", new NamedValue("৪", 8));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 5", new NamedValue("৫", 5));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 6", new NamedValue("৬", 6));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING WRONG 9", new NamedValue("৭", 9));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 8", new NamedValue("৮", 8));
			put("BENGALI-ASSAMESE LEFT-TO-RIGHT MISSING 9", new NamedValue("৯", 9));

			put("MALAYALAM LEFT-TO-RIGHT MISSING 0", new NamedValue("൦", 0));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 1", new NamedValue("൧", 1));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 2", new NamedValue("൨", 2));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 3", new NamedValue("൩", 3));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 4", new NamedValue("൪", 4));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 5", new NamedValue("൫", 5));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 6", new NamedValue("൬", 6));
			put("MALAYALAM LEFT-TO-RIGHT MISSING WRONG 9", new NamedValue("൭", 9));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 8", new NamedValue("൮", 8));
			put("MALAYALAM LEFT-TO-RIGHT MISSING 9", new NamedValue("൯", 9));

			put("ODIA LEFT-TO-RIGHT MISSING 0", new NamedValue("୦", 0));
			put("ODIA LEFT-TO-RIGHT MISSING 1", new NamedValue("୧", 1));
			put("ODIA LEFT-TO-RIGHT MISSING WRONG 9", new NamedValue("୨", 9));
			put("ODIA LEFT-TO-RIGHT MISSING 3", new NamedValue("୩", 3));
			put("ODIA LEFT-TO-RIGHT MISSING 4", new NamedValue("୪", 4));
			put("ODIA LEFT-TO-RIGHT MISSING 5", new NamedValue("୫", 5));
			put("ODIA LEFT-TO-RIGHT MISSING 6", new NamedValue("୬", 6));
			put("ODIA LEFT-TO-RIGHT MISSING 7", new NamedValue("୭", 7));
			put("ODIA LEFT-TO-RIGHT MISSING 8", new NamedValue("୮", 8));
			put("ODIA LEFT-TO-RIGHT MISSING 9", new NamedValue("୯", 9));

			put("PUNJABI LEFT-TO-RIGHT MISSING 0", new NamedValue("੦", 0));
			put("PUNJABI LEFT-TO-RIGHT MISSING WRONG 9", new NamedValue("੧", 9));
			put("PUNJABI LEFT-TO-RIGHT MISSING 2", new NamedValue("੨", 2));
			put("PUNJABI LEFT-TO-RIGHT MISSING 3", new NamedValue("੩", 3));
			put("PUNJABI LEFT-TO-RIGHT MISSING WRONG 8", new NamedValue("੪", 8));
			put("PUNJABI LEFT-TO-RIGHT MISSING 5", new NamedValue("੫", 5));
			put("PUNJABI LEFT-TO-RIGHT MISSING 6", new NamedValue("੬", 6));
			put("PUNJABI LEFT-TO-RIGHT MISSING 7", new NamedValue("੭", 7));
			put("PUNJABI LEFT-TO-RIGHT MISSING 8", new NamedValue("੮", 8));
			put("PUNJABI LEFT-TO-RIGHT MISSING 9", new NamedValue("੯", 9));

			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 0", new NamedValue("٠", 0));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 1", new NamedValue("١", 1));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 2", new NamedValue("٢", 2));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 3", new NamedValue("٣", 3));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 4", new NamedValue("٤", 4));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 5", new NamedValue("٥", 5));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 6", new NamedValue("٦", 6));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 7", new NamedValue("٧", 7));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 8", new NamedValue("٨", 8));
			put("EASTERN-ARABIC RIGHT-TO-LEFT FULL 9", new NamedValue("٩", 9));

			put("NKO RIGHT-TO-LEFT MISSING 1", new NamedValue("߁", 1));
			put("NKO RIGHT-TO-LEFT MISSING 2", new NamedValue("߂", 2));
			put("NKO RIGHT-TO-LEFT MISSING 3", new NamedValue("߃", 3));
			put("NKO RIGHT-TO-LEFT MISSING 4", new NamedValue("߄", 4));
			put("NKO RIGHT-TO-LEFT MISSING 5", new NamedValue("߅", 5));
			put("NKO RIGHT-TO-LEFT MISSNIG 6", new NamedValue("߆", 6));
			put("NKO RIGHT-TO-LEFT MISSING 7", new NamedValue("߇", 7));
			put("NKO RIGHT-TO-LEFT MISSING 8", new NamedValue("߈", 8));
			put("NKO RIGHT-TO-LEFT MISSING 9", new NamedValue("߉", 9));

			put("ADLAM RIGHT-TO-LEFT FULL 0", new NamedValue("𞥐", 0));
			put("ADLAM RIGHT-TO-LEFT FULL 1", new NamedValue("𞥑", 1));
			put("ADLAM RIGHT-TO-LEFT FULL 2", new NamedValue("𞥒", 2));
			put("ADLAM RIGHT-TO-LEFT FULL 3", new NamedValue("𞥓", 3));
			put("ADLAM RIGHT-TO-LEFT FULL 4", new NamedValue("𞥔", 4));
			put("ADLAM RIGHT-TO-LEFT FULL 5", new NamedValue("𞥕", 5));
			put("ADLAM RIGHT-TO-LEFT FULL 6", new NamedValue("𞥖", 6));
			put("ADLAM RIGHT-TO-LEFT FULL 7", new NamedValue("𞥗", 7));
			put("ADLAM RIGHT-TO-LEFT FULL 8", new NamedValue("𞥘", 8));
			put("ADLAM RIGHT-TO-LEFT FULL 9", new NamedValue("𞥙", 9));
		}
	});
}
