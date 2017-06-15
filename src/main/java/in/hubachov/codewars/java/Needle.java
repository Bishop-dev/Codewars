package in.hubachov.codewars.java;

/**
 *
 * Can you find the needle in the haystack?

 Write a function findNeedle() that takes an array full of junk but containing one "needle"

 After your function finds the needle it should return a message (as a string) that says:

 "found the needle at position " plus the index it found the needle

 So

 find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
 find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
 findNeedle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
 findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
 find_needle(["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"])
 should return

 'found the needle at position 5'
 'found the needle at position 5'
 'found the needle at position 5'
 "found the needle at position 5"
 "found the needle at position 5"

 * Created by Sashko on 6/15/17.
 */
public class Needle {

	public static String findNeedle(Object[] haystack) {
		int index = 0;
		for (int i = 0; i < haystack.length; i++) {
			if ("needle".equals(haystack[i])) {
				index = i;
				break;
			}
		}
		return "found the needle at position " + index;
	}

}
