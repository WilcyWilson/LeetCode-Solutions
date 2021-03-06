package intern.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddSum {

	public static void main(String[] args) {
		System.out.println(new AddSum().Sum(3456));
	}

	public int Sum(int input) {
		Integer a = input;
		String s = a.toString();
		int add = 0;
		List<Integer> list = Arrays.stream(arrayReturn(s)).boxed().collect(Collectors.toList());
		do {
			add += list.get(0) * list.get((list.size() - 1));
			list.remove(0);
			list.remove(list.size() - 1);
			if (list.size() == 1) {
				add += list.get(0);
				list.remove(0);
			}
			if (countDigit(add) > 1 && list.size() == 0) {
				list = Arrays.stream(arrayReturn(String.valueOf(add))).boxed().collect(Collectors.toList());
				add = 0;
			}
		} while (list.size() > 1);
		return add;
	}

	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	static int[] arrayReturn(String s) {
		String[] str = s.split("");
		int[] arr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.valueOf(str[i]);
		}
		return arr;
	}

}
