## [9. Palindrome Number](https://leetcode.com/problems/palindrome-number)

## Solution

```java
	package intern.questions.palindromenumber09;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(121));
	}

	public boolean isPalindrome(int x) {
		int temp = x;
		int res = 0;
		while (x != 0) {
			res = res * 10 + (x % 10);
			x /= 10;
		}
		if (res < 0) {
			return false;
		}
		if (temp == res) {
			return true;
		}
		return false;
	}

}
```