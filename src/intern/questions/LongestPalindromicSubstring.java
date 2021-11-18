package intern.questions;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));

	}

	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String longestPalindromicSubstring = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (j - i > longestPalindromicSubstring.length() && isPalindrome(s.substring(i, j))) {
					longestPalindromicSubstring = s.substring(i, j);
				}
			}
		}

		return longestPalindromicSubstring;
	}

	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}

		return true;
	}

}
