## [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Solution

```java
	package intern.questions.reverseinteger07;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().reverse(-214748364));
	}

	public int reverse(int x) {
	    int res = 0;
	    while(x!=0){
	        if(res>(Integer.MAX_VALUE/10) || res<(Integer.MIN_VALUE/10))
	            return 0;
	        res = res*10 + (x%10);
	        x /= 10;
	    }
	    return res;
	}
}
```