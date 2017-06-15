package in.hubachov.codewars.java;

/**
 * This time no story, no theory. The examples below show you how to write function accum:

 Examples:

 Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 The parameter of accum is a string which includes only letters from a..z and A..Z.


 * Created by Sashko on 6/15/17.
 */
public class Mumbling {

	public static String accum(String s) {
		final StringBuilder result = new StringBuilder();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			final String str = "" + chars[i];
			if (i != 0) {
				result.append("-");
			}
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					result.append(str.toUpperCase());
				} else {
					result.append(str.toLowerCase());
				}
			}
		}
		return result.toString();
	}

}
