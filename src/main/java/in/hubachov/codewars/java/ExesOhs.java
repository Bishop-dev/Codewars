package in.hubachov.codewars.java;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case
 * insensitive. The string can contains any char.

 Examples input/output:

 XO("ooxx") => true
 XO("xooxx") => false
 XO("ooxXm") => true
 XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 XO("zzoo") => false

 * Created by Sashko on 6/15/17.
 */
public class ExesOhs {

	/*
	public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
	 */

	public static boolean getXO (String str) {
		int o = 0;
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			final char c = str.charAt(i);
			if ('o' == c || 'O' == c) {
				o++;
			} else if ('x' == c || 'X' == c) {
				x++;
			}
		}
		return x == o;
	}

}
