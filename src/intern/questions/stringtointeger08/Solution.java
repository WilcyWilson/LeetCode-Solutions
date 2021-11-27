package intern.questions.stringtointeger08;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().myAtoi("+-"));
	}

//-12 = -12
//-a12 = 0
// 123 asd = 123
// asdd 123 = 0
	public int myAtoi(String s) {
		String str = s.trim();
		long res = 0;
		if (str.isEmpty() || ((str.charAt(0) == '-' || str.charAt(0) == '+')  && str.length() == 1)) {
			return 0;
		}
		if((str.charAt(0) == '-' && str.charAt(1) == '+' && str.length() == 2) || (str.charAt(0) == '+' && str.charAt(1) == '-' && str.length() == 2)){
			return 0;
		}
		if (str.charAt(0) == '-' || Character.isDigit(str.charAt(0)) || str.charAt(0) == '+') {
			for (int i = 2; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(1)) && str.charAt(0) != '-' && str.charAt(0) != '+') {
					res = Long.parseLong(s.substring(0, i - 1));
					return (int) isLarge(res);
				} else if (!Character.isDigit(str.charAt(1))) {
					return 0;
				} else if (!Character.isDigit(str.charAt(i))) {
					res = Long.parseLong(s.substring(0, i));
					return (int) isLarge(res);
				}
			}
		} else {
			return 0;
		}
		res = Long.parseLong(s.trim().replaceAll("[^0-9-]", ""));
		return (int) isLarge(res);
	}

	public static long isLarge(long res) {
		if (res > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (res < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else {
			return res;
		}
	}

//	public int myAtoi(String s) {
//		String str = s.trim();
//		long res = 0;
//		if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-') {
//			return 0;
//		}
//		for (int i = 0; i < str.length(); i++) {
//			if (!Character.isDigit(str.charAt(i)) && str.charAt(0) != '-') {
//				res = Long.parseLong(s.substring(0, i));
//				return (int)isLarge(res);
//			}
//		}
//		res = Long.parseLong(s.trim().replaceAll("[^0-9-]", ""));
//		return (int)isLarge(res);
//	}
//
//	public static long isLarge(long res) {
//		if (res > Integer.MAX_VALUE) {
//			return Integer.MAX_VALUE;
//		} else if (res < Integer.MIN_VALUE) {
//			return Integer.MIN_VALUE;
//		} else {
//			return res;
//		}
//	}
}
