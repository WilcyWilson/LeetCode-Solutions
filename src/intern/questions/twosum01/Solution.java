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
