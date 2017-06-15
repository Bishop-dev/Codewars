package in.hubachov.codewars.java;

/**
 * Description:

 Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
 development and functioning of living organisms.

 If you want to know more http://en.wikipedia.org/wiki/DNA

 In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side
 of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or
 there is no DNA at all (again, except for Haskell).

 DnaStrand.makeComplement("ATTGC") // return "TAACG"

 DnaStrand.makeComplement("GTAT") // return "CATA"

 * Created by Sashko on 6/15/17.
 */
public class DNA {

/*
	private static HashMap<Character, Character> map = new HashMap<>(4);

	static {
		map.put('A', 'T');
		map.put('T', 'A');
		map.put('C', 'G');
		map.put('G', 'C');
	}

	public static String makeComplement(String dna) {
		return dna.chars().mapToObj(c -> String.valueOf(map.get((char) c))).collect(Collectors.joining());
	}
*/

	public static String makeComplement(String dna) {
		final StringBuilder result = new StringBuilder();
		dna.chars().mapToObj(i -> "" + (char) i).forEach(s -> {
			switch (s) {
				case "T":
					result.append("A");
					break;
				case "A":
					result.append("T");
					break;
				case "G":
					result.append("C");
					break;
				case "C":
					result.append("G");
					break;
				default:
					break;
			}
		});
		return result.toString();
	}

}
