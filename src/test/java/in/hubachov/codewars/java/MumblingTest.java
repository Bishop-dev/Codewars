package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class MumblingTest {

	private void testing(String actual, String expected) {
		assertEquals(expected, actual);
	}
	private int randInt(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	private String doEx() {
		String res = "";
		int n = -1;
		for (int i = 0; i < 11; i++) {
			if (i % 5 == 0) n = randInt(65, 90);
			else n = randInt(97, 122);
			res += (char)n;
		}
		return res;
	}
	private String accumSol(String s) {
		String[] a = s.toLowerCase().split("");
		String res = "";
		for (int i = 0; i < a.length; i++) {
			res += a[i].toUpperCase();
			for (int j = 1; j < i + 1; j++)
				res += a[i];
			res += "-";
		}
		return res.substring(0, res.length()-1);
	}
	@Test
	public void test() {
		System.out.println("Fixed Tests accum");
		testing(Mumbling.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
		testing(Mumbling.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
		testing(Mumbling.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
		testing(Mumbling.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
		testing(Mumbling.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
		testing(Mumbling.accum("VwhvtHtrxfE"), "V-Ww-Hhh-Vvvv-Ttttt-Hhhhhh-Ttttttt-Rrrrrrrr-Xxxxxxxxx-Ffffffffff-Eeeeeeeeeee");
		testing(Mumbling.accum("KurgiKmkphY"), "K-Uu-Rrr-Gggg-Iiiii-Kkkkkk-Mmmmmmm-Kkkkkkkk-Ppppppppp-Hhhhhhhhhh-Yyyyyyyyyyy");
		testing(Mumbling.accum("NctlfBlnmfH"), "N-Cc-Ttt-Llll-Fffff-Bbbbbb-Lllllll-Nnnnnnnn-Mmmmmmmmm-Ffffffffff-Hhhhhhhhhhh");
		testing(Mumbling.accum("WegunHvbdmV"), "W-Ee-Ggg-Uuuu-Nnnnn-Hhhhhh-Vvvvvvv-Bbbbbbbb-Ddddddddd-Mmmmmmmmmm-Vvvvvvvvvvv");
		testing(Mumbling.accum("VoywwSpqidE"), "V-Oo-Yyy-Wwww-Wwwww-Ssssss-Ppppppp-Qqqqqqqq-Iiiiiiiii-Dddddddddd-Eeeeeeeeeee");
		testing(Mumbling.accum("VbaixFpxdcO"), "V-Bb-Aaa-Iiii-Xxxxx-Ffffff-Ppppppp-Xxxxxxxx-Ddddddddd-Cccccccccc-Ooooooooooo");
		testing(Mumbling.accum("OlyqvYwkuzF"), "O-Ll-Yyy-Qqqq-Vvvvv-Yyyyyy-Wwwwwww-Kkkkkkkk-Uuuuuuuuu-Zzzzzzzzzz-Fffffffffff");
		testing(Mumbling.accum("JrhfdMtchiH"), "J-Rr-Hhh-Ffff-Ddddd-Mmmmmm-Ttttttt-Cccccccc-Hhhhhhhhh-Iiiiiiiiii-Hhhhhhhhhhh");
		testing(Mumbling.accum("JiwpcSwslvW"), "J-Ii-Www-Pppp-Ccccc-Ssssss-Wwwwwww-Ssssssss-Lllllllll-Vvvvvvvvvv-Wwwwwwwwwww");
		testing(Mumbling.accum("EagpiEvmabJ"), "E-Aa-Ggg-Pppp-Iiiii-Eeeeee-Vvvvvvv-Mmmmmmmm-Aaaaaaaaa-Bbbbbbbbbb-Jjjjjjjjjjj");
		testing(Mumbling.accum("RznlcEmuxxP"), "R-Zz-Nnn-Llll-Ccccc-Eeeeee-Mmmmmmm-Uuuuuuuu-Xxxxxxxxx-Xxxxxxxxxx-Ppppppppppp");
		testing(Mumbling.accum("OrggaExarzP"), "O-Rr-Ggg-Gggg-Aaaaa-Eeeeee-Xxxxxxx-Aaaaaaaa-Rrrrrrrrr-Zzzzzzzzzz-Ppppppppppp");
		testing(Mumbling.accum("DriraMtedfB"), "D-Rr-Iii-Rrrr-Aaaaa-Mmmmmm-Ttttttt-Eeeeeeee-Ddddddddd-Ffffffffff-Bbbbbbbbbbb");
		testing(Mumbling.accum("BjxseRxgtjT"), "B-Jj-Xxx-Ssss-Eeeee-Rrrrrr-Xxxxxxx-Gggggggg-Ttttttttt-Jjjjjjjjjj-Ttttttttttt");
		testing(Mumbling.accum("EquhxOswchE"), "E-Qq-Uuu-Hhhh-Xxxxx-Oooooo-Sssssss-Wwwwwwww-Ccccccccc-Hhhhhhhhhh-Eeeeeeeeeee");
	}
	@Test
	public void test1() {
		System.out.println("100 Random Tests");
		for (int i = 0; i < 100; i++) {
			String s1 = doEx();
			//System.out.println(s1);
			String r = accumSol(s1);
			//System.out.println(r);
			//System.out.println("****");
			testing(Mumbling.accum(s1), r);
		}
	}

}