package intern.questions.twofurthesthouseswithdifferentcolors2078;

import java.util.Collections;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] colors = { 1, 1, 1, 6, 1, 1, 1 };
		System.out.println(new Solution().maxDistance(colors));

	}

	public int maxDistance(int[] colors) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int max = 0;
		for (int i = colors.length - 1; i >= 0; i--) {
			if (colors[0] != colors[i]) {
				hs.add(i);
				break;
			}
		}
		for (int j = 0; j < colors.length; j++) {
			if (colors[j] != colors[colors.length - 1]) {
				hs.add((colors.length - 1) - j);
				break;
			}
		}
		return Collections.max(hs);
	}
}
//Storing values in HashSet and finding maximum of the stored values.

