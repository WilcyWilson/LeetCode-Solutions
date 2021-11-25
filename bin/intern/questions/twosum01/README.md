## 1. Two Sum

## Problem

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

## Solution

```java
package intern.questions.twosum01;

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

}
```
