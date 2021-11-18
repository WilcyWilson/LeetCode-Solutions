package intern.questions;

public class QuadrupuletSubstring {
	public static void main(String[] args) {
		System.out.println(new QuadrupuletSubstring().convert("ABCDEFGH"));
	}

	public String convert(String s) {
		String s1 = "";
		String s2 = "";
		if (s.length() < 4) {
			return s;
		}
		int len = s.length();
		int chlen = s.length();
		for (int i = 0; i <= len; i += 4) {
			s1 = s.substring(i, i + 4);
			char[] oldChar = s1.toCharArray();
			char[] newChar = new char[oldChar.length];
			newChar[0] = oldChar[2];
			newChar[1] = oldChar[3];
			newChar[2] = oldChar[0];
			newChar[3] = oldChar[1];
			s2 += String.valueOf(newChar);
			chlen -= 4; 
			if (chlen < 4) {
				s2 += s.substring(i + 4, s.length());
				break;
			}
		}
		return s2;
	}
}