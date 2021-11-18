//A substring is a contiguous (non-empty) sequence of characters within a string.
//
//A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
//
//Given a string word, return the number of vowel substrings in word.
//
// 
//
//Example 1:
//
//Input: word = "aeiouu"
//Output: 2
//Explanation: The vowel substrings of word are as follows (underlined):
//- "aeiouu"
//- "aeiouu"
//Example 2:
//
//Input: word = "unicornarihan"
//Output: 0
//Explanation: Not all 5 vowels are present, so there are no vowel substrings.
//Example 3:
//
//Input: word = "cuaieuouac"
//Output: 7
//Explanation: The vowel substrings of word are as follows (underlined):
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//- "cuaieuouac"
//Example 4:
//
//Input: word = "bbaeixoubb"
//Output: 0
//Explanation: The only substrings that contain all five vowels also contain consonants, so there are no vowel substrings.

package intern.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountVowelSubstringsofaString {

	public static void main(String[] args) {
		System.out.println(new CountVowelSubstringsofaString().countVowelSubstrings("aeouisddaaeeiouua"));
	}

	public int countVowelSubstrings(String word) {
		int vowelSubstrings = 0;
		List<String> subStrings = SubString(word, word.length());
		for (int i = 0; i < subStrings.size(); i++) {
			HashSet<Character> ch = new HashSet<Character>();
			Boolean isVowel = true;
			ch.add('a');
			ch.add('e');
			ch.add('i');
			ch.add('o');
			ch.add('u');
			for (int j = 0; j < subStrings.get(i).length(); j++) {
				char c = subStrings.get(i).charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					ch.remove(c);
				} else {
					isVowel = false;
					break;
				}
			}
			if (ch.isEmpty() && isVowel) {
				vowelSubstrings += 1;
			}
		}
		return vowelSubstrings;
	}

	public static List<String> SubString(String str, int n) {
		List<String> subStrings = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				subStrings.add(str.substring(i, j));
		return subStrings;
	}
}