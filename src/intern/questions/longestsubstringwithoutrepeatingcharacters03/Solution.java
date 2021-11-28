package intern.questions.longestsubstringwithoutrepeatingcharacters03;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));

	}

	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
		int start = 0;
		int max_length = 0;
		for (int end = 0; end < s.length(); end++) {
			if (seen.containsKey(s.charAt(end))) {
				start = Math.max(start, seen.get(s.charAt(end)) + 1);
			}
			seen.put(s.charAt(end), end);
			max_length = Math.max(max_length, end - start + 1);
		}
		return max_length;
	}
}
// Sliding Window Technique
// s = "abcabcbb"
// seen = (a,0), max_length = (0,0-0+1) = 1
// seen = (b,1), max_length = 2
// seen = (c,2), max_length = 3
// containsKey(a), start = (0,0+1) = 1, seen(a,3), max_length = 3-1+1
// containsKey(b), start = (1,1+1) = 2, seen(b,4), max_length = 4-2+1 =3
