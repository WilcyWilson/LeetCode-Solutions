## [1. Two Sum](https://leetcode.com/problems/two-sum/)

## Solution

```java
package intern.questions.twosum01;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n, target;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter the target: ");
		target = sc.nextInt();
		int[] array2 = new Solution().twoSum(array, target);
		System.out.println("The output ");
		System.out.println("[" + array2[0] + "," + array2[1] + "]");
	}

// On my own
	/*
	public int[] twoSum(int[] nums, int target) {
		int[] array = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					array[0] = i;
					array[1] = j;
					break;
				}
			}
		}
		return array;
	}
	*/
	// from the internet
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
// Key,Value Pair
// target = 9, 9 - 2 = 7, 9 - 7 = 2
// Key = 2, Value = 0 , HashMap<2,0>
// map.containsKey(9-7=2)true
// result[1] = 1
// result[0] = map.get(9-7=2) = HashMap<2,0> = 0
// return result
```

