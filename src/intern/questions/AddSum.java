package intern.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddSum {

	public static void main(String[] args) {
		System.out.println(new AddSum().Sum("34567"));
	}

	public long Sum(String s) {
		long add = 0;
		long temp = 0;
		List<Integer> list = Arrays.stream(arrayReturn(s)).boxed().collect(Collectors.toList());
		do {
			add += list.get(0) * list.get((list.size() - 1));
			list.remove(0);
			list.remove(list.size() - 1);
			if (list.size() == 1) {
				add += list.get(0);
				list.remove(0);
			}
			temp = add;
			if (countDigit(add) > 1 && list.size() == 0) {
				list = Arrays.stream(arrayReturn(String.valueOf(add))).boxed().collect(Collectors.toList());
				add = 0;
			}
		} while (countDigit(temp) > 1);
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
