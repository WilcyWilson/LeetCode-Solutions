//Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
//
//A substring is a contiguous (non-empty) sequence of characters within a string.
//
//Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
//
// 
//
//Example 1:
//
//Input: word = "aba"
//Output: 6
//Explanation: 
//All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
//- "b" has 0 vowels in it
//- "a", "ab", "ba", and "a" have 1 vowel each
//- "aba" has 2 vowels in it
//Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6. 
//Example 2:
//
//Input: word = "abc"
//Output: 3
//Explanation: 
//All possible substrings are: "a", "ab", "abc", "b", "bc", and "c".
//- "a", "ab", and "abc" have 1 vowel each
//- "b", "bc", and "c" have 0 vowels each
//Hence, the total sum of vowels = 1 + 1 + 1 + 0 + 0 + 0 = 3. 
//Example 3:
//
//Input: word = "ltcd"
//Output: 0
//Explanation: There are no vowels in any substring of "ltcd".
//Example 4:
//
//Input: word = "noosabasboosa"
//Output: 237
//Explanation: There are a total of 237 vowels in all the substrings.
// 
//
//Constraints:
//
//1 <= word.length <= 105
//word consists of lowercase English letters.

package intern.questions;

import java.util.ArrayList;
import java.util.List;

public class VowelsOfAllSubstrings {

	public static void main(String[] args) {
		System.out.println(new VowelsOfAllSubstrings().countVowels("noosabasboosa"));
	}

	public long countVowels(String word) {
		long vowels = 0;
		List<String> subStrings = SubString(word, word.length());
		for (String temp : subStrings) {
			for (int i = 0; i < temp.length(); i++) {
				char c = temp.charAt(i);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels += 1;
				}
			}
		}
		return vowels;
	}

	public static List<String> SubString(String str, int n) {
		List<String> subStrings = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				subStrings.add(str.substring(i, j));
		return subStrings;
	}
}
